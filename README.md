
# TP Android : Inscription à une Formation

# Description
Ce TP a pour but de réaliser une interface mobile Android permettant à un utilisateur de s'inscrire à une formation. L'utilisateur peut saisir ses informations personnelles (nom, email, téléphone, adresse, et ville) dans un formulaire. Après avoir rempli les champs, un bouton "Envoyer" permet de valider l'inscription et de rediriger vers une autre activité qui affiche un récapitulatif des informations saisies.

# Fonctionnalités

1. **Saisie des données personnelles :**
   - L'utilisateur peut entrer les informations suivantes :
     - Nom
     - Email
     - Numéro de téléphone
     - Adresse
     - Ville (à choisir dans une liste déroulante)

2. **Validation du formulaire :**
   - Lorsqu'un utilisateur clique sur le bouton **"Envoyer"**, le système vérifie que tous les champs ont été remplis. Si un champ est vide, un message d'erreur s'affiche.
   
3. **Affichage du récapitulatif :**
   - Si le formulaire est valide, l'utilisateur est redirigé vers une seconde activité qui affiche le récapitulatif des informations saisies.

4. **Annulation :**
   - Un bouton **"Annuler"** permet à l'utilisateur de vider tous les champs du formulaire.

# Technologies Utilisées

- **Langage de programmation :** Java
- **IDE :** Android Studio
- **Version Android :** API 24+ 
- **Widgets utilisés :**
  - `EditText` pour les champs de texte (nom, email, téléphone, adresse)
  - `Spinner` pour la sélection de la ville
  - `Button` pour les actions (Envoyer, Annuler)
  - `Toast` pour l'affichage des messages d'erreur

### Installation

Clone le dépôt du projet :
   ```bash
   git clone  https://github.com/Bou-Mery/Tp1_Inscreption.git
   ```

2. Ouvre le projet dans Android Studio :
   - Lance **Android Studio**.
   - Sélectionne "Open an existing project" et choisis le dossier du projet cloné.

# Démarche de Développement

1. **MainActivity.java :**  
   - Contient le formulaire de saisie avec des champs pour le nom, email, téléphone, adresse, et un spinner pour la sélection de la ville.
   - Vérifie que tous les champs sont remplis avant de rediriger vers la seconde activité.
   - Le bouton "Annuler" vide les champs du formulaire.

2. **SecondActivity.java :**  
   - Récupère les données saisies depuis la `MainActivity` et les affiche dans un récapitulatif.

# Démonstration Vidéo

Voici une courte démonstration de l'application :

[Cliquez ici pour regarder la vidéo](https://drive.google.com/file/d/1W1K7ULg8_risRHf9NkJzbL37M9Lqmk5r/view)

---

### Auteur
Projet réalisé par **[BOUKHRAIS Meryem]** dans le cadre du TP d'Android.

