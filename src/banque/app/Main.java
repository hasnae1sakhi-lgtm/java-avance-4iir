
package banque.app;

import banque.model.CompteBancaire;
import banque.model.CompteStandard;
import banque.model.ComptePremium;

public class Main {

    public static void main(String[] args) {

        // Question 6 : creation d'un compte Standard
        CompteBancaire c1 =
                new CompteStandard("STD001", "Aya");

        // Question 7 : creation d'un compte Premium
        CompteBancaire c2 =
                new ComptePremium("PRE001", "Sara", 5000);

        // Affichage des informations
        System.out.println("=== Compte Standard ===");
        c1.afficherInfos();

        System.out.println();

        System.out.println("=== Compte Premium ===");
        c2.afficherInfos();

        // Test : un solde initial negatif est interdit
        System.out.println();
        System.out.println("=== Test d'un compte invalide ===");

        try {
            CompteBancaire invalide =
                    new ComptePremium("PRE002", "Salima", -580);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
