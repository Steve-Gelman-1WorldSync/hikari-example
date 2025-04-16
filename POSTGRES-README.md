# Postgres Docker
A simple PostgreSQL database running in a Docker container. The run creates a persistent volume for the data, so the
database is stable from one run to the next.

To run:
```text
docker-compose up -d
```

To stop:
```text
docker-compose down
```

To clear the database:
```text
docker volume rm hikari-example_postgres-data-hikari
```

The `.env` file contains the environmental variable values for the run.