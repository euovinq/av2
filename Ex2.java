import java.util.Scanner;

public class Ex2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Escreva uma palavra ou frase: ");
        String frase = sc.nextLine();
        if(palindromo(frase)){
            System.out.println("É um palíndromo!");
        }else{
            System.out.println("Não é um palíndromo.");
        }

    }

    static boolean palindromo(String nome){

        String nomeInvertido = "";

        for(int i = nome.length() - 1; i >= 0; i--){

            nomeInvertido += nome.charAt(i);

        }

        if(nomeInvertido.equalsIgnoreCase(nome)){
            
            return true;
        }else{
            return false;
        }

    }
}
