# HTPP - Appel pour faire l'authentification

1. POST localhost:8080/authenticate
  ````
Body:
   {
        "username": "foo",
        "password": "foo"
   }
  ````

2. GET localhost:8080/
  ````
Header:
   Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzd....
  ````

3. GET localhost:8080/user
  ````
Header:
   Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzd....
  ````

4. GET localhost:8080/admin
  ````
Header:
   Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzd....
  ````

## Docker
1. docker pull mysql:8.2.0
2. docker run -p 3306:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=springsecurity mysql:8.2.0

# MySql client
1. Install and start MySql Workbench
    