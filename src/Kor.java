public class Kor extends Sikidom implements ISikidom {

    public Double sugar;

    public Kor(Double sugarParam) {
        super();
        sugar = sugarParam;
    }

    @Override
    public void területszamol() {
        terulet = sugar * sugar * Math.PI;
    }

    @Override
    public void kerületszamol() {
        kerulet = 2 * sugar * Math.PI;
    }
    
}
