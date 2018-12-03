# car-rental-api

Simple api, written only for learning programming
In project I use springboot.

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






















#### GET /cars
response html status: 200 
response body:

```json
[
  {
    "id": 1,
    "registrationNumber": "TK 9999",
    "model": "WV Passat",
    "color": "red"
  },
  {
    "id": 2,
    "registrationNumber": "TK 9998",
    "model": "WV Passat",
    "color": "blue"
  },
]
```



#### GET /cars/1
response html status: 200 
response body:
```json
{
  "id": 1,
  "registrationNumber": "TK 9999",
  "model": "WV Passat",
  "color": "red"
}

```

#### POST /cars
request data: 
```json
{
  "model" : "WV Passat",
  "registrationNumber": "TKI 2",
  "color" : "pink"
}
```
response html status: 201
response body:
```json
{
  "id": 3,
  "registrationNumber": "TKI 2",
  "model": "WV Passat",
  "color": "pink"
}
```
#### PUT /cars/3
request data: 
```json
{
  "registrationNumber": "TKI 2",
  "model": "WV Passat",
  "color": "silver"
}
```
response html status: 200
response body:
```json
{
  "id": 3,
  "registrationNumber": "TKI 2",
  "model": "WV Passat",
  "color": "silver"
}
```

#### DELETE /cars/1
response html status: 204















#### GET /rentals
response html status: 200 
response body:

```json
[
  {
    "id": 1,
    "startRental": 1497650400000,
    "endRental": 1497045600000,
    "user": 1,
    "car": 1
  },
  {
    "id": 2,
    "startRental": 1185937200000,
    "endRental": 1185937200000,
    "user": 1,
    "car": 1
  },
]
```



#### GET /rentals/1
response html status: 200 
response body:
```json
{
  "id": 1,
  "startRental": 1497650400000,
  "endRental": 1497045600000,
  "user": 1,
  "car": 1
}

```

#### POST /rentals
request data: 
```json
{
	"startRental" : "1185937200000",
	"endRental" : "1185937200000",
	"car" : 2,
	"user" : 2
}
```
response html status: 201
response body:
```json
{
  "id": 3,
  "startRental": 1185937200000,
  "endRental": null,
  "user": 2,
  "car": 2
}
```
#### PUT /rentals/3
request data: 
```json
{
  "startRental": 1185937200000,
  "endRental": 1185937200000,
  "user": 2,
  "car": 2
}
```
response html status: 200
response body:
```json
{
  "id": 3,
  "startRental": 1185937200000,
  "endRental": 1185937200000,
  "user": 2,
  "car": 2
}
```

#### DELETE /rentals/1
response html status: 204

