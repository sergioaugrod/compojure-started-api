(ns compojure-started-api.entities
  (:use [korma.core]
        [korma.db]))

(defdb db (postgres {:db "compojure-started-api"
                     :user "postgres"
                     :password ""}))

(defentity products)
