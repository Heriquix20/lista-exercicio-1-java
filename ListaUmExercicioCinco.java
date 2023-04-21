import java.util.Scanner;

public class ListaUmExercicioCinco {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    double salarioBruto, horasPorMes, valorPorHoraDeTrabalho, numeroDeFilhos, salarioFamiliaTotal, valorPorMes;

    System.out.println("\nInforme as horas trablhadas por mês:");
    horasPorMes = scanner.nextDouble();

    System.out.println("\nInforme o valor recebido por hora de trabalho:");
    valorPorHoraDeTrabalho = scanner.nextDouble();

    System.out.println("\nInforme o número de filhos com idade menor que 14 anos:");
    numeroDeFilhos = scanner.nextDouble();

    salarioFamiliaTotal = numeroDeFilhos *59.82;

    valorPorMes = horasPorMes * valorPorHoraDeTrabalho;

    salarioBruto = salarioFamiliaTotal + valorPorMes;

    System.out.println("\nO salário bruto deste funcionário é de: R$" + salarioBruto);

    }
}
