(ns mgrapi.views.layout
  (:require [hiccup.def :refer [defhtml]] 
            [hiccup.page :refer [include-css]]))
       
(defhtml common [& body]  
  [:head
   [:title "Welcome to mgrapi"]
   (include-css "/css/screen.css")]
  [:body body])
