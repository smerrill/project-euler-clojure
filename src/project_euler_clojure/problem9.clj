(ns project-euler-clojure.core)

(comment There exists exactly one Pythagorean triplet for which a + b + c = 1000 . Find the product abc.)

(defn square [x]
  (* x x))

(defn pythagorean-triples-that-total [x]
  (for [a (range 1 (+ 1 x))
        b (range 1 (+ 1 x))
        c (range 1 (+ 1 x))
        :when (and
          (= (+ a b c) x)
          (< a b)
          (< b c)
          (= (+ (square a) (square b)) (square c)))]
  (list a b c)))

(apply * (first (pythagorean-triples-that-total 1000)))
