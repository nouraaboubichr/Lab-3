# Exercice 1 — Série harmonique

* L’objectif est de calculer la somme des `n` premiers termes de la série harmonique : `1 + 1/2 + 1/3 + ... + 1/n`.
* La valeur de `n` est lue au clavier, puis une boucle permet de parcourir tous les termes de `1` à `n`.
* Une variable `somme` est utilisée pour accumuler progressivement les différentes valeurs.
* Le type `double` est utilisé afin de conserver les valeurs décimales des divisions.
* Pour obtenir une division réelle en Java, on utilise `1.0 / i` plutôt que `1 / i`.
* La complexité de cette solution est **O(n)**.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

# Exercice 2 — Triangle isocèle d’étoiles

* L’objectif est d’afficher un triangle isocèle composé d’étoiles, dont la hauteur correspond à la valeur `n` fournie en entrée.
* Pour chaque ligne, on affiche d’abord les espaces nécessaires afin de centrer les étoiles.
* Le nombre d’espaces diminue progressivement lorsque l’on descend dans le triangle.
* Le nombre d’étoiles de la ligne `i` est donné par la formule `2 × i - 1`.
* La dernière ligne ne contient aucun espace au début et s’affiche donc directement sur le bord gauche de l’écran.
* La complexité est **O(n²)**, car le nombre total de caractères affichés est proportionnel à `n²`.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183100.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />


# Exercice 3 — Carrés des nombres impairs

* L’objectif est de créer un tableau contenant les carrés des `n` premiers nombres impairs.
* Les nombres impairs sont générés à l’aide de la formule `2 × i + 1`.
* Pour chaque nombre impair, son carré est calculé puis stocké dans le tableau.
* Une deuxième boucle permet ensuite d’afficher chaque nombre impair avec son carré correspondant.
* Par exemple, pour `n = 5`, les nombres utilisés sont `1, 3, 5, 7, 9` et leurs carrés sont `1, 9, 25, 49, 81`.
* La complexité de cette solution est **O(n)** et la mémoire supplémentaire utilisée pour le tableau est **O(n)**.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183200.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />


# Exercice 4 — Classe utilitaire pour les tableaux de doubles

* L’objectif est de réaliser une classe utilitaire permettant de manipuler des tableaux de tableaux de `double`.
* La méthode `affiche(double[][] t)` parcourt les lignes et les colonnes afin d’afficher les valeurs du tableau, avec une ligne d’écran pour chaque ligne du tableau.
* La méthode `regulier(double[][] t)` vérifie que toutes les lignes possèdent la même taille.
* La méthode `sommeLignes(double[][] t)` calcule la somme des éléments de chaque ligne et retourne un tableau contenant les résultats.
* La méthode `somme(double[][] t1, double[][] t2)` vérifie d’abord que les deux tableaux sont réguliers et possèdent les mêmes dimensions.
* Si les conditions ne sont pas respectées, la méthode `somme` renvoie `null`. Sinon, elle additionne les éléments correspondants des deux tableaux.
* Les opérations de parcours des tableaux sont réalisées avec des boucles imbriquées.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183300.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />


# Exercice 5 — Rotation en place d’une matrice N×N

* L’objectif est de faire pivoter une matrice carrée de `90°` dans le sens horaire, directement dans la matrice originale.
* La première étape consiste à effectuer une **transposition** de la matrice en échangeant `A[i][j]` avec `A[j][i]`.
* Pour éviter de faire deux fois les mêmes échanges, seules les positions situées au-dessus de la diagonale principale sont parcourues.
* La deuxième étape consiste à **renverser chaque ligne** en échangeant les éléments situés aux deux extrémités.
* Cette méthode permet d’obtenir une rotation de `90°` sans créer de deuxième matrice `N × N`.
* Seule une variable temporaire est utilisée pour effectuer les échanges, ce qui respecte la contrainte de mémoire supplémentaire **O(1)**.
* Chaque élément de la matrice est parcouru un nombre limité de fois, donc la complexité est **O(N²)**.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183400.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />


# Exercice 6 — Fenêtre glissante : nombre de valeurs distinctes

* L’objectif est de calculer le nombre de valeurs distinctes présentes dans chaque fenêtre de taille `k` d’un tableau d’entiers.
* On utilise un tableau de fréquences `freq` afin de mémoriser le nombre d’apparitions de chaque valeur dans la fenêtre courante.
* Lors de l’initialisation de la première fenêtre, une valeur est considérée comme distincte lorsque sa fréquence passe de `0` à `1`.
* Lorsqu’une fenêtre se déplace, on retire l’élément qui sort et on ajoute le nouvel élément qui entre.
* Si la fréquence de l’élément sortant devient `0`, il n’existe plus dans la fenêtre et le nombre de valeurs distinctes est diminué.
* Lorsqu’un nouvel élément entre et que sa fréquence était `0`, le nombre de valeurs distinctes est augmenté.
* Cette technique permet d’éviter de recompter les éléments de chaque fenêtre à chaque déplacement.
* La solution respecte les contraintes en utilisant uniquement des **boucles et des tableaux**, sans `Set` ni `Map`.
* La complexité est **O(n + MAXV)** et la mémoire supplémentaire est **O(MAXV)**, avec `MAXV = 100000`.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183500.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 183000.png" />

