(ns project-euler-clojure.core)

(comment What is the largest prime factor of the number 600851475143 .)

(defn divisors [n]
  (filter #(= 0 (mod n %)) (range 1 (+ 1 n))))

(defn is-prime? [n]
  (or
    (= n 1)
    (= (divisors n) (list 1 n))))

(defn prime-factors [n]
  (filter is-prime? (divisors n)))

(last (prime-factors 600851475143))
