import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);             

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

        entrada.close();
        

    }
    
}
