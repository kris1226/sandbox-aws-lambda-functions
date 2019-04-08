(ns hello
  (:require [clojure.data.json :as json]
            [uswitch.lambada.core :refer [deflambdafn]]
            [clojure.java.io :as io]))

;(defn -handler [s]
;  (print "value passed in is: " (str s))
;  (json/read-str s))

(defn handler [event]
  (println "Got the following event: " (pr-str event))
  {:status "ok"})

(deflambdafn hello.MyLambdaFn [in out ctx]
             (let [event (json/read (io/reader in))
                   res (handler event)]
               (with-open [w (io/writer out)]
                 (json/write res w))))

