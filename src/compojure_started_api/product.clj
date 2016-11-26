(ns compojure-started-api.product
  (:require [korma.db :refer :all]
            [korma.core :refer :all]
            [compojure-started-api.entities :refer :all]))

(defn find-all
  []
  (select products))

(defn create
  [description price]
  (insert products
          (values {:description description :price (read-string price)})))
