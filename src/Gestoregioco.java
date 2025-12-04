  

public class Gestoregioco {
    static int numeroVincente = 0;
    public Gestoregioco(){
        numeroVincente = 9;
    }
    public static void verificaNum(int num){
        if (num == numeroVincente){
            System.out.println("bravo!!!");
        }else System.out.println("non hai indovinato");
    }
}
