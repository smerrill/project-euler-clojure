(ns project-euler-clojure.core)

(comment Find the largest palindrome made from the product of two 3 digit numbers)

(defn is-palindrome? [x]
  (let [xs (str x) n (/ (count xs) 2)]
    (= (take n xs) (reverse (take-last n xs)))))

(is-palindrome? 999)
(is-palindrome? 9999)
(is-palindrome? "poop")
(is-palindrome? "ATOYOTA")

(def three-digit-products
  (for [a (range 999 99 -1)
        b (range 999 99 -1)
    :when (is-palindrome? (* a b))]
  (* a b)))

(last (sort three-digit-products))
