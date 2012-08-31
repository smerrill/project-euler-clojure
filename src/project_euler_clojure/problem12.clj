(ns project-euler-clojure.core)

(comment Find the first triangle number that has more than 500 divisors.)

(defn divisors [n]
  (sort
    (mapcat
      #(list % (/ n %))
      (for [a (range 1 (+ 1(int (Math/sqrt n))))
        :when (= 0 (mod n a))]
      a))))

(defn triangle-numbers
  ([]  (triangle-numbers 1))
  ([n] (lazy-seq (cons (apply + (range (inc n))) (triangle-numbers (inc n))))))

(defn number-of-divisors-less-than? [n x]
  (< (count (divisors x)) n))

(first
  (drop-while (partial number-of-divisors-less-than? 501) (triangle-numbers)))
