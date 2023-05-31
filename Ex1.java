import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("JokenPô");
        System.out.println();
        System.out.println("Escreva a sua jogada. (Pedra, Papel ou Tesoura)");
        String jogada = sc.next();
        String bot = jogadaBot();
        System.out.println();
        System.out.println(jokenpo(jogada, bot));


    }

    static String jogadaBot(){

        Random rdn = new Random();
        
        int jogada = rdn.nextInt(3);

        switch (jogada) {
            case 0:
                
                return "Pedra";
            case 1:
                
                return "Papel";
        
            default:
                return "Tesoura";
        }

    }
    
    static String jokenpo(String jogador, String bot){

        String vencedor = null;

        if(jogador.equalsIgnoreCase("pedra") && bot.equalsIgnoreCase("Papel")){
            vencedor = "Máquina";
        } else if(bot.equalsIgnoreCase("pedra") && jogador.equalsIgnoreCase("Papel")){
            vencedor = "Jogador";
        } else if(bot.equalsIgnoreCase("pedra") && jogador.equalsIgnoreCase("tesoura")){
            vencedor = "Máquina";
        } else if(bot.equalsIgnoreCase("tesoura") && jogador.equalsIgnoreCase("pedra")){
            vencedor = "Jogador";
        } else if(bot.equalsIgnoreCase("tesoura") && jogador.equalsIgnoreCase("papel")){
            vencedor = "Máquina";
        } else if(bot.equalsIgnoreCase("papel") && jogador.equalsIgnoreCase("tesoura")){
            vencedor = "Jogador";
        } 


        if(vencedor != null){
            return String.format("%s x %s \n%S venceu!", jogador.toUpperCase(),bot.toUpperCase(),vencedor);
        }else{
            return String.format("%s x %s \nEMPATE!", jogador.toUpperCase(),bot.toUpperCase());
        }

    }
}