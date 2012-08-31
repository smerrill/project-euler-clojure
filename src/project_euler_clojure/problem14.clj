(ns project-euler-clojure.core)

(comment Which starting number, under one million, produces the longest chain?)

(defn sequence-step [n]
  (if
    (= n 1) 0
      (if
        (even? n)
        (/ n 2)
        (inc (* 3 n)))))

(defn iterative-sequence [n]
  (when (> n 0)
    (lazy-seq (cons n (iterative-sequence (sequence-step n))))))

(def e
  (zipmap
    (range 1 1000000)
    (map count (map (-> iterative-sequence) (range 1 1000000)))))

(apply format "The number %d made a chain %d long."
  (last (sort-by last e)))
