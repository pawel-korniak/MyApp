FROM pawelkorniak/ubuntu_mvn
LABEL author="Pawel Korniak"
COPY . /app
WORKDIR /app
RUN mvn package
ENTRYPOINT /bin/bash
