(ns project-euler-clojure.core)

(comment Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.)

(defn sum-of-squares [x]
  (apply +
    (map #(* % %) (range 1 (+ 1 x)))))

(defn square-of-sum [x]
  (let [a (apply + (range 1 (+ 1 x)))]
    (* a a)))

(defn difference-sum-of-squares-and-square-of-sum [x]
  (- (square-of-sum x) (sum-of-squares x)))

(sum-of-squares 10)
(square-of-sum 10)
(difference-sum-of-squares-and-square-of-sum 10)
(difference-sum-of-squares-and-square-of-sum 100)
