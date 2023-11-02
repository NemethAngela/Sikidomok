public class Negyzet extends Sikidom implements ISikidom {
    
    public Double oldalA;

    public Negyzet(Double oldalParam) {
        super();
        this.oldalA = oldalParam;
    }

    @Override
    public void területszamol() {
        terulet = oldalA * oldalA;
    }

    @Override
    public void kerületszamol() {
        kerulet = 4 * oldalA;
    }
}
