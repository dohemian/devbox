(ns all-your-base)

(defn convert [og number nunu] ;; <- arglist goes here
  (cond (nil? number) 0 ;if there's no #, print 0
        (nil? (rest number)) number ;if there's 1 digit, return number 
        (not (nil? (rest number)) ;if more than one digit in number
             (cond (nil? (rest (rest number)))
                   (* (first (rest (number))) (* og (count (rest number)))
        :else (convert og (rest number) nunu))))))
         
