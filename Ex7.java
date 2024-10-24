import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        
        long fatorial = calcularFatorial(numero);

        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    
    public static long calcularFatorial(int n) {
        
        if (n <= 1) {
            return 1;
        } else {
            
            return n * calcularFatorial(n - 1);
        }
    }
}
