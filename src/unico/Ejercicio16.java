package unico;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*Realiza un programa que, dado un día de la semana 
		  (de lunes a viernes) y una hora (horas y minutos), 
		  calcule cuántos minutos faltan para el fin de semana. 
		  Se considerará que el fin de semana comienza el viernes a las 15:00h. 
		  Se da por hecho que el usuario introducirá un día y hora correctos, 
		  anterior al viernes a las 15:00h
		 */
		
		Scanner leer = new Scanner (System.in);
		
		final int DIAF = 5;
		final int HORAF = 24;
		final int MINUTOSF = 60;
		final int RESET_HORA = 15;
		
		int dia;
		int hora;
		int minutos;
		int dia_quedan;
		int horas_quedan;
		int minutos_quedan;
		
		
		System.out.print("Introduzca el dia de la semana[1-5]: ");
		dia = Integer.parseInt(leer.nextLine());
		System.out.print("Hora: ");
		hora = Integer.parseInt(leer.nextLine());
		System.out.print("Minutos: ");
		minutos = Integer.parseInt(leer.nextLine());
		
		dia_quedan = DIAF - dia;
		
		if (hora > RESET_HORA) {
			horas_quedan = (dia_quedan * HORAF) + (HORAF - hora) + RESET_HORA;
		}
		else {
			horas_quedan = (dia_quedan * HORAF) + (RESET_HORA - hora);
		}
		
		
		minutos_quedan = MINUTOSF * horas_quedan + (MINUTOSF - minutos);
		
		System.out.println("Quedan " + minutos_quedan + " minutos");
		
		
		
	}

}
