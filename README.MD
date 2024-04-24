<h1>Compte rendu d'une App Hopital réalisée avec Spring MVC</h1>
<h2>Objectif du Tp</h2>
<p>L'objectif de ce tp est de savoir créer une application
web basée sur Spring MVC qui permet de gérer les patients d'un hopital en implémentatnt les fonctionnalités suivantes et en utilisant MySQL:<br>
<i>Afficher les patients, faire la pagination, chercher un patient et supprimer un patient.</i></p>
<h2>Architecture du projet</h2>
<img src="captures/cap1.png">
<h2>Partie 1:</h2>
<h2>Notre classe Patient</h2>
<img src="captures/cap2.png">
<h2>Implementation H2 et MySQL</h2>
<img src="captures/cap6.png">
<h2>Ajout des patients avec 3 méthodes</h2>
<img src="captures/cap5.png">
<h2>Implémentation d'une méthode de recherche par nom</h2>
<img src="captures/cap3.png">
<h2>Controller Patient</h2>
<p>Ce controleur implémente l'index et delete</p>
<img src="captures/Cap4.png">
<h2>Vue patient <i>HTML</i></h2>
<img src="captures/cap70.png">
<img src="captures/cap71.png">
<h2>Interface du index</h2>
<img src="captures/cap8.png">
<h2>Chercher un patient</h2>
<img src="captures/cap9.png">
<h2>Tentative du suppression</h2>
<img src="captures/cap10.png">
<h2>Partie 2:</h2>
<h2>Création des templates</h2>
<img src="captures/sc1.png">
<h2>Validation</h2>
<img src="captures/sc2.png">
<h2>Les interfaces avec les templates crées</h2>
<img src="captures/sc3.png">
<img src="captures/sc4.png">
<h2>Partie 3:</h2>
<h2>InMemomy Authentication: </h2>
<h2>Création du users avec roles</h2>
<img src="captures/sc5.png">
<h2>Modification du contolleur patient pour garantir les autorisations et les users:</h2>
<img src="captures/sc6.png">
<img src="captures/sc7.png">
<h2>Création d'un nv controller et template</h2>
<p>L'Objectif est d'empêcher un user d'utiliser les fonctionnalités d'admin d'une manière indirecte </p>
<img src="captures/sc8.png">
<img src="captures/sc9.png">
<h2>JDBC Authentication:</h2>
<h2>Création du data source avec JdbcUserDetailsManager</h2>
<img src="captures/sc10.png">
<h2>Création des tables avec un fichier .sql</h2>
<img src="captures/sc11.png">
<h2>Vérification sur mysql</h2>
<img src="captures/sc12.png">
<h4>Données table authorities</h4>
<img src="captures/sc13.png">
<h4>Données table users</h4>
<img src="captures/sc14.png">
<h4>Test de login avec "admin2" crée avec jdbc</h4>
<img src="captures/sc15.png">
<img src="captures/sc16.png">
<h2> UserDetails Service : </h2>
<h2>L'architecture des packages:</h2>
<img src="captures/sc18.png">
<h2>Création des users et role avec account service</h2>
<img src="captures/scservice.png">
<h3>Vérification sur mysql</h3>
<h4>Données appuser</h4>
<img src="captures/scappusers.png">
<h4>Données approle</h4>
<img src="captures/scapproles.png">
<h2>Création du implémentation d'interface</h2>
<img src="captures/sc19.png">
<h2>Injection du service</h2>
<img src="captures/sc17.png">


