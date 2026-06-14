package context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Atributos
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        String mensaje = "";

        //Menu
        switch (num) {

	        case 1:
	            mensaje = "Lunes";
	            break;
	
	        case 2:
	            mensaje = "Martes";
	            break;
	
	        case 3:
	            mensaje = "Miércoles";
	            break;
	
	        case 4:
	            mensaje = "Jueves";
	            break;
	
	        case 5:
	            mensaje = "Viernes";
	            break;
	
	        case 6:
	            mensaje = "Sábado";
	            break;
	
	        case 7:
	            mensaje = "Domingo";
	            break;
	
	        default:
	            mensaje = "¡ERROR!\nNo coincide con un día de la semana";
	            break;
        }
        System.out.println(mensaje);
        sc.close();
    }
}