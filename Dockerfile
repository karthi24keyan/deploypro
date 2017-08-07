FROM java:8

EXPOSE 8099

ADD executablejar.jar executablejar.jar

ENTRYPOINT [ "java","-jar","executablejar.jar" ]
