FROM openjdk:17
MAINTAINER :SBAmileStone-4
COPY target/SBAmileStone-4-0.0.1-SNAPSHOT.jar SBAmileStone-4-0.0.1-SNAPSHOT.jar
EXPOSE 8095
CMD ["java" "-jar" SBAmileStone-4.jar]
