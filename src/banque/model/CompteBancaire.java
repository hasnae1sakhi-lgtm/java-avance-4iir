
package banque.model;

public abstract class CompteBancaire {

    private String numero;
    private String titulaire;
    private double solde;
    private boolean actif;
    private Double plafondRetrait;

    // Constructeur sans solde initial
    public CompteBancaire(String numero, String titulaire) {
        this(numero, titulaire, 0);
    }

    // Constructeur avec solde initial
    public CompteBancaire(String numero, String titulaire, double soldeInitial) {
        if (soldeInitial < 0) {
            throw new IllegalArgumentException(
                "Le solde initial ne peut pas être négatif."
            );
        }

        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
        this.actif = true;
        this.plafondRetrait = null;
    }

    public void afficherInfos() {
        System.out.println("Numéro : " + numero);
        System.out.println("Titulaire : " + titulaire);
        System.out.println("Solde : " + solde + " MAD");
        System.out.println("Actif : " + actif);
        System.out.println("Plafond de retrait : " + plafondRetrait);
        System.out.println("Frais mensuels : "
                + calculerFraisMensuels() + " MAD");
    }

    public abstract double calculerFraisMensuels();

    public String getNumero() {
        return numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public boolean isActif() {
        return actif;
    }

    public Double getPlafondRetrait() {
        return plafondRetrait;
    }
}
