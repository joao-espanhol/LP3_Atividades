//Criar um programa que calcula a diferença em dias entre duas datas.
import java.util.Date;
import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            System.out.println("Primeira data:");
            System.out.print("Dia: ");
            int dia1 = Integer.parseInt(reader.readLine());
            System.out.print("Mês: ");
            int mes1 = Integer.parseInt(reader.readLine());
            System.out.print("Ano: ");
            int ano1 = Integer.parseInt(reader.readLine());
            
            System.out.println("\nSegunda data:");
            System.out.print("Dia: ");
            int dia2 = Integer.parseInt(reader.readLine());
            System.out.print("Mês: ");
            int mes2 = Integer.parseInt(reader.readLine());
            System.out.print("Ano: ");
            int ano2 = Integer.parseInt(reader.readLine());
            
            Date date1 = new Date(ano1, mes1, dia1);
            Date date2 = new Date(ano2, mes2, dia2);
            
            long millies = Math.abs(date2.getTime() - date1.getTime());
            long days = millies / (24 * 60 * 60 * 1000);
            
            System.out.printf("A diferença das datas em dias é: %d", days);
                   
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}