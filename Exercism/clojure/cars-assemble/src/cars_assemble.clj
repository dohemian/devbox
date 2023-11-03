(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (cond (= speed 0) 0.0
        (<= speed 4) (double (* 1.0 (* speed 221)))
        (<= speed 8) (double (* 0.9 (* speed 221)))
        (= speed 9) (double (* 0.8 (* speed 221))) 
        :else (double (* 0.77 (* speed 221)))))
;;(production-rate 10)               

(defn working-items
  "calculates how many working cars are produced per minute"
  [speed]
  (cond (= speed 0) 0
    :else (int (/ (production-rate speed) 60))))
