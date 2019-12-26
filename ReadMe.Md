# Todo Web App
Sammple application with a spring backend / mongo db / and angular frontend. 

## Set up notes
1. pulled docker image of mongo db for local `docker pull mongo`
1. run docker image local `docker run -d --name todo-mongo -p 27017:27017 mongo`
  1. if container exists can run `docker restart todo-mongo`
1. open terminal and go to the backend service root directory
1. start the backend with `mvn spring-boot:run` 

## See info about making this from this tuttorial 
https://www.callicoder.com/spring-boot-mongodb-angular-js-rest-api-tutorial/
