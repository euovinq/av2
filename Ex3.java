import java.util.Scanner;

public class Ex3 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Digite a quantidade de números: ");
        int qtd = sc.nextInt();
        int[] numeros = criarArray(qtd);
        System.out.println(verificarArray(numeros));


    }

    static int[] criarArray(int qtd){

        int[] array = new int[qtd];

        for(int i = 0; i < qtd; i++){

            System.out.printf("Digite o %d número: ", i+1);
            array[i] = sc.nextInt();
        }

        return array;
    }

    static String verificarArray(int[] array){

        boolean menor = true;
        boolean maior = true;

        for(int i = 1; i < array.length; i++){

            if(array[i - 1] < array[i]){
                menor = false;
            }else{
                maior = false;
            }

                    
        }

        if(maior){
            return "Ordem crescente";
        } else if( menor ){
            return "Ordem decrescente";
        } else{
            return "Desordenados";
        }

    }
}
