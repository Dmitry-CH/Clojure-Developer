(ns otus-02.homework.pangram
  (:require [clojure.string :as str]))


(def alphabet #{\a \b \c \d \e \f \g \h \i \j \k \l \m \n \o \p \q \r \s \t \u \v \w \x \y \z})


(defn is-pangram [test-string]
  (let [lower-str     (str/lower-case test-string)
        lower-str-seq (seq (str/replace lower-str #"[^a-z]" ""))]
    (= alphabet (apply sorted-set lower-str-seq))))

