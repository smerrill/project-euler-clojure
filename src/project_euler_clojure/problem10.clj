(ns project-euler-clojure.core)

(comment Find the sum of all the primes below two million.)

(defn divisors [n]
  (sort
    (mapcat
      #(list % (/ n %))
      (for [a (range 1 (+ 1(int (Math/sqrt n))))
        :when (= 0 (mod n a))]
      a))))

(defn is-prime? [n]
  (and
    (> n 1)
    (= (divisors n) (list 1 n))))

(def primes
  (filter is-prime? (range)))

(apply + (take-while #(< % 2000000) primes))

