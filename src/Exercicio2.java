import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

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

        entrada.close();
    }
    
}
