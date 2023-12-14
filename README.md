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