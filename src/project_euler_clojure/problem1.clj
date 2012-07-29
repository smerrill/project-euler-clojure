(ns project-euler-clojure.core)

(comment Find the sum of all the multiples of 3 or 5 below 1000.)

(defn is-multiple-of? [n divisor]
  (= 0 (mod divisor n)))

(defn multiple-of-three-or-five? [n]
  (or
    (is-multiple-of? 3 n)
    (is-multiple-of? 5 n)))

(apply +
  (filter multiple-of-three-or-five? (range 1000)))
