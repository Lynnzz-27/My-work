package Collection;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListData {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        System.out.println("=====TAHANAN BARU=====");
        for(int i=0; i<5; i++){
            System.out.println("Masukkan nama ke-"+(i+1)+":");
            data.add(input.nextLine());
        }
            System.out.println("\nIsi ArrayList");
            for (int i=0; i<data.size(); i++){
                System.out.println("Index Ke-"+i+"="+data.get(i));
        }
    }
}