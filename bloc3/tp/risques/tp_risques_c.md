# Protection des données à caractère personnel (correction)

## Parti 1 - Recensement des traitements sur les DCP

Q1. (Doc. 1) **Identifiez les DCP parmi celles recueillies lors de la réalisation d'une étude de marché. Justifiez votre réponse.**

_La CNIL définit une donnée à caractère personnel comme « toute information se rapportant à une personne physique identifiée ou identifiable »._

_Au regard de cette définition, parmi les données recueillies lors de la réalisation d'une étude de marché(doc. 1), celles à caractère personnel sont : le nom, le prénom, l'adresse complète et l'adresse courriel de la personne interrogée._

---

Après réception de l'accord oral de la personne interrogée, les opérateurs du centre d'appel peuvent enregistrer la conversation téléphonique afin de ne pas commettre d'erreurs dans la collecte des informations. Dans ce cas, les opérateurs précisent la finalité de l'enregistrement.

Q2. En vous documentant sur le site de la CNIL, **analysez la conformité de la situation décrite ci-dessus avec les directives de la CNIL.**

[CNIL : Enregistrement ou écoute des conversations téléphoniques : faut-il informer ses clients/usagers ?](https://www.cnil.fr/fr/cnil-direct/question/enregistrement-ou-ecoute-des-conversations-telephoniques-faut-il-informer-ses)

_KLIENTE répond seulement au premier point mentionné dans l'article de la CNIL : l'objectif de l'enregistrement de la conversation est précisé par l'opérateur._

_En revanche, les obligations suivantes ne sont pas respectées envers les personnes interrogées :_

- _qui sont les destinataires des écoutes ou enregistrements (service de formation, service client, etc.) ;_
- _l'information sur le droit d'opposition ;_
- _l'information sur le droit d'accès aux enregistrements._

---

Un de vos collègue de l'équipe informatique a schématisé le processus de gestion des appels téléphoniques pour la réalisation d'une étude de marché. Il a également réalisé un tableau permettant de lister les opérations effectuées sur les DCP tout au long de ce processus.

Q3. (Doc. 2, 3) **Complétez le tableau de recensement des opérations réalisées lors d'une étude de marché chez KLIENTE.**

| Opération                                                                             | Référence | Finalité                                     | Catégories de DCP concernées                        | Catégories de personnes concernées | Destinataires               |
| ------------------------------------------------------------------------------------- | --------- | -------------------------------------------- | --------------------------------------------------- | ---------------------------------- | --------------------------- |
| Enregistrement d'un appel                                                             | OP-01     | Preuve de l'appel                            | Vie personnelle                                     | Prospect                           | Client et service interne   |
| Collecte et sauvegarde des réponses au questionnaire                                  | OP-02     | Sauvegarde pour traitements ultérieur        | Identité, données d'identification, vie personnelle | Prospect                           | Client et services internes |
| Vérification et modifications des réponses suite à l'écoute de l'enregistrement audio | OP-03     | Vérification des réponses collectées         | Identité, données d'identification, vie personnelle | Propect                            | Client et services internes |
| Traitement des données collectées pour réaliser une synthèse par un logiciel          | OP-04     | Synthèse de l'étude de marché pour le client | Identité, données d'identification, vie personnelle | Prospect                           | Client et services internes |

---

KLIENTE désire mobiliser plusieurs canaux (par exemple : courriel, téléphone et SMS) pour sa collecte de données. L'application ComPlus SMS (doc. 6) est actuellement testée pour accompagner cette démarche. Certains incidents sont malheureusement déjà remontés.

Q4. (Doc. 4, 5, 6) **Repérez les difficultés rencontrées avec la nouvelle application. Précisez en quoi elles contribuent à affaiblir la protection des DCP.**

_Les plateformes des centres d'appel sont désormais capables de gérer les demandes en provenance de plusieurs canaux (site internet, courriel, sms, appel vidéo, etc.). La variété des technologies et des supports de collecte de données implique des protocoles réseau et des formats de fichier différents (XML, JSON, etc.) qui nécessitent différents traitements. Le multicanal influence donc le traitement des DCP pour les centres d'appel comme KLIENTE._

**_Solution au Ticket n° 1 :_**

_Une inversion de date est constatée suite à l'utilisation de formats de données différents. C'est l'intégrité de la donnée qui est en jeu. Les formats doivent être uniformisés pour toutes les données de type « date » quel que soit le canal utilisé pour collecter les données._

**_Solution au Ticket n° 2 :_**

_Certaines données doivent être saisies par un opérateur, c'est le cas pour les données émanant des entretiens téléphoniques. Cette saisie peut entraîner des erreurs et toucher à l'intégrité de données._

---

## Partie 2 - Identification des risques liés aux DCP

Q1. (Doc. 7, 8) **Identifiez, dans la description du contexte, les éléments permettant d'identifier les vulnérabilités liées au traitement des DCP.**

_L'intérêt d'une potentielle attaque réside dans la nature même des données collectées et dans la finalité de traitement de ces dernières._

_Pour KLIENTE, certaines données sont à caractère personnel. Le cycle de vie des données lié au traitement (doc. 8) décrit les différentes opérations réalisées et permet d'identifier celles plus ou moins vulnérables à une attaque._

_La collecte des réponses chez KLIENTE peut engendrer des vulnérabilités sur les DCP (enregistrement audio et sauvegarde par un opérateur des données collectées)._

_La liste des supports des données mobilisés lors du processus permet de reconnaître le plus vulnérable à une attaque. La communication via le téléphone IP peut être écoutée. L'ordinateur de bureau utilisé par l'opérateur peut subir une panne ou être la cible d'une attaque._

---

L'identification des menaces et des événements redoutés est un préalable à la cartographie des risques.

Q2. (Doc. 9, 10) **Complétez le tableau d'analyse des scénarios de menaces présenté dans le document 10. Justifiez les niveaux de vraisemblance retenus pour chaque menace.**

| Source de menace                                         | Type de menace             | Bien support              | Niveau de vraisemblance                                                                  | Confidentialité                                                       | Disponibilité                                           | Intégrité                         |
| -------------------------------------------------------- | -------------------------- | ------------------------- | ---------------------------------------------------------------------------------------- | --------------------------------------------------------------------- | ------------------------------------------------------- | --------------------------------- |
| Scénario de menace lié au risque 1 : attaquant extérieur | Espionnage                 | Ordinateur de l'opérateur | **2** : les données ne sont présentes que sur le serveur de BDD                          | L'authentification n'est plus assurée aux seules personnes habilitées |                                                         |                                   |
| Scénario de menace lié au risque 2 : salarié (interne)   | Espionnage,destabilisation | Serveur de BDD            | **4** : techniquement, l'action est facile à mettre en oeuvre                            | Si vol : des personnes non autorisées vont consulter les données      | Si suppression : les données ne seront plus disponibles | Si suppression                    |
| Scénario de menace lié au risque 3 : salarié (interne)   | Non intentionnelle         | Ordinateur de l'opérateur | **2** : la confidentialité est normalement assurée par l'authentification des opérateurs | Le salarié n'est pas habiliter à accéder aux données                  |                                                         |                                   |
| Scénario de menace lié au risque 4 : attaquant extérieur | Destabilisation            | Serveur de BDD            | **3** : aucune protection du serveur de BDD depuis l'extérieur n'est mentionnée          |                                                                       |                                                         | Modification de données constatée |
| Scénario de menace lié au risque 5 : attaquant extérieur | Destabilisation            | Serveur de BDD            | **3** : aucune protection du serveur de BDD depuis l'extérieur n'est mentionnée          |                                                                       | Rend le serveur indisponible                            |                                   |

Échelle de niveaux de vraisemblance : 1 (faible), 2 (limité), 3 (important), 4 (maximal).

---

Q3. (Doc. 9, 10, 11) **Retrouvez, pour chaque risque mentionné, l'événement redouté et son niveau de gravité estimé, en reprenant et complétant le document 11.**

| Valeur métier ou scénario | Événement redouté                 | Impacts                                                                         | Niveau gravité |
| ------------------------- | --------------------------------- | ------------------------------------------------------------------------------- | -------------- |
| Scénario 1                | Usurpation d'identité             | Les données confidentielles peuvent être exploitées par une entité malveillante | **3**          |
| Scénario 2                | Vol de données (sans suppression) | Certaines données partent à la concurrence                                      | **3**          |
| Scénario 2                | Suppression de données            | Certaines données ne sont plus accessibles                                      | **3**          |
| Scénario 3                | Consultation de données           | Se limite à un périmètre restreint                                              | **2**          |
| Scénario 4                | Altération de données             | Altère le résultat des études de marché                                         | **3**          |
| Scénario 5                | Arrêt du SGBD                     | Plus aucune donnée accessible                                                   | **4**          |

Échelle de niveaux de gravité : 1 (faible), 2 (limité), 3 (important), 4 (maximal).

---

Q4. **Cartographiez les risques liés au traitement des DCP par un schéma croisant les niveaux de vraisemblance et de gravité déterminés précédemment.**

**Résumé des risques identifiés :**

|          | Scénario        | Vraisemblance | Gravité |
| -------- | :-------------- | :-----------: | :-----: |
| Risque 1 | 1               |       2       |    3    |
| Risque 2 | 2 (vol)         |       4       |    3    |
| Risque 3 | 2 (suppression) |       4       |    3    |
| Risque 4 | 3               |       2       |    2    |
| Risque 5 | 4               |       3       |    3    |
| Risque 6 | 5               |       3       |    4    |

**Cartographie des risques** : en abscisses (vers la droite) : vraisemblance ; en ordonnées (vers le haut) : gravité

|     |     |     |     |        |
| :-: | :-: | :-: | :-: | :----: |
| G-4 |     |     | R6  |        |
| G-3 |     | R1  | R5  | R2, R3 |
| G-2 |     | R4  |     |        |
| G-1 |     |     |     |        |
|     | V-1 | V-2 | V-3 |  V-4   |

---

Q5. **Rédigez une note de synthése à l'intention du DSI pour l'informer des risques identifiés et leur hiérarchisation.**

Monsieur ...,

Six risques ont été identifiés avec des particularités propres à chacun. Les sources de menace identifiées sont des attaques de personnes malveillantes situées en interne (salarié) ou à l'extérieur de notre société. Les types de menaces sont l'espionnage au profit de concurrents ou la recherche de déstabilisation de notre processus d'étude de marché. Il est à noter une menace non intentionnelle correspondante à une erreur de manipulation d'un salarié.

Pour chaque menace, vous trouverez une évaluation de sa vraisemblance. Il semble que la récupération de données à caractère personnel suite au départ d'un salarié mécontent soit la menace la plus vraisemblable.

Une liste des événements redoutés permet de mesurer leur niveau de gravité suivant leurs impacts prévisibles sur les données à caractère personnel. Ainsi, l'arrêt du serveur de base de données apparaît comme l'événement redouté dont l'impact serait le plus préoccupant. Une hiérarchisation nous permet d'identifier les risques majeurs suivants à surveiller :

- Risque 2 et 3 : vol/suppression de données dans la base de données de KLIENTE par un salarié mécontent dans l'objectif de les communiquer à un concurrent (vol) ou destabiliser (suppression pure)
- Risque 5 : altération de données sur le serveur de base de données par un attaquant extérieur afin de destabiliser les campagnes d'études de marché de KLIENTE.
- Risque 6 : arrêt du serveur de base de données par une attaque extérieure en réalisant une multitude de requêtes.
