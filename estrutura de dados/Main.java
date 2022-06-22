import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        int total = 0;
        Scanner scan;

        System.out.println("Digite um numero inteiro:");

        scan = new Scanner(System.in); 
        num = scan.nextInt();

        System.out.println("Numero invertido: " + decremento(num, total));

    }  
    public static int decremento(int num, int total){

        if (num == 0){
            return total;
        }  
            total = total * 10 + num % 10;
            
            return decremento(num / 10, total );
    }
}