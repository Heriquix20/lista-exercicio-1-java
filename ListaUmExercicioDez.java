import java.util.Scanner;
import java.lang.Math;
public class ListaUmExercicioDez {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c, mediaArit, mediaHarmo, mediaGeome;

    System.out.println("\nInforme o primeiro número: ");
    a = scanner.nextDouble();

    System.out.println("\nInforme o segundo número: ");
    b = scanner.nextDouble();

    System.out.println("\nInforme o terceiro número: ");
    c = scanner.nextDouble();

    mediaArit =(a+b+c)/3;
    mediaHarmo = (3/(1/a) + (1/b) + (1/c));

    mediaGeome = Math.sqrt(a * b * c);

    System.out.println("\nA média aritimetica dos números são: " + mediaArit + "  a média harmônica é: " + mediaHarmo + " e a média geométrica é: " + mediaGeome);

    }
}
