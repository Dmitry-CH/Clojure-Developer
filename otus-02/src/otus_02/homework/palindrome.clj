(ns otus-02.homework.palindrome
  (:require [clojure.string :as str]))


(defn is-palindrome [test-string]
  (let [lower-str     (str/lower-case test-string)
        lower-str-seq (seq (str/replace lower-str #"[^a-z]" ""))]
    (= lower-str-seq (reverse lower-str-seq))))

