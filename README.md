# SecureGate
SecureGate: Fortifying Backend Systems with REST API Authentication and Authorization


## How to run this application using docker file

```
1. docker build -t securegate .
2. docker run --rm -itd -p 8080:8080 securegate
```




## How to run this application using docker-compose 

```
1. docker-compose up -d 
2. docker-compose down --remove-orphans
```

## Keycloak

#### How to start keycloack

```
kc.bat start-dev --http-port=8082
docker run -d --name keycloak -p 8443:8443 sagarkumar99/keycloak

```



## Resources

[Medium link] (https://medium.com/@bcarunmail/securing-rest-api-using-keycloak-and-spring-oauth2-6ddf3a1efcc2)

##
[docker link] (https://www.keycloak.org/getting-started/getting-started-docker)

