commands docker:

* docker build -t 499092/luisgamarra:ms-config-client .
* docker run -p 8888:8888 --name ms-config-server --net=spring-boot-modules 499092/luisgamarra:ms-config-server

* docker run image -p [PUERTO LOCAL:PUERTO DOCKER]

* docker run -p 8080:8080 --name ms-config-client --net=spring-boot-modules 499092/luisgamarra:ms-config-client

* docker network create spring-boot-modules