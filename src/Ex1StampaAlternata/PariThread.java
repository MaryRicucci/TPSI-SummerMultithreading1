package Ex1StampaAlternata;

public class PariThread extends Thread{
    private Contatore c ;

    public PariThread (Contatore c) {
        this.c = c ;
    }

    @Override
    public void run (){
        for (int i = 2 ; i<21 ; i+=2) {
            try {
                c.PariPrint(i);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" interrotto");
            }
        }
    }
}
