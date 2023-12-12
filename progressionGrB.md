## Progression du groupe B

### Séance 24 - Mardi 12/12 (BDP 12)

- ***B1 Module 3 - Modularisation d'un programme***

  - Implémentation en autonomie du problème « Jeu de l'oie V2 avec méthodes » ([correction](https://github.com/rose-line/sio1_2025-b1-jeu-de-l-oie-v2-avec-methodes))

### Séance 23 - Jeudi 07/12 (BDP 11)

- ***B1 Module 3 - Modularisation d'un programme***

  - Analyse et implémentation de « Jeu de l'oie V1 avec méthodes » ([correction](https://github.com/rose-line/sio1_2025-b1-jeu-de-l-oie-v1-avec-methodes))

  - Exercice : « Jeu de l'oie V2 avec méthodes » **à terminer pour la prochaine séance**

### Séance 22 - Mardi 05/12 (BDP 10)

- ***B3 Module 4 - Acteurs, vecteurs et ressources OSINT***

  - Vecteurs d'attaque

    - Périphériques externes

    - Cloud

- ***B1 Module 3 - Modularisation d'un programme***

  - Stucturation d'un algorithme :

    - Identifier les sous-problèmes

    - Nommer les sous-problèmes

    - Extraire les sous-problèmes

  - Notion de _décomposition procédurale_

  - Méthodes :

    - Processus de décomposition avec des méthodes

    - Définition d'une méthode : syntaxe et exemples

    - Invocation d'une méthode : syntaxe et exemples

    - Synthèse

    - Flux d'exécution : notions d'*appelant* et de *pile d'appels* et de *retour*

    - Exercice « Quelle est la sortie ? » avec des méthodes

  - Méthodes paramétrées

    - Notion et fonctionnement des paramètres

    - Déclaration et appel de méthodes paramétrées

    - Mécanique du passage de paramètres

    - Erreurs communes dans l'utilisation des paramètres

    - Paramètres multiples

  - Exercice à terminer pour jeudi : « Jeu de l'oie V1 » avec méthodes

    - Identifier les sous-problèmes

    - Nommer les sous-problèmes

    - Extraire les sous-problèmes sous forme de définition de méthodes

    - Appeler les méthodes aux endroits appropriés dans le programme principal (méthode `main`)

### Séance 21 - Jeudi 30/11 (CS 12)

- ***B3 Module 4 - Acteurs, vecteurs et ressources OSINT***

  - Acteurs
    - « *Script Kiddies* »
    - *Hacktivistes*
    - Crime organisé
    - Menaces avancées persistantes
    - Attaques internes
    - Concurrence

  - Vecteurs d'attaque
    - Accès direct
    - Sans-fil
    - Email
    - *Supply chain*
    - Réseaux sociaux

### Séance 20 - Mardi 28/11 (CS 11)

- ***B3 Module 3 - Stratégies de défense***

  - Les grandes approches défensives

    - Protection centrée sur l'information

    - Protection orientée vecteurs d'attaque

  - Réparation après incident

  - Gestion de configuration

  - Retour sur critères DICP

### Séance 19 - Jeudi 23/11 (CS 10)

- Interro B1 Module 2 - Instructions conditionnelles et répétitives

- ***B3 Module 3 - Stratégies de défense***

  - Les grandes approches défensives

    - Protection uniforme

    - Protection par zones

### Séance 18 - Mardi 21/11 (CS 09)

- ***B3 Module 3 - Stratégies de défense***

  - Mentalité du défenseur et stratégie de défense

  - Prévention vs. détection

  - Flux entrants vs flux sortants

  - Notion de risque : R = M x V

  - DICP : **non vu** (cf cours M. Harbonnier)

  - Contrôle des accès : terminologie

- **Interro prévue jeudi 23/11** : B1 Module 2 - Instructions conditionnelles et répétitives

### Séance 17 - Jeudi 16/11 (BDP 09)

- ***B1 Module 2 - Bases de la programmation***

  - Correction des problèmes « Jeu de l'Oie » (V1, V2 et V3)

- **Interro prévue jeudi 23/11** : B1 Module 2 - Instructions conditionnelles et répétitives

### Séance 16 - Mardi 14/11 (BDP 08)

- ***B1 Module 2 - Bases de la programmation***

  - Continuation de la séance précédente ; _commit_ et _push_ sur GitHub pour chaque version terminée.

### Séance 15 - Jeudi 09/11 (BDP 07)

- ***B1 Module 2 - Bases de la programmation***

  - Implémentation en autonomie du problème « Jeu de l'Oie » et de ses évolutions :

#### JEU DE L'OIE - VERSION 2

Le jeu doit maintenant recommencer automatiquement autant de fois que nécessaire jusqu’à ce qu’on ait une simulation gagnante. C'est la même séquence de 5 coups de dés qui se répète jusqu'à ce qu'on gagne :

  - on doit voir toutes les parties se dérouler ;
  - cette fois on ne va pas faire de pause à chaque coup de dé (trop long : on ne sait pas combien de parties seront nécessaires pour gagner, et ce sera potentiellement long) ;
  - la dernière partie visible sera donc la seule gagnante.

Le programme doit également afficher à la fin le nombre total de simulations qu’il a fallu pour gagner.

#### JEU DE L'OIE - VERSION 3

De nouveau, on ne va jouer qu'une seule partie. Mais cette fois, on lance le dé jusqu'à ce qu'on arrive pile à 20. Quand on dépasse 20, on « rebondit » en repartant en arrière, comme dans le vrai jeu. Par exemple :

  - si on est sur la case 18 et qu'on fait 3, on atterrit sur la case 19 (2 pour aller à 20, 1 pour revenir à 19) ;
  - si maintenant on fait 6, on atterrit sur la case 15 (1 pour aller à 20, 5 pour revenir à 15) ;
  - si maintenant on fait 5, on atterrit sur la case 20 et le jeu s'arrête.

En fin de partie, le programme doit afficher le nombre de lancers de dé qu'il a fallu pour gagner.

### Séance 14 - Mardi 07/11 (BDP 06)

- ***B1 Module 2 - Bases de la programmation***

  - Structures répétitives

    - Instruction FAIRE TANT QUE (_do while_)

    - Étude du problème précédent (« validation du nombre d'heures travaillées ») avec une boucle _do while_

    - Instruction POUR (_for_)

    - Étude et implémentation du problème « Calcul du total d'un panier d'articles »

    - *Pour la prochaine fois : implémenter le problème « Jeu de l'Oie »* (nouveau projet à mettre sur GitHub) dont voici les spécifications :

#### JEU DE L'OIE

Le but est de parcourir les 20 cases du jeu avec 5 lancers d'un dé. Un dé à 6 faces sera donc lancé 5 fois. *On fait toujours les 5 lancers*.

  - Si on arrive exactement à 20, on gagne.
  - Si on est au-dessus ou en-dessous de 20, on perd.

La simulation va nécessiter de générer des entiers au hasard (lancers de dé). Vous utiliserez un objet `Random` pour générer des entiers entre 1 et 6. Voici un morceau de code qui vous permet de générer un entier entre 1 et 6 et de ranger le résultat dans une variable `lancer` :

```java
Random generateur = new Random();
int lancer = generateur.nextInt(6) + 1;
```

Voici un exemple de sortie du programme (ici, le joueur gagne) :

```
Lancer 1 : vous avez fait 3. Vous êtes sur la case 3 (encore 17 cases)
Lancer 2 : vous avez fait 3. Vous êtes sur la case 6 (encore 14 cases)
Lancer 3 : vous avez fait 6. Vous êtes sur la case 12 (encore 8 cases)
Lancer 4 : vous avez fait 5. Vous êtes sur la case 17 (encore 3 cases)
Lancer 5 : vous avez fait 3. Vous êtes sur la case 20 (encore 0 cases)
Vous avez gagné !
```

Voici un autre exemple dans lequel le joueur perd. Notez que, bien que le joueur arrive à 20 après 4 lancers, le cinquième lancer le fait dépasser et il perd (on doit toujours faire les 5 lancers) :

```
Lancer 1 : vous avez fait 4. Vous êtes sur la case 4 (encore 16 cases)
Lancer 2 : vous avez fait 5. Vous êtes sur la case 9 (encore 11 cases)
Lancer 3 : vous avez fait 6. Vous êtes sur la case 15 (encore 5 cases)
Lancer 4 : vous avez fait 5. Vous êtes sur la case 20 (encore 0 cases)
Lancer 5 : vous avez fait 3. Vous êtes sur la case 23 (encore -3 cases)
Vous avez perdu !
```

On souhaite que le programme fasse une pause après chaque lancer (chaque ligne). Il faudra appuyer sur la touche `Entrée` pour faire le lancer suivant. Pour cela, en Java, on utilisera la ligne suivante (en admettant qu'on a une variable `clavier` de type `Scanner`) : `clavier.nextLine();`. Cette simple ligne attend juste un appui sur `Entrée` avant de poursuivre le programme.

### Séance 13 - Jeudi 19/10 (BDP 05)

- [Correction](bloc1/B1_BDP_M1_GB_20231012_correction.java) de l'interro [B1_BDP_M1_GB_20231012](bloc1/B1_BDP_M1_GB_20231012_sujet.adoc) Introduction à la programmation

- ***B1 Module 2 - Bases de la programmation***

  - Structures conditionnelles

    - Correction du problème « d'obtention conditionnée d'un prêt bancaire » 

  - Structures répétitives

    - Principe de la « boucle »

    - Instruction TANT QUE (_while_)

    - Étude et implémentation du problème « Validation du nombre d'heures travaillées »

    - Étude et implémentation du problème « Café-crème » **à faire pour la rentrée (mettre sur GitHub)**

### Séance 12 - Mardi 17/10 (BDP 04)

- ***B1 Module 2 - Bases de la programmation***

  - Gestion de versions avec Git

    - Présentation de Git et de GitHub

    - Création du compte GitHub (github.com)

    - Installation de Git (git-scm.com)

    - Configuration locale

      - `git config --global user.name jdupont`

      - `git config --global user.email jean.dupont@gmail.com`

    - Création locale d'un dépôt Git et publication d'un projet sur GitHub

    - Concept de commit local avec message et synchronisation avec GitHub

- Structures conditionnelles

  - Correction du problème de messages conditionnés pour les commerciaux : versions sans calcul de salaire brut et avec calcul de salaire brut

  - Étude et implémentation du problème « d'association d'une couleur à une note » (corrigé dans les slides)

  - Opérateurs logiques

  - Étude et implémentation du problème « d'obtention conditionnée d'un prêt bancaire » : **à terminer pour la prochaine séance**

### Séance 11 - Jeudi 12/10 (BDP 03)

- **Interro B1_BDP_M1_GB_20231012 : Introduction à la programmation**

- ***B1 Module 2 - Bases de la programmation***

  - Structures conditionnelles

    - Prise de décision

    - Instruction IF

    - Implémentation du programme de calcul de salaire avec prime conditionnée

    - Opérateurs relationnels

    - Instruction IF/ELSE

    - Implémentation en autonomie du problème de messages conditionnés pour les commerciaux : versions sans calcul de salaire brut et avec calcul de salaire brut - **à terminer pour la prochaine séance**

### Séances 10 - Mardi 10/10 (BDP 02)

- ***B1 Module 1 - Introduction à la programmation***

  - Présentation du langage Java

  - Retour sur le problème du calcul du salaire brut : améliorations et bonnes pratiques

  - Implémentation du problème « texte à trous » et correction

- **Interro prévue jeudi 12/10** : B1 Module 1 - Introduction à la programmation

### Séance 9 - Jeudi 05/10 (BDP 01)

- ***B1 Module 1 - Introduction à la programmation***

  - Notions d'_ordinateur_, de _programme_, de _langage de programmation_, de _code source_

  - Historique de la programmation et différences-clés entres langages populaires

  - Notion d'_algorithme_

  - Exemple de problème : calcul d'un salaire brut

    - algorithme

    - première implémentation en Java

### Séance 8 - Mardi 03/10 (CS 08)

- ***B3 Module 1 Partie 3 - Attaques réseau***

  - Attaque _Man in the Browser_

  - Empoisonnement ARP

  - Usurpation d'adresse IP

  - Attaque en déni de service distribuée (_DDoS_)

- ***B1 Module 1 - Introduction à la programmation***

  - Installation et mise en place de l'environnement de développement (_Visual Studio Code_)

  - Configuration d'un premier projet

### Séance 7 - Jeudi 28/09 (CS 07)

- **Interro B3_S1_INT01_20230928 : Module 1 - Partie 1 et 2**

- ***B3 Module 1 Partie 3 - Attaques réseau***

  - Standards de chiffrement Wi-Fi

  - Attaque de vecteur d'initialisation

### Séance 6 - Mardi 26/09  (CS 06)

- ***B3 Module 1 Partie 2 - Malwares et autres schémas d'attaque***

  - Attaque de la chaîne logistisque (_supply chain_)

  - Migration vers le cloud vs. infrastructure « sur site » : avantages et inconvénients d'un point de vue cybersécurité

  - Rançongiciel (_ransomware_)

- ***B3 Module 1 Partie 3 - Attaques réseau***

  - Attaque de l'homme du milieu (_MitM_)

  - Attaques Wi-Fi :

    - _Jamming_

    - Point d'accès pirate (_rogue_)

    - Jumeau malveillant (_evil twin_)

    - Dissociation (exemple avec `aircrack-ng`)

  - Attaques bluetooth :

    - _Bluejacking_

    - _Bluesnarfing_

- **Interro prévue jeudi 28/09** : B3 Module 1 - Partie 1 et 2

### Jeudi 21/09 : journée d'intégration

### Séance 5 - Mardi 19/09 (CS 05)

- ***B3 Module 1 Partie 2 - Malwares et autres schémas d'attaque***

  - Examen de plusieurs types de malwares :

    - Malware « zombie » et botnets

    - Bombe logique

    - Logiciel espion

    - Keylogger

    - Rootkit

    - Porte dérobée (_backdoor_)

  - Spraying

  - Attaques par rétrogadation

  - Attaques par périphérique externe

### Séance 4 - Jeudi 14/09 (CS 04)

- ***B3 Module 1 Partie 2 - Malwares et autres schémas d'attaque***

  - Malwares : généralités

  - Prévention fondamentale

  - Examen de plusieurs types de malwares :

    - Virus

    - Ver

    - PUP (programme potentiellement indésirable)

    - Cheval de Troie

    - Malware « zombie » et botnets

### Séance 3 - Mardi 12/09 (CS 03)

- ***B3 Module 1 Partie 1 - Ingénierie Sociale***

  - Typosquattage

  - Attaque de point d'eau

  - Sécurité physique : conséquences et bonnes pratiques

  - Sécurité des laptops

  - Efficacité de l'IS : principes d'autorité, d'intimisation, d'acceptation sociale, de familiarité, de confiance, de caractère d'urgence et de peur

- ***B3 Module 1 Partie 2 - Malwares et autres schémas d'attaque***

  - Indicateurs de compromission : définition et exemples

### Séance 2 -  Jeudi 07/09 (CS 02)

- ***B3 Module 1 Partie 1 - Ingénierie Sociale***

  - Dévoiement (notions d'empoisonnement DNS)

  - Récolte d'identifiants de connexion et _Credential Stuffing_

  - _Tailgating_, _Prepending_ (+ utilisation d'IA)

  - Usurpation d'identité

### Séance 1 - Mardi 05/09 (CS 01)

- Introduction générale au fonctionnement par modules et à l'apprentissage de la cybersécurité

- Présentation du programme du module 1

- ***B3 Module 1 Partie 1 : Ingénierie Sociale***

  - Techniques d'hameçonnage, _phishing_, _smishing_, concepts de _spamming_, _vishing_, hameçonnage ciblé, attaque « Fraude au Président »

  - _Dumpster Diving_, _Shoulder Surfing_

  - Notion de rapport sécurité/coût : où placer le « curseur » ?
