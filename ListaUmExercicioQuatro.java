import java.util.Scanner;

public class ListaUmExercicioQuatro {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double valorDoCapital, prazoDeAplicacaoMeses, taxaDeJurosMensal, montanteReceber, jurosCompostos;

        System.out.println("\nInforme o valor do capital:");
        valorDoCapital = scanner.nextDouble();

        System.out.println("\nInforme o valor do prazo de aplicação em meses:");
        prazoDeAplicacaoMeses = scanner.nextDouble();

        System.out.println("\nInforme o valor da taxa de juros mensal (Em porcentagem):");
        taxaDeJurosMensal = scanner.nextDouble();

        montanteReceber = valorDoCapital * (1 + Math.pow(taxaDeJurosMensal /100, prazoDeAplicacaoMeses));

        jurosCompostos = montanteReceber - valorDoCapital;

        System.out.printf("%S", "Os juros compostos do capital de " + valorDoCapital + " com o prazo de: " + prazoDeAplicacaoMeses + " meses, com a taxa de: " + taxaDeJurosMensal + "% e um montante de:" + montanteReceber + " é: " + jurosCompostos + "%");
      }
    }