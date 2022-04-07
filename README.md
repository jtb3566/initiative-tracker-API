# initiative-tracker-db

## Description

This is a RESTful API to perfom CRUD operations on character and encounter data stored in a local mySQL database.

This API was created to work with the initiative tracker webapp found at [https://github.com/jtb3566/initiative-tracker-webapp](https://github.com/jtb3566/initiative-tracker-webapp)

## Accepted Calls

initiative-tracker-db defaults to hosting at port:8080. 

All api calls start at http://localhost:8080/api

### /encounter

Aside from /getAll these calls all take in one encounter parameter of the form:

`
encounter = {
  "name": String,
  "characters": []Character
  "monsters": String
}
`
#### /create

- saves encounter data to database as a new entry
- returns the saved encounter

#### /getAll

- returns an array of all encounters in the database

#### /delete

- deletes encounter data from database 
- returns on a boolean confirming if data was able to be deleted or not

#### /addCharacter

-
