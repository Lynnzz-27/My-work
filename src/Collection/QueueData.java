package Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueData {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        Queue<String>queue = new LinkedList<>();
        System.out.println("==========TAHANAN HUKUMAN MATI==========");
        for(int i=0; i<5; i++){
            System.out.println("Masukkan nama ke-"+(i+1)+":");
            queue.add(input.nextLine());
            
        }
        System.out.println("\nIsi Queue :"+queue);
        System.out.println("Data yang dihapus :"+queue.poll());
        System.out.println("Isi Queue setelah poll :"+queue);
    }
}