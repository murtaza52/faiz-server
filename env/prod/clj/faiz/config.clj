(ns faiz.config
  (:require [taoensso.timbre :as timbre]))

(def defaults
  {:init
   (fn []
     (timbre/info "\n-=[faiz started successfully]=-"))
   :middleware identity})
