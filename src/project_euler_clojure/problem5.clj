(ns project-euler-clojure.core)

(comment What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20 ?)

(defn evenly-divisible-by? [x y]
  (= 0 (mod x y)))

(defn evenly-divisible-by-range? [x y]
  (every? true? (for [a (range 1 (+ 1 y))]
    (evenly-divisible-by? x a))))

(defn test-multiples [x]
  (for [a (range x Long/MAX_VALUE x)
    :when (evenly-divisible-by-range? a x)]
    a))

(first (test-multiples 20))

(evenly-divisible-by? 20 5)
(evenly-divisible-by-range? 20 10)
(evenly-divisible-by-range? 2520 10)

