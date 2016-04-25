# Challenge

## Environment

URL: http://ec2-52-51-2-11.eu-west-1.compute.amazonaws.com:8080/Challenge/

## BasicAuthentication:
* Username: **challenge**
* Passworord: **challenge**

## REST API

### List Twit

Path: /read/{userId}

Method: GET

Description: reads the tweets for a given user (include self-tweets and people being followed by the user)

Path: /read/{userId}?search={text}

Method: GET

Description: reads the tweets for a given user (include self-tweets and people being followed by the user) filtering tweets based on keyword.

### Follow

Path: /follow

Method: PUT Consumes: JSON

Description: starts following another user

JSON Example:

`{"id":1,"idUser":1,"idFollower":1}`

### Unfollow

Path: /unfollow

Method: POST Consumes: JSON

Description: starts following another user

JSON Example:

`{"id":1,"idUser":1,"idFollower":1}`

### Users

Path: /readfollowers/{userId}

Method: GET

Description: followers of the user

Path: /readfollowing/{userId}

Method: GET

Description: list of people a user is following

## Test

Postman collection: [link](src/test/resources/postman/challenge.json.postman_collection)

