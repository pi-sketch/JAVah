
import java.util.Scanner;

public class Giocatore extends Thread{
    private String nome = "Miguel";  
    private Scanner SCANNERIZZATORE = new Scanner(System.in);
    private int numero;  
    private int punteggio = 0 ;
    Gestoregioco gg;
    
    
     
    public Giocatore(String nome) {
        this.nome = nome;
    } 
    public Giocatore(String nome, Gestoregioco gestore){
        this.nome =nome;
        this.gg = gestore;
    }
    public void comunica() {
        System.out.println("sono " + nome + " iniziamo!!");
    }

    private void gioca() {
            System.out.println("inserisci il numero del giocatore");
            numero = SCANNERIZZATORE.nextInt();
            System.out.println("scelto il numero " + numero);
            Gestoregioco.verificaNum(numero);
    }
    
    @Override
    public void run(){
        super.run();
        comunica();

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("");
        }

        gioca();
        
    }
    
}
