(ns project-euler-clojure.core)

(comment What is the largest prime factor of the number 600851475143 .)

;(defn divisors [n]
  ;(filter #(= 0 (mod n %)) (range 1 (int (Math/sqrt n)))))

(defn divisors [n]
  (sort
    (mapcat
      #(list % (/ n %))
      (for [a (range 1 (+ 1(int (Math/sqrt n))))
        :when (= 0 (mod n a))]
      a))))

;(defn lazy-divisors [n]
    ;(for [a (range n 0 -1)
      ;:when (= 0 (mod n a))]
    ;a))

(defn is-prime? [n]
  (and
    (> n 1)
    (= (divisors n) (list 1 n))))

;(defn lazy-prime-factors [n]
  ;(for [a (lazy-divisors n)
    ;:let [b (int (Math/sqrt n))]
    ;:when (and (< a b) (is-prime? a))]
    ;a))

;(defn lazy-prime-factors [n]
  ;(for [a (lazy-divisors n)
    ;:let [b (int (Math/sqrt n))]
    ;:when (and (< a b) (is-prime? a))]
    ;a))

;divisors(defn prime-factors [n]
  ;(filter is-prime? (divisors n)))

;(defn largest-prime-factor [n]
  ;(first
    ;(for [a (range n 0 -1)
      ;:when (is-prime? divisors a)]
    ;a)))

(last (filter is-prime? (divisors 600851475143)))
;(divisors 600851475143)

;(second (lazy-divisors 13195))
;(first (lazy-prime-factors 13195))
;(lazy-prime-factors 13195)

;(last (prime-factors 13195))

;(last (prime-factors 600851475143))

;(is-prime? 27)
;(is-prime? 17)
