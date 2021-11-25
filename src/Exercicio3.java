import java.util.Scanner;

public class Exercicio3 {

public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        double preco, reajuste;
        String nomeProduto;

        System.out.print("\n Informe o preço do produto: \n");
        preco = entrada.nextDouble();
        System.out.print("Informe o nome do produto: ");
        nomeProduto = entrada.next();
        System.out.print("Digite o percentual de reajuste: ");
        reajuste = entrada.nextDouble();

        Produto prod = new Produto(nomeProduto, preco);
        prod.ReajustarPreco(reajuste);
        System.out.println(prod);

        System.out.println("\n -------- Produto 2 --------");
        Produto prod2 = new Produto();
        
        System.out.println(prod2);

        entrada.close();    
    }

}
