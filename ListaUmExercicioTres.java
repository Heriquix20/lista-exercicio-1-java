import java.util.Scanner;

public class ListaUmExercicioTres {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double grausFahrenheit, grausCentigrados;

    System.out.println("\nInforme a temperatura(Fahrenheit):");
    grausFahrenheit = scanner.nextDouble();

    grausCentigrados = (grausFahrenheit -32) /1.8;

    System.out.println("\nGraus Centígrados é:" + grausCentigrados);
    }
}



