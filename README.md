# ep-personalized-users
this is to create a API and register to Eurika , Add a swagger file 


docker-machine ls
docker-machine start default
docker images --all
docker remove

gradle buildimage
gradle clean build

Registering to Eurika 
gradle bootrun  - to run Eurika 
java -Ddiscovery.service.url=http://localhost:8761/eureka -jar build/libs/ep-personalized-users-0.1.0.jar

http://localhost:8761/ -  eruka 

docker-machine env

docker build -t hello-world-middle .


docker run -p 8081:8081 -e "JVM_ARGS=-Dserver.port=8081" hello-world-middle

run java App
java -jar build/libs/gs-rest-service-0.1.0.jar

java -jar build/libs/ep-personalized-users-0.1.0.jar

==========================================================
git remote add upstream git@github.com:EBSCOIS/platform.shared.helloworldmiddle.git
