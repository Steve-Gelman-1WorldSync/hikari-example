# Hikari Example
Small project to test settings for Postgres and HikariCP.

## To Run
1. Start the database. See the [POSTGRES-README.md](POSTGRES-README.md) file.
2. Start the application.

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
