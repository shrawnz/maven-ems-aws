# Employee Management System Rest API Documentation
http://13.58.24.90:8080/maven-ems-json/

**Add Employees**
----
  Inserts a new employee into the database;

* **URL**

  /add <br/>
  /addJson (To send parameters as a json in the HTML body)

* **Method:**

  `POST`

*  **URL Params**

   **Required:**

   `name=[String]`
   `department=[String]`
   `email=[String]`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
                    inserted : true,
                    id: <id>
                  }`

* **Error Response:**

  * **Content:** `{ error : <error msg> }`

