import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadPersonas = 2;
        int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0;
        double promedioEdad = 0, promedioEstatura = 0, porcentajePersonas = 0;
        int contadorPersonas = 0, acumuladorEdad = 0, acumuladorEstatura = 0;

        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
            System.out.print("Ingrese la edad de la persona " + numeroPersona + ": ");
            edad = sc.nextInt();

            System.out.print("Ingrese el estado civil de la persona " + numeroPersona + " (1. Soltero, 2. Casado): ");
            estadoCivil = sc.nextInt();

            System.out.print("Ingrese la estatura de la persona " + numeroPersona + " en cm: ");
            estatura = sc.nextInt();

            System.out.print("Ingrese el sexo de la persona " + numeroPersona + " (1. Hombre, 2. Mujer): ");
            sexo = sc.nextInt();
            
                if (edad > 18 && estadoCivil == 1 && estatura > 170 && sexo == 1) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
                }
        }

        if (contadorPersonas > 0) {
            promedioEdad = acumuladorEdad / contadorPersonas;
            promedioEstatura = acumuladorEstatura / contadorPersonas;
            porcentajePersonas = (contadorPersonas / (double)cantidadPersonas) * 100;

        System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años");
        System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " cm");
        System.out.println("El porcentaje de las personas que cumplen es del: " + porcentajePersonas + " %");
        }
        else {
             System.out.println("no hay personas que cumplan con la condicion.")
                                }

        sc.close();
    }
}
