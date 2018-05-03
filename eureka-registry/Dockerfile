FROM openjdk
COPY target/eureka-registry.jar /opt/spring-cloud/
MAINTAINER anupamgoogi
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/eureka-registry.jar"]
EXPOSE 8761