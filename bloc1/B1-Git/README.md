# B1-Git : TP Gestion de versions avec Git

## Introduction

Le TP est à effectuer entièrement en ligne de commande (CLI = _Command Line Interface_), sauf utilisation annexe de VS Code, notamment pour éditer des fichiers.

Le rendu va consister à fournir au professeur votre dépôt de travail, que vous devrez créer lors du TP. Ce dépôt contiendra le résultat des commandes du TP, ainsi qu'un fichier-réponse. Pour cela, voici la procédure à suivre :

- Copiez la partie « Travail à faire » dans un fichier local `reponses.md` (ne sélectionnez pas directement le texte à copier, cliquez d'abord sur le bouton `Raw` en haut à droite de la zone de texte, cela vous permettra de conserver le formatage)
- Ajoutez votre nom en tout début du fichier `reponses.md`
- Écrivez la totalité des commandes que vous effectuez, au fur et à mesure, _juste en dessous_ de chacune des étapes demandées
- De même pour les réponses aux questions spécifiques
- Le fichier-réponse ainsi constitué devra être placé dans votre dépôt de travail, avec tous les autres fichiers que vous aurez créés pour le TP.
- Ce dépôt devra être hébergé sur GitHub (utilisez VS Code pour publier le dépôt automatiquement)
- Vous ajouterez le compte GitHub `rose-line` en tant que collaborateur : cela enverra automatiquement une notification sur le compte en question
- Vous committerez vos réponses au fur et à mesure, quand vous le souhaitez, sans oublier de « pousser » (_push_) vos modifications en ligne à la fin de la séance

D'autre part, à chaque étape marquée **_VALIDATION PROF_**, vous ferez valider votre progression par le professeur durant la séance.

## Prérequis

Le nécessaire a déjà été installé au premier semestre. Revoir les procédures d'installation si besoin ([ressources B1 semestre 1](../s1.md)).

- Visual Studio Code
- Git (_Git Bash_ est normalement également installé en même temps)
- Configuration de base (`user.name` et `user.email`) :
  - si ce n'est pas fait, Git vous le rappellera lors de la tentative de premier _commit_
  - et vous donnera les commandes à exécuter pour la configuration (spécifier votre identifiant et votre email GitHub)

## Éditeur VI

Git aura parfois besoin d'ouvrir un éditeur de texte. Par défaut, l'éditeur de texte fourni avec _Git Bash_ est `vi`, qui est assez spartiate. C'est l'éditeur de texte fourni sur la quasi totalité des distributions Linux, et il est donc utile de connaître un minimum les commandes de base pour pouvoir l'utiliser (parfois c'est le seul éditeur dont on dispose sur un terminal, un serveur distant...).

Il n'y a que quatre choses à savoir (mais il faut les savoir par coeur) :

- `i` pour passer en mode _insertion_ (le mode par défaut est _commande_, dans lequel vous ne pouvez pas écrire de texte) ; on peut alors éditer le fichier
- `Esc` (touche `Echap` du clavier) pour revenir au mode _commande_ lorsque l'on a fini d'éditer
- `:wq!` pour enregistrer et quitter (_**w**rite_ et _**q**uit_)
- `:q!` pour quitter sans enregistrer

Il faut donc toujours passer en mode _insertion_ pour éditer le fichier, puis revenir en mode _commande_ pour enregistrer et quitter.

NB : Vous pouvez configurer Git pour utiliser un autre éditeur, par exemple VS Code :

```
git config --global editor.core "code -w"
```

## Annexe

Vous utiliserez notamment ce [résumé des commandes Git les plus utilisées](commandes_git.md) pour trouver les commandes Git à exécuter dans le « travail à faire ».

## Travail à faire

- [Partie 1](part01.md) : Création d'un dépôt et _commits_
- [Partie 2](part02.md) : Gestion de branches
- [Partie 3](part03.md) : Fusion de branches
