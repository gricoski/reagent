;;Working off this tutorial:: https://www.rockyourcode.com/tutorial-clojurescript-app-with-reagent-for-beginners-part-1

(ns breaking-bad-quotes.core
  (:require [reagent.core :as reagent :refer [atom]]))

(defn quote []
     (let [data (atom "quote app")]
          (fn []
               [:div.cards>div.card
               [:h2.card-header.text-center "I love Vienna"]
               [:div.card-body.text-center
               [:p#quote @data]
               [:p#author @data]]
               [:div.card-footer.center.text-center
               [:button#twitter.outline>a#tweet
               {:href "#"
               :target "_blank"}
               [:i.fi-social-twitter " Tweet"]]
               [:button#new-quote.outline
               [:i.fi-shuffle " Don't Push"]]]])))
;;This is hiccup style - see here: https://github.com/weavejester/hiccup/wiki/Syntax

(defn start []
     (reagent/render-component [quote]
                             (. js/document (getElementById "app"))))
