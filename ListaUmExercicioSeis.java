import java.util.Scanner;

public class ListaUmExercicioSeis {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double numeroUm, numeroDois, logaritmo;

        System.out.println("\nInforme o primeiro número:");
        numeroUm = scanner.nextDouble();

        System.out.println("\nInforme o segundo número:");
        numeroDois = scanner.nextDouble();
  
        logaritmo = Math.log (numeroUm) / Math.log (numeroDois);

        System.out.printf("\nO logaritmo do número:" + numeroUm + " é:" + "%5f" , logaritmo);
    }
}
