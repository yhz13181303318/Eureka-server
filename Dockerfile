FROM java:8
VOLUME /tmp
ADD MicroServiceCloud-Eureka-7001-1.0-yss.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 7001