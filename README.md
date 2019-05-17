# patronDeFabriquePizza
Ce projet nous permet de voir et d'implémenter le patron de fabrique.
Nous avons crées 5 packages :
-classeAbstracte qui contient les 3 classes abstraites Reines, Orientale et TroisFormage avec le méthode abstract service
-fabrique qui contient une classe abstract AbstractFactory d'ou est implémenté la méthode static getFactory qui retourn une classe de type AbstractFactory,
  et trois classe FactoryFr, factorySn et Factory Us qui etend a leurs tour AbstractFactory et sur chaque classe ont défenis trois méthode de fabrique des produits proposés.
 -Reine ou est défini les trois type de reines
 -Oriental (pac1) ou est défini les trois type de oriental
 -Troisformage ou est défini les trois type de formage
 -default ou est défini la classe Main
