import java.util.Scanner;
public class Ex4{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero!");
        isPar(input.nextInt());
    }
    
    public static void isPar(int n1){
         
        if (n1 % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        return;
    }
}