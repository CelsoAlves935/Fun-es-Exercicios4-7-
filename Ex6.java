import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 4 numeros para um vetor, para descobrirmos o maior");
        int maior = valorMaior(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("O maior é: " +  maior);
        
        System.out.println("Agora digite 4 numeros para descobrirmos o menor. ");
        int menor = valorMenor(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("O menor valor é: " + menor);
        
        System.out.println("Agora vamos fazer a media dos valores entre o maior valor e o menor valor");
        double mediaT = divisao(maior,menor);
        System.out.println(mediaT);
    }
    public static int valorMaior(int n1,int n2,int n3,int n4){
        int numeros[] = new int[]{n1,n2,n3,n4};
        
        int maior = numeros[0];
        
        for (int i = 1;i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        
        return maior;
    }
    public static int valorMenor(int n1,int n2,int n3,int n4){
        int numeros[] = new int[]{n1,n2,n3,n4};
        
        int menor = numeros[0];
        
        for (int i =1;i < numeros.length;i++ ){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        
        return menor;
    }
    public static int divisao(int n1,int n2){
        return (n1 + n2) / 2;
    }
    
    
    
}