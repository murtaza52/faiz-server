(ns faiz.config
  (:require [selmer.parser :as parser]
            [taoensso.timbre :as timbre]
            [faiz.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (timbre/info "\n-=[faiz started successfully using the development profile]=-"))
   :middleware wrap-dev})
