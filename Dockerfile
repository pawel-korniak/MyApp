FROM ubuntu
LABEL author="Pawel Korniak"
COPY . /app
WORKDIR /app
RUN cd src/main/java/com/korniak/myapp
ENTRYPOINT /bin/bash
