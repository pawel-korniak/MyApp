FROM openjdk
LABEL author="Pawel Korniak"
COPY . /app
WORKDIR /app
RUN cd src/main/java/com/korniak/myapp
RUN javac MyApplication.java
ENTRYPOINT ["java", "MyApplication"]
