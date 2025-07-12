package Ex1StampaAlternata;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        Esercizio 1 – Stampa alternata tra due thread
        Due thread devono stampare alternatamente i numeri da 1 a 20, uno stampa i dispari, l'altro i pari.
        Usare due semafori per garantire l'alternanza corretta.

        un contatore parte, da 1 a 20
        se il contatore è pari: pariThread stampa
        se il contatore è dispari: disThread stampa
         */
        Contatore c = new Contatore ();
        OddThread dispariPrinter = new OddThread (c);
        PariThread pariPrinter = new PariThread (c);

        dispariPrinter.start();
        pariPrinter.start ();

        dispariPrinter.join();
        pariPrinter.join ();

        System.out.println("Fine stampa");

    }
}