package com.wynk.maven.controllers;

import java.util.Iterator;

import org.bson.BSON;
import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;

public class MongoController {
	
	private MongoClient client = null;
	private MongoDatabase db = null;
	private MongoCollection<Document> collection = null;
	
	public MongoController(String db, String collection) {
		this.client = new MongoClient("localhost", 27017);
		this.db = client.getDatabase(db);
		this.collection = this.db.getCollection(collection);
	}
	
	public MongoCollection<Document> getCollection() {
		return this.collection;
	}
	
	public void insertDoc(Document doc) {
		this.collection.insertOne(doc);
	}
	
	public Iterator<Document> find(Bson filter) {
		FindIterable<Document> iterDocs = this.collection.find(filter);
		Iterator<Document> iterator = iterDocs.iterator();
		
		return iterator;
	}
	
	public void updateDoc(Bson filter, Bson update, Boolean isUpsert) {
		UpdateOptions options = new UpdateOptions().upsert(isUpsert);
		this.collection.updateOne(filter, update, options);
	}
}
