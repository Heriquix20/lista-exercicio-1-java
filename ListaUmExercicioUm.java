import java.util.Scanner;

public class ListaUmExercicioUm {

    public static void main(String[] args) {
        
        double numeroUm, numeroDois, MediaAritmetica;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritmo Calculo Média Aritmética");
    
        System.out.println("\n\nMe informe um número positivo");
        numeroUm = scanner.nextDouble();

        System.out.println("\n\nMe informe um número positivo");
        numeroDois = scanner.nextDouble();

        MediaAritmetica = (numeroUm + numeroDois) /2;

        System.out.println("A media Aritmetica é igual a:" + MediaAritmetica);
       }
    }

