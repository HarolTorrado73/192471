
import java.util.Scanner;

public class CorrecionB {
    public static void main(String[] args) {
        // Variables para acumular datos y realizar cálculos
        double acumuladoSueldos = 0.0;
        int contadorRango = 0;
        //creamos el Scanner
        Scanner input = new Scanner(System.in);

        //introduccion del sueldo 
        System.out.print("Introduzca el nombre del usuario 1:");
        String usuario1 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p1 = input.nextDouble();
        input.nextLine();
        if (p1 > 0) acumuladoSueldos += p1;

        //usuario 2
        System.out.print("Introduzca el nombre del usuario 2:");
        String usuario2 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p2 = input.nextDouble();
        input.nextLine();
        if (p2 > 0) acumuladoSueldos += p2;
       
        //usuario 3
        System.out.print("Introduzca el nombre del usuario 3:");
        String usuario3 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p3 = input.nextDouble();
        input.nextLine();
        if (p3 > 0) acumuladoSueldos += p3;

        //usuario 4
        System.out.print("Introduzca el nombre del usuario 4:");
        String usuario4 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p4 = input.nextDouble();
        input.nextLine();
        if (p4 > 0) acumuladoSueldos += p4;

        //usuario 5
        System.out.print("Introduzca el nombre del usuario 5:");
        String usuario5 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p5 = input.nextDouble();
        input.nextLine();
        if (p5 > 0) acumuladoSueldos += p5;

        //usuario 6
        System.out.print("Introduzca el nombre del usuario 6:");
        String usuario6 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p6 = input.nextDouble();
        input.nextLine();
        if (p6 > 0) acumuladoSueldos += p6;

        //usuario 7
        System.out.print("Introduzca el nombre del usuario 7:");
        String usuario7 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p7 = input.nextDouble();
        input.nextLine();
        if (p7 > 0) acumuladoSueldos += p7;

        //usuario 8
        System.out.print("Introduzca el nombre del usuario 8:");
        String usuario8 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p8 = input.nextDouble();
        input.nextLine();
        if (p8 > 0) acumuladoSueldos += p8;
        
        //usuario 9
        System.out.print("Introduzca el nombre del usuario 9:");
        String usuario9 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p9 = input.nextDouble();
        input.nextLine();
        if (p9 > 0) acumuladoSueldos += p9;

        //usuario 10
        System.out.print("Introduzca el nombre del usuario 10:");
        String usuario10 = input.nextLine();
        System.out.print("Ingrese el precio:");
        double p10 = input.nextDouble();
        input.nextLine();
        if (p10 > 0) acumuladoSueldos += p10;
        //confirmacion
        System.out.println("usuario1: "+usuario1);
        System.out.println("sueldo: $"+p1);
        System.out.println("usuario2: "+usuario2);
        System.out.println("sueldo: $"+p2);
        System.out.println("usuario3: "+usuario3);
        System.out.println("sueldo: $"+p3);
        System.out.println("usuario4: "+usuario4);
        System.out.println("sueldo: $"+p4);
        System.out.println("usuario5: "+usuario5);
        System.out.println("sueldo: $"+p5);
        System.out.println("usuario6: "+usuario6);
        System.out.println("sueldo: $"+p6);
        System.out.println("usuario7: "+usuario7);
        System.out.println("sueldo: $"+p7);
        System.out.println("usuario8: "+usuario8);
        System.out.println("sueldo: $"+p8);
        System.out.println("usuario9: "+usuario9);
        System.out.println("sueldo: $"+p9);
        System.out.println("usuario10: "+usuario10);
        System.out.println("sueldo: $"+p10);

        if (p2<=0 || p1 <= 0 || p3 <= 0 || p4 <= 0 || p5 <= 0 || p6 <= 0 || p7 <= 0 || p8 <= 0 || p9 <= 0 || p10 <= 0){
            System.out.print("Error: algun sueldo negativo, no puede ser negativo");
            return;
        }
        //rango que desee mirar el usuario o asistente
        System.out.print("Introduzca el inicio del rango: ");
        int rangoInicio = input.nextInt();
        System.out.print("Introduzca el fin del rango: ");
        int rangoFin = input.nextInt();
    //por si teclea valores fuera de logica
        if (rangoInicio > rangoFin){
            System.out.println("el inicio del rango no puedo ser mayor a fin del rango");
            
        }else if (rangoFin < 0 || rangoInicio < 0){
            System.out.println("no puede ser menor a cero");
        }
        //mostrar el rango deseado dentro de los suledos escritos por teclado
        if (p1 >= rangoInicio && p1 <= rangoFin) contadorRango++;
        if (p2 >= rangoInicio && p2 <= rangoFin) contadorRango++;
        if (p3 >= rangoInicio && p3 <= rangoFin) contadorRango++;
        if (p4 >= rangoInicio && p4 <= rangoFin) contadorRango++;
        if (p5 >= rangoInicio && p5 <= rangoFin) contadorRango++;
        if (p6 >= rangoInicio && p6 <= rangoFin) contadorRango++;
        if (p7 >= rangoInicio && p7 <= rangoFin) contadorRango++;
        if (p8 >= rangoInicio && p8 <= rangoFin) contadorRango++;
        if (p9 >= rangoInicio && p9 <= rangoFin) contadorRango++;
        if (p10 >= rangoInicio && p10 <= rangoFin) contadorRango++;

        // Mostrar resultados segun el rango escrito
        // \n es salto de linea
        System.out.println("\nAcumulado de sueldos estetico: " + (float) acumuladoSueldos);
        System.out.println("Cantidad de sueldos entre $" + rangoInicio + " y $" + rangoFin + ": " + contadorRango);

        



    }
}