import java.util.Scanner;

public class B1_BDP_M1_M2_GA_20231012_correction {

  public static void main(String[] args) {

    // 1. Définition du nombre à trouver, codé "en dur"

    int nbOrdi = 47;

    // 2. Message d'introduction

    System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");

    // 3. Récupération du nombre joueur

    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez un nombre : ");
    int nbJoueur = clavier.nextInt();
    clavier.close();

    // 4. Affichage du nombre joueur

    System.out.println("Vous avez proposé " + nbJoueur);

    // 5. Calcul de l'écart (valeur absolue)

    int ecart = Math.abs(nbOrdi - nbJoueur);

    // 6. Test et affichage des résultats

    if (ecart != 0) {
      // Perdu
      System.out.println("Vous avez perdu !");
      System.out.println("Le nombre auquel je pensais était : " + nbOrdi);
      System.out.println("Vous étiez à " + ecart + " de la bonne réponse.");
    } else {
      // Gagné
      System.out.println("Vous avez gagné !");
    }
  }
}
