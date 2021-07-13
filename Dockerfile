FROM openjdk:alpine
COPY . /usr/src/master-spring
WORKDIR /usr/src/master-spring
RUN java c /src/main/java/MasterSpringApplication.java
CMD ["java", "MasterSpringApplication"]
