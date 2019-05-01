(ns bench
  (:require [criterium.core :as cc]))

(defn -main []
  (dotimes [n 3]
    (println)
    (println "testing..." n)
    (cc/quick-bench
      (merge {:a 1} {:b 2}))))