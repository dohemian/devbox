(ns drink-age.core
  (:gen-class))

(do
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (if true
    (do (println "Success!")
      "By Zeus's hammer!")
    (do (println "Failure!")
      "By Aquaman's trident!"))
  
  (println "Wanna get high?")
  (def age 24)
  (println "You've gotta be the right age though.")
  (if (> age 21)
    (println "Aight broham, you're cool to hang.")
    (nil? 1))))    
