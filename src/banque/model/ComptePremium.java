
package banque.model;

public class ComptePremium extends CompteBancaire {

    public ComptePremium(String numero, String titulaire, double soldeInitial) {
        super(numero, titulaire, soldeInitial);
    }

    @Override
    public double calculerFraisMensuels() {
        return 25.0;
    }
}
