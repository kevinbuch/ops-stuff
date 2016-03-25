(ns data-feed.main
  (:gen-class)
  (:require [data-feed.core :as core]))

(defn -main
  [& args]
  (loop []
    (core/ingest {:big :data})
    (Thread/sleep 5000)
    (recur)))
