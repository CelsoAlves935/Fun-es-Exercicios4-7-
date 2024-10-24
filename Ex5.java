import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 7, para escolher o dia da semana!");
        exibirDiaSemana(input.nextInt());
    }
    
    public static void exibirDiaSemana(int n1){
        if((n1 >= 1) && (n1 <= 7)){
            switch(n1){
                case 1:
                    System.out.println("Segunda");
                    break;
                case 2:
                    System.out.println("Terça");
                    break;
                case 3:
                    System.out.println("Quarta");
                    break;
                case 4:
                    System.out.println("Quinta");
                    break;
                case 5:
                    System.out.println("Sexta");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
            }
        }else {
            System.out.println("O valor não é entre 1 e 7");
            return;
        }
        
    }
}