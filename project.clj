(defproject compojure-started-api "0.1.0-SNAPSHOT"
  :description "API to exemplify the use of compojure."
  :url "http://github.com/sergioaugrod/compojure-started-api"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-json "0.4.0"]
                 [korma "0.4.3"]
                 [postgresql "9.3-1102.jdbc41"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler compojure-started-api.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
