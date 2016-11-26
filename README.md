# Compojure Started API

Project to exemplify the use of compojure. Two routes have been created to create and list products stored in a database.

## Prerequisites

You will need [Leiningen][] and [Postgresql][] installed.

[leiningen]: https://github.com/technomancy/leiningen
[postgresql]: https://www.postgresql.org


## Configuration

Create a database `compjure-started-api`:

```sql
CREATE DATABASE "compjure-started-api";
```

Create a table `product` in your postgresql database:

```sql
CREATE TABLE products(
  id SERIAL PRIMARY KEY NOT NULL,
  description varchar(50) NOT NULL,
  price float8 NOT NULL
);
```

Replace user and database credentials in [src/compojure_started_api/entities.clj](src/compojure_started_api/entities.clj):

```clojure
(defdb db (postgres {:db "compojure-started-api"
                     :user "postgres"
                     :password ""}))
```

## Running

To start a web server for the application, run:

```bash
$ lein ring server
```

## Endpoints

### `GET /products`

```bash
$ curl http://localhost:3000/products
```

### `POST /products`

```bash
$ curl -X POST http://localhost:3000/products -H "Content-Type: application/json" -d '{"description":"Product", "price":"10.55"}'
```
