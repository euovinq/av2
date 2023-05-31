
import java.util.Scanner;

public class Ex4 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Digite a quantidade de notas: ");
        int qtd = sc.nextInt();
        double[] notas = criarArray(qtd);
        exibir(notas);



    }

    static double[] criarArray(int qtd){

        double[] array = new double[qtd];

        for( int i = 0; i < array.length; i++){

            System.out.printf("Digite a %d nota: ", i+1);
            array[i] = sc.nextDouble();

        }
        return array;
    }

    static double media(double[] array){

        double media = 0;

        for(double x : array){
            media += x;
        }
        return media / array.length;
    }

    static double maior(double[] array){

        double nota = array[0];

        for(double x : array){
            if(nota < x){
                nota = x;
            }
        }
        return nota;
    }

    static double menor(double[] array){

        double nota = array[0];

        for(double x : array){
            if(nota > x){
                nota = x;
            }
        }
        return nota;
    }

    static void exibir(double[] array){
        System.out.println();
        System.out.printf("A maior nota é %.1f\n", maior(array));
        System.out.printf("A menor nota é %.1f\n", menor(array));
        System.out.printf("A média é %.1f\n", media(array));
        System.out.println();
        System.out.println("Notas digitas: ");
        for(int i = 0; i < array.length; i++){

            if(i == array.length - 1){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + " - ");
            }

        }
    }
}
