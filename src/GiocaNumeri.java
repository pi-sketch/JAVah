public class GiocaNumeri {
    public static void main(String[] args){
        System.out.println("INIZIA IL GIOCO");
        Giocatore g1 = new Giocatore("Mario");
        Giocatore g2 = new Giocatore("Luigi");
        g1.start();
        g2.start();

        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.err.println("errore nell'interruzione del thread");
        }
        
        System.out.println("fineeee");
    }
}
