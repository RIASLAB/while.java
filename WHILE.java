import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroEntrada = 0;
        int resultados = 0;
        int control = 0;

        System.out.print("Ingrese el número que desea calcular: ");
        numeroEntrada = sc.nextInt();

        while (numeroEntrada >= control) {
            resultados += control;
            control++;
        }

        System.out.println("La suma de los numeros primeros " + numeroEntrada + " Sus números naturales es igual a " + resultados);

        sc.close();
    }
}