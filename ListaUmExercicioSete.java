import java.util.Scanner;

public class ListaUmExercicioSete {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double salarioFixo, valorDasVendas, percentualDeGanhoPorMes, salarioTotal, ganhoPorCadaVenda;

        System.out.println("Salário fixo do vendedor:");
        salarioFixo = scanner.nextDouble();

        System.out.println("Valor total das vendas que ele realizou do mês:");
        valorDasVendas = scanner.nextDouble();

        System.out.println("Percentual que ele recebe por cada venda no mês:");
        percentualDeGanhoPorMes = scanner.nextDouble() /100;

        ganhoPorCadaVenda = valorDasVendas * percentualDeGanhoPorMes;

        salarioTotal = (salarioFixo + ganhoPorCadaVenda );

        System.out.println("O salário total deste vendedor é:" + salarioTotal);
    }
}
