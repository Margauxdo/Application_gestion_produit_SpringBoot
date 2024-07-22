# Exercice : 


## Application de gestion de produits
Vous allez créer une application Spring simple pour gérer une liste de
produits. L'application permettra de :
* Récupérer les détails d'un produit spécifique en utilisant une
variable de chemin.
* Filtrer les produits en fonction de certains critères en utilisant des
paramètres de requête.


### Modèle de données

Créez une classe Product avec les champs suivants :
* id
* name
* category
* price


### Contrôleur

Créez un contrôleur ProductController avec les endpoints suivants :
* Endpoint pour afficher tous les produits
* Endpoint pour récupérer et afficher un produit par ID
* Endpoint pour filtrer et afficher les produits par catégorie et prix
maximum


### Service

* Créez une classe ProductService qui gère la logique métier, incluant
une méthode pour récupérer un produit par ID et une méthode pour
filtrer les produits.
