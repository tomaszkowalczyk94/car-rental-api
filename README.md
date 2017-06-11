# car-rental-api

## Examples:

#### GET /users
response html status: 200 
response body:

```json
[
  {
    "id": 1,
    "email": "test@test.pl",
    "username": "test1",
    "firstName": "test1",
    "lastName": "test1"
  },
  {
    "id": 2,
    "email": "test2@test.pl",
    "username": "test2",
    "firstName": "test2",
    "lastName": "test2"
  }
]
```



#### GET /users/1
response html status: 200 
response body:
```json
{
  "id": 1,
  "email": "test@test.pl",
  "username": "test1",
  "firstName": "test1",
  "lastName": "test1"
}

```

#### POST /users
request data: 
```json
{
	"username" : "test3",
	"email" : "test3@test.pl",
	"firstName" : "test3",
	"lastName" : "test3"
}
```
response html status: 201
response body:
```json
{
  "id": 3,
  "email": "test3@test.pl",
  "username": "test3",
  "firstName": "test3",
  "lastName": "test3"
}
```
#### PUT /users/1
request data: 
```json
{
	"username" : "test1edit",
	"email" : "test3@test.pl",
	"firstName" : "test3",
	"lastName" : "test3"
}
```
response html status: 200
response body:
```json
{
  "id": 3,
  "email": "test3@test.pl",
  "username": "test3",
  "firstName": "test3",
  "lastName": "test3"
}
```

#### DELETE /users/1
response html status: 204

