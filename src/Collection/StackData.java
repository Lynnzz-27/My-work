package Collection;
import java.util.Scanner;
import java.util.Stack;
public class StackData {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Stack<String>stack = new Stack<>();
        System.out.println("=====TAHANAN BEBAS=====");
        for (int i=0; i<5; i++){
           System.out.println("Masukkan nama ke-"+(i+1)+":");
            stack.add(input.nextLine());
            
        }
        System.out.println("\nIsi Queue :"+stack);
        System.out.println("Data yang di-Pop :"+stack);
        System.out.println("Isi Queue setelah poll :"+stack);
    }
}