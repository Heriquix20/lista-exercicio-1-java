import java.util.Scanner;

public class ListaUmExercicioDois {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    double precoDoProduto, porcentagem, precoAcrescido;

    System.out.println("\nDigite o preço do produto");
    precoDoProduto = scanner.nextDouble();

    porcentagem = precoDoProduto * 0.1;

    precoAcrescido = precoDoProduto + porcentagem;

    System.out.println("\nNovo valor do produto é igual a:" + precoAcrescido);
    }
}


    
  


 



