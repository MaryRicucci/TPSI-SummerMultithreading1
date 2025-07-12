package Ex1StampaAlternata;

import java.util.concurrent.Semaphore;

public class Contatore {
    private Semaphore p ;
    private int MAX = 20 ;
    private Semaphore d ;

    public Contatore () {
        p = new Semaphore (0) ; //Il primo numero da stampare è dispari: 1
        d = new Semaphore (1);

    }

    public void PariPrint (int n) throws InterruptedException {
       p.acquire ();
        System.out.println("Pari: "+n);
        d.release();

    }
    public void OddPrint (int n) throws InterruptedException {
      d.acquire();
        System.out.println("Dispari: "+n);
      p.release ();
    }

}
