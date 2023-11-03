(ns cljr-sandbox.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
        
(def visitors (atom #{}))
  
(defn hello
  "Writes hello message to *out*. Calls you by username. Knows if you have been here before."
  [username]
  (swap! visitors conj username)
  (str "Hello, " username))

(require 'clojure.java.io)
(require 'examples.introduction)
