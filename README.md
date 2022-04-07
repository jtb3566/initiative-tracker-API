# initiative-tracker-db

## Description

This is a RESTful API to perfom CRUD operations on character and encounter data stored in a local mySQL database.

This API was created to work with the initiative tracker webapp found at [https://github.com/jtb3566/initiative-tracker-webapp](https://github.com/jtb3566/initiative-tracker-webapp)

## Setup

modify database settings in src\main\resources\application.properties to connect to local mySQL database

ex:  

`spring.datasource.url=jdbc:mysql://localhost:3306/initiative-tracker-db  

spring.datasource.username=initiative-tracker-db  

spring.datasource.password=password`

## Available Scripts

### `./gradlew bootRun`

Runs the app. Default port is localhost:8080


