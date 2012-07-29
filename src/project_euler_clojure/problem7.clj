(ns project-euler-clojure.core)

(comment What is the 10001 st prime number ?)

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
