import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos números tendrá el arreglo?: ");
        int tamano = sc.nextInt();
        
        int[] numeros = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        int resultado = contarPares(numeros, 0);
        System.out.println("La cantidad de números pares es: " + resultado);
        
    }

    public static int contarPares(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        
        int esPar = (arr[i] % 2 == 0) ? 1 : 0;
        
        return esPar + contarPares(arr, i + 1);

    }
}
