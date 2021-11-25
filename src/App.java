import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner entrada = new Scanner(System.in);
        
        //region EXERCÍCIO 1

        int horas = 0, minutos = 0, segundos = 0;
        
        System.out.println("Digite a(s) hora(s): ");
        horas = entrada.nextInt();
        System.out.println("Digite o(s) minuto(s): ");
        minutos = entrada.nextInt();
        System.out.println("Digite o(s) segundo(s): ");
        segundos = entrada.nextInt();
        
        Time time =  new Time();

        Time time1 =  new Time(horas);
        time1.SetHoras(horas);
        
        Time time2 =  new Time(horas, minutos);
        time2.SetHoras(horas);
        time2.SetMinutos(minutos);

        Time time3 =  new Time(horas, minutos, segundos);
        time3.SetHoras(horas);
        time3.SetMinutos(minutos);
        time3.SetSegundos(segundos);
               
        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);


        //endregion
        
        //region EXERCÍCIO 2
        
        double raio;
        int menu, coordenadaX, coordenadaY, aumento, repetir;

        Circulo circulo = new Circulo();

        System.out.println("Insira a coordenada X: ");
        coordenadaX = entrada.nextInt();
        System.out.println("Insira a coordenada Y: ");
        coordenadaY = entrada.nextInt();
        System.out.println("Digite o raio: ");
        raio = entrada.nextDouble();
        circulo.SetRaio(raio);     
         
        do{

        System.out.println("Selecione uma opção no menu: \n 1 - Mover \n 2 - Aumentar \n 3 - Imprimir \n 4 - Sair");
        menu = entrada.nextInt();

        switch(menu)
        {
            case 1:
            circulo.MoverX(coordenadaX);
            circulo.MoverY(coordenadaY);
            break;

            case 2:          
            System.out.println("Em quantas vezes deseja aumentar o raio: ");
            aumento = entrada.nextInt();
            circulo.AumentarRaio(aumento);
            break;

            case 3:
            System.out.println(circulo);
            break;

            case 4:
            System.exit(0);
            break;

        }

        System.out.println("Deseja repetir a aplicação? (1 - Sim  2 - Não)");
        repetir = entrada.nextInt();
    
        
        } while(repetir == 1);


        System.out.println(circulo);

        //endregion    
    
        //region EXERCÍCIO 3

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

        System.out.println("-------- Produto 2 --------");
        Produto prod2 = new Produto();
        System.out.println(prod2);

        //endregion
        
        //region EXERCÍCIO 4
        
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
        System.out.print("Informe o salário base: ");
        double _salarioBase = entrada.nextDouble();
        System.out.print("Informe a porcentagem do INSS: ");
        double _inss = entrada.nextDouble();

        adm.SetAjudaDeCusto(ajudaDeCusto);
        adm.SetSalarioBase(_salarioBase);
        adm.SetInss(_inss);
        adm.CalcularSalarioAdm(_salarioBase,_inss);

        System.out.println("\n ------ INFORMAÇÕES ------ \n"+ pessoa.toString() + adm.toString());

        entrada.close();
        //endregion
    
    }
}



