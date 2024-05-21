# Application "Budget Manager"

## Contexte du Projet

En tant que développeur Java au sein de la startup ENAA TECH, vous avez été désigné pour réaliser le projet de développement de l'application "Budget Manager". Le Product Owner vous a confié cette tâche en spécifiant que votre rôle en tant que développeur Java sera de concevoir et de développer les fonctionnalités clés de l'application, en utilisant les meilleures pratiques de développement et en garantissant la qualité et la fiabilité du code produit.

## Fonctionnalités Principales

### Gestion des Transactions

- **Ajout de Transactions** : En tant qu'utilisateur, je veux pouvoir ajouter une nouvelle transaction financière pour enregistrer mes dépenses ou mes revenus, en spécifiant le montant, la catégorie, la date et une description.
- **Consultation des Transactions** : En tant qu'utilisateur, je veux pouvoir consulter la liste de toutes mes transactions enregistrées, avec la possibilité de les filtrer et de les trier par date, montant ou catégorie.
- **Modification des Transactions** : En tant qu'utilisateur, je veux pouvoir modifier les détails d'une transaction existante, tels que le montant, la catégorie, la date et la description.
- **Suppression des Transactions** : En tant qu'utilisateur, je veux pouvoir supprimer une transaction précédemment enregistrée si nécessaire.

### Gestion de Budget

- **Création de Budgets** : En tant qu'utilisateur, je veux pouvoir créer un nouveau budget en définissant une limite de dépense pour une catégorie spécifique, comme l'alimentation, le logement et le transport.
- **Consultation des Budgets** : En tant qu'utilisateur, je veux pouvoir consulter la liste de tous mes budgets actuels, avec la possibilité de voir les limites définies et les montants dépensés jusqu'à présent pour chaque catégorie.
- **Modification des Budgets** : En tant qu'utilisateur, je veux pouvoir modifier les limites budgétaires pour chaque catégorie de dépenses, en ajustant les montants de limite au besoin.
- **Suppression des Budgets** : En tant qu'utilisateur, je veux pouvoir supprimer un budget existant qui n'est plus nécessaire.

## Technologies Utilisées

- **Spring Core** : Pour l'injection de dépendances et la gestion des composants d'application.
- **Spring MVC** : Pour construire l'application Web et gérer les requêtes HTTP.
- **Hibernate** : Pour la gestion de la persistance des données.
- **HTML/CSS** : Pour la conception de l'interface utilisateur.
- **Base de données** : PostgreSQL

### Diagrammes

#### Diagramme de Cas d'Utilisation

<img width="507" alt="Capture d'écran 2024-05-21 141453" src="https://github.com/Zouhayr-BAHOUMI/gestionbudget/assets/155726584/032419ed-85dc-414c-8be2-1d02e1c4a1b7">


Ce diagramme représente les interactions entre l'acteur utilisateur et le système de gestion de budget.

#### Diagramme de Classes

<img width="480" alt="Capture d'écran 2024-05-21 141524" src="https://github.com/Zouhayr-BAHOUMI/gestionbudget/assets/155726584/a4716807-b52d-4f02-9f74-705c3ee47202">

Ce diagramme présente les classes du système, leurs attributs, leurs méthodes et leurs relations.

#### Diagramme de Séquence

<img width="556" alt="Capture d'écran 2024-05-21 141550" src="https://github.com/Zouhayr-BAHOUMI/gestionbudget/assets/155726584/9167be17-f45f-44a1-8d3d-87c97097f90e">

Ce diagramme de séquence illustre le processus de gestion d'une transaction par un utilisateur, depuis l'ajout jusqu'à la consultation et la modification des transactions.

---

En utilisant ces spécifications et diagrammes, l'application "Budget Manager" peut être développée pour offrir une gestion efficace des transactions et des budgets personnels.
