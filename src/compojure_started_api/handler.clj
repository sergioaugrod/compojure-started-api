(ns compojure-started-api.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [compojure-started-api.product :as product]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/products" [] (product/find-all))
  (POST "/products" request
        (let [description (get-in request [:body "description"])
              price (get-in request [:body "price"])]
          (product/create description price)))
  (route/not-found "Not Found"))

(def app
  (-> app-routes
      wrap-json-response
      wrap-json-body))
