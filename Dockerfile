FROM pawelkorniak/ubuntu_mvn
LABEL author="Pawel Korniak"
COPY . /app
WORKDIR /app
RUN mvn package
RUN cd target
RUN java -jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT /bin/bash
