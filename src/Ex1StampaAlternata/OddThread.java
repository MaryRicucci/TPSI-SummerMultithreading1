package Ex1StampaAlternata;

public class OddThread extends Thread{
    private Contatore c ;

    public OddThread (Contatore c) {
        this.c = c ;
    }

    @Override
    public void run () {
        for (int i = 1 ; i<20; i+=2) {
            try {
                c.OddPrint(i);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" interrotto");
            }
        }
    }
}
