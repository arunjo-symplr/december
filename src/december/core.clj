(ns december.core
  (:require [december.catsdogs :as cnd]
            [december.dogscats :as dnc]
            [december.multipleFns :as mfns]))

(defn dissoc-from-map []
  (let [nested-map-a '{:a "a", :b {:aa "aa", :bb "bb"}}
        dissociated-map-a (update-in nested-map-a [:b] dissoc :bb)]
    dissociated-map-a))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn cnd-check []
  (cnd/catsdogs "I joined at tata as cyber security engineer" "cat" "ZQ" "dog" "cry" "data" "circuit")
  (cnd/catsdogs "It’s raining cats and dogs" "cats" "dogs" "cogs" "training" "sit" "rain")

  ;(dnc/catsdogs "I joined at tata as cyber security engineer" "cat" "ZQ" "dog" "cry" "data" "circuit")
  ;(dnc/catsdogs "It’s raining cats and dogs" "cats" "dogs" "cogs" "training" "sit" "rain")
  )

(defn mul-fn-check []
  (mfns/my-function)
  (mfns/my-function 8)
  (mfns/my-function 7 6)
  (mfns/my-function 5 4 3)
  )

(defn map-to-list [coll-of-maps req-key]
  (let [list-of-maps (flatten (map (juxt req-key) coll-of-maps))]
    list-of-maps))