FROM pawelkorniak/ubuntu_mvn
LABEL author="Pawel Korniak"
COPY . /app
WORKDIR /app
ENTRYPOINT /bin/bash
