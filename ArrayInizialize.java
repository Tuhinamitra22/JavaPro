import java.util.Arrays;
import java.util.Scanner;

public class ArrayInizialize {
    public static void main(String[] args){
        //using array class, fill
        int a[] = new int[5];
        Arrays.fill(a,5);
         for(int i = 0; i<a.length ; i++)
             System.out.println("Values of a[" + i + "] =" + a[i]);
//using for loop
         int b[] = new int[5];
        for(int i = 0; i<b.length ; i++)
            b[i] = i+1;
        for(int i = 0; i<b.length ; i++)
            System.out.println("Values of b[" + i + "] =" + b[i]);
//by taking user input
        int c[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values");
        for(int i = 0; i<c.length ; i++)
             c[i] = sc.nextInt();

            for(int i = 0; i<c.length ; i++)
                System.out.println("Values of c[" + i + "] =" + c[i]);


    }
}
