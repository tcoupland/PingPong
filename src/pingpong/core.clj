(ns pingpong.core
  (:require
            [clj-redis.client :as redis]))

(def db (redis/init))

(defn subscribe [channel]
  (redis/subscribe db [channel] prn))

(defn publish [channel msg]
  (redis/publish db channel msg))

(defn -main
  [cmd chan & args]
  (case cmd
    "sub" (subscribe chan)
    "pub" (publish chan (apply str args))
    (println "err, what!")))
