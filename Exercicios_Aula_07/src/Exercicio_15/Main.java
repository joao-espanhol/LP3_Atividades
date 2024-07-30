//Escrever um programa que verifica se uma data é antes ou depois de outra data.
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
            int mes1 = Integer.parseInt(reader.readLine()) - 1;
            System.out.print("Ano: ");
            int ano1 = Integer.parseInt(reader.readLine());
            
            System.out.println("\nSegunda data:");
            System.out.print("Dia: ");
            int dia2 = Integer.parseInt(reader.readLine());
            System.out.print("Mês: ");
            int mes2 = Integer.parseInt(reader.readLine()) - 1;
            System.out.print("Ano: ");
            int ano2 = Integer.parseInt(reader.readLine());
            
            Date date1 = new Date(ano1, mes1, dia1), date2 = new Date(ano2, mes2, dia2);
            
            long millieDate1 = date1.getTime(), millieDate2 = date2.getTime();
            
            if(millieDate2 > millieDate1) System.out.println(String.format("\n%02d/%02d/%04d", dia1, mes1 + 1, ano1) + " é a data mais recente.");
            else if (millieDate2 == millieDate1) System.out.println("\nAs datas são iguais!");
            else System.out.println(String.format("\n%02d/%02d/%04d", dia2, mes2 + 1, ano2) + " é a data mais recente.");    
        } catch (IOException e) {
            e.printStackTrace();
        }
	reader.close();
	}
}
