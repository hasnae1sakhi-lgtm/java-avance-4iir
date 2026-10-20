
package banque.model;

public class CompteStandard extends CompteBancaire {

    public CompteStandard(String numero, String titulaire) {
        super(numero, titulaire);
    }

    @Override
    public double calculerFraisMensuels() {
        return 10.0;
    }
}
