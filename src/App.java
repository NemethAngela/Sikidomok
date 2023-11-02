import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Szamol();

        //SzamolMashogy();

        SzamolBekerve();
    }

    public static void Szamol()
    {
        Kor kor = new Kor(10.0);
        kor.kerületszamol();
        kor.területszamol();
        System.out.println("A kör kerülete: " + kor.kerulet + ", területe: " + kor.terulet);

        Negyzet negyzet = new Negyzet(5.0);
        negyzet.kerületszamol();
        negyzet.területszamol();
        System.out.println("A négyzet kerülete: " + negyzet.kerulet + ", területe: " + negyzet.terulet);

        Teglalap teglalap = new Teglalap(5.0, 10.0);
        teglalap.kerületszamol();
        teglalap.területszamol();
        System.out.println("A téglalap kerülete: " + teglalap.kerulet + ", területe: " + teglalap.terulet);
    }

    private static void SzamolMashogy() {
        ArrayList<ISikidom> lista = new ArrayList<>();

        lista.add(new Kor(10.0));
        lista.add(new Kor(100.0));
        lista.add(new Kor(100.0));
        lista.add(new Kor(1.0));
        lista.add(new Kor(1120.0));
        lista.add(new Kor(10423.0));
        lista.add(new Kor(1032.0));
        lista.add(new Negyzet(5.0));
        lista.add(new Teglalap(5.0, 10.0));

        for (ISikidom sikidom : lista) {
            sikidom.kerületszamol();
            sikidom.területszamol();
            System.out.println("A síkidom kerülete: " + ((Sikidom)sikidom).kerulet + ", területe: " + ((Sikidom)sikidom).terulet);
        }
    }

    private static void SzamolBekerve() {
        System.out.println("Válassz síkidomot: 1-kör, 2-négyzet, 3-téglalap");

        Scanner scan = new Scanner(System.in);
        int valasztottSikidomTipus = scan.nextInt();

        if (valasztottSikidomTipus == 1)
        {
            System.out.println("Add meg a kör sugarát");
            double sugar = scan.nextDouble();
            Kor kor = new Kor(sugar);
            kor.kerületszamol();
            kor.területszamol();
            System.out.println("A kör kerülete: " + kor.kerulet + ", területe: " + kor.terulet);
        }
        else if (valasztottSikidomTipus == 2)
        {
            System.out.println("Add meg a négyzet oldalát");
            double oldal = scan.nextDouble();
            Negyzet negyzet = new Negyzet(oldal);
            negyzet.kerületszamol();
            negyzet.területszamol();
            System.out.println("A négyzet kerülete: " + negyzet.kerulet + ", területe: " + negyzet.terulet);
        }
        else if (valasztottSikidomTipus == 3)
        {
            System.out.println("Add meg a téglalap oldalait:");
            double oldalA = scan.nextDouble();
            double oldalB = scan.nextDouble();
            Teglalap teglalap = new Teglalap(oldalA, oldalB);

            teglalap.kerületszamol();
            teglalap.területszamol();
            System.out.println("A téglalap kerülete: " + teglalap.kerulet + ", területe: " + teglalap.terulet);
        }
        else {
            System.out.println("Rossz választás");
            SzamolBekerve();
        }
    }


}
