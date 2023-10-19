import java.util.Scanner;

public class B1_BDP_M1_GB_20231012_correction {

  public static void main(String[] args) {

    // 1. Définition du nombre à trouver, codé "en dur"

    int nbOrdi = 47;

    // 2. Message d'introduction

    System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");

    // 3. Récupération du nombre joueur

    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez un nombre : ");
    int nbJoueur = clavier.nextInt();
    clavier.close(); // on "rend" la ressource clavier

    // 4. Affichage des deux nombres

    System.out.println("Vous avez proposé " + nbJoueur);
    System.out.println("Le nombre auquel je pensais était : " + nbOrdi);

    // 5. Calcul de l'écart

    int ecart = Math.abs(nbOrdi - nbJoueur);

    // 6. Affichage de l'écart

    System.out.println("Vous étiez à " + ecart + " de la bonne réponse.");
  }
}
