import java.util.Scanner;

public class Exercicio4 {
   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente(); //OK Teste
        Pessoa pessoa = new Pessoa(); //OK Teste
        Empregado empregado = new Empregado(); //OK Teste
        Administrador adm = new Administrador(); // OK Teste

        System.out.println("\n ------ ÁREA DO CLIENTE ------\n ");

        System.out.println("Digite o valor do crédito: ");
        double credito = entrada.nextDouble();

        System.out.println("Digite o valor da dívida: ");
        double divida = entrada.nextDouble();
        
        cliente.SetCredMax(credito);
        cliente.SetValorEmDivida(divida);
        cliente.ObterSaldo(credito, divida);
        System.out.println("\n ------ INFORMAÇÕES DO CLIENTE ----- \n \n" + 
                            cliente.toString());

        System.out.println("\n ------ INFORMAÇÕES PESSOAIS ------ \n ");

        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Informe sua altura(Ex: 1,85): "); 
        double altura = entrada.nextDouble();      
        System.out.println("Informe seu peso: ");
        float peso = entrada.nextFloat();

        pessoa.SetNome(nome);
        pessoa.SetIdade(idade);
        pessoa.SetAltura(altura);
        pessoa.SetPeso(peso);

        System.out.println("\n ------ INFORMAÇÕES PESSOAIS ------ \n \n" + pessoa.toString());

        System.out.println("\n ----- ÁREA DO FUNCIONÁRIO ----- \n \n");

        System.out.print("Informe o número da seção: ");
        int numeroSecao = entrada.nextInt();
        System.out.print("Informe o salário base: ");
        double salarioBase = entrada.nextDouble();
        System.out.print("Informe a porcentagem do INSS: ");
        double inss = entrada.nextDouble();

        empregado.SetNumeroSecao(numeroSecao);
        empregado.SetSalarioBase(salarioBase);
        empregado.SetInss(inss);
        empregado.CalcularSalario(salarioBase, inss);
        
        System.out.println("\n ------ INFORMAÇÕES DO FUNCIONÁRIO ------ \n\n" + empregado.toString());

        System.out.println("\n ------ ÁREA DO ADMINISTRADOR ------ \n \n");
       
        System.out.print("Informe o valor do benefício: ");
        double ajudaDeCusto = entrada.nextInt();       

        adm.SetAjudaDeCusto(ajudaDeCusto);
              
        adm.CalcularSalarioAdm(empregado.GetSalarioBase(), empregado.GetInss());

        System.out.println("\n ------ INFORMAÇÕES ------ \n"+ pessoa.toString() + adm.toString());

        entrada.close();
        
    }

}
