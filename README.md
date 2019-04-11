# Spring Boot on Docker connecting to MySQL Docker container

# 1. Use MySQL Image published by Docker Hub, Command to run the mysql container
docker run --name mysql1 -e MYSQL_ROOT_PASSWORD=admin -e MYSQL_DATABASE=bikerent -e MYSQL_USER=root -e MYSQL_PASSWORD=admin -d mysql:5.7

#2. In the Spring Boot Application, use the same container name of the mysql instance in the application.properties
spring.datasource.url = jdbc:mysql://mysql1:3306/bikerent

#3. Create a `Dockerfile` for creating a docker image from the Spring Boot Application
FROM openjdk:8
ADD target/bike-rent.jar bike-rent.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "bike-rent.jar"]


#---------- start---------------------
# start eixt container
docker start  `docker ps -q -l`

# 4. Using the Dockerfile create Docker image. 
docker build . -t bike-rent

# 5 stop and remove container
docker container ls 
docker stop 
docker rm 

# 6. Run the Docker image (users-mysql) created in 
docker run -p 8086:8086 --name bike-rent --link mysql1:mysql -d bike-rent



# 7. open in web
localhost:8086


## Useful Docker commands
docker images
docker container ls
docker logs <container_name>
docker container rm <container_name>
docker image rm <image_name>


##reference
https://www.youtube.com/watch?v=fvEWoy1xOvo
https://github.com/TechPrimers/docker-mysql-spring-boot-example

