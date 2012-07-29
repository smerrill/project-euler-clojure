(ns project-euler-clojure.core)

(comment By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.)

(defn lazy-fibonacci
  ([]
    (concat [0 1] (lazy-fibonacci 0 1)))
  ([a b]
    (let [n (+ a b)]
      (lazy-seq
        (cons n (lazy-fibonacci b n))))))

(defn less-than-4-million? [n]
  (< n 4000000))

(apply +
  (filter even?
    (take-while less-than-4-million? (lazy-fibonacci))))
