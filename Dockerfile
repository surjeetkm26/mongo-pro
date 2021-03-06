FROM openjdk:11
RUN mkdir -p /opt/store/
COPY ./target/mongodb-ins.jar /opt/store/
WORKDIR /opt/store/
CMD ["java", "-jar", "mongodb-ins.jar", "-Djdk.tls.client.protocols=TLSv1.2"]