import java.util.Scanner;

public class ListaUmExercicioNove {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numHora, numMinutos, numSegs;

        System.out.println("\nInforme um número(segundos): ");
        numSegs = scanner.nextInt();

        numMinutos = numSegs /60;
        numHora = numMinutos /60;

        System.out.println("\nO tempo do número em horas é: "+ numHora + "horas e em minutos é: " + numMinutos + "minutos e em segundos é: " + numSegs + "segundos");
    }
    
}
