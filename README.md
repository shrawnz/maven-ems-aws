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



**View Employee**
  ----
  View data of a particular employee;

  * **URL**

    /view

  * **Method:**

    `GET`

  *  **URL Params**

     **Required:**

     `id=[String]`

  * **Success Response:**

    * **Code:** 200 <br />
      **Content:** `{
                      id: <id>,
                      name: <name>,
                      department: <department>,
                      email: <email>
                    }`

  * **Error Response:**

    * **Content:** `{ error : <error msg> }`


  **View Employees**
      ----
      View data of all employees;

      * **URL**

        /employees

      * **Method:**

        `GET`

      *  **URL Params**

          None

      * **Success Response:**

        * **Code:** 200 <br />
          **Content:** `[{
                          id: <id>,
                          name: <name>,
                          department: <department>,
                          email: <email>
                        }]`

      * **Error Response:**

        * **Content:** `{ error : <error msg> }`
