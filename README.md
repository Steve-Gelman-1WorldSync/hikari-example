# Hikari Example
Small project to test settings for Postgres and HikariCP.

## To Run
Start the application. The Docker backend will start and stop with the application.

### To Add A User

```shell
curl -X POST -H "Content-Type: application/json" \
  -d '{"name":"John Doe","email":"john@example.com"}' \
  http://localhost:8080/api/users
```

### To List The Users

```shell
curl -X GET http://localhost:8080/api/users
```

## Actuators
The list of available endpoints are at
```shell
curl -X GET http://localhost:8080/actuator
```

Health is at:
```shell
curl -X GET http://localhost:8080/actuator/health
```



**Get the Hikari statistics**:
```shell
curl -X GET http://localhost:8080/actuator/metrics/hikaricp.connections
```

There are a lot of metrics for Hikari:
* hikaricp.connections
* hikaricp.connections.acquire
* hikaricp.connections.active
* hikaricp.connections.creation
* hikaricp.connections.idle
* hikaricp.connections.max
* hikaricp.connections.min
* hikaricp.connections.pending
* hikaricp.connections.timeout
* hikaricp.connections.usage