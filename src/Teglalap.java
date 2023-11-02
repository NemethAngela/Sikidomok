public class Teglalap extends Negyzet {

    public Double oldalB;

    public Teglalap(Double oldalAParam, Double oldalBParam) {
        super(oldalAParam);
        oldalB = oldalBParam;
    }

    @Override
    public void területszamol() {
        terulet = oldalA * oldalB;
    }

    @Override
    public void kerületszamol() {
        kerulet = (2 * oldalA) + (2 * oldalB);
    }
}
