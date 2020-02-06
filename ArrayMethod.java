import java.util.Scanner;

public class ArrayMethod {
    public static void main(String[] args){
        //Pass by reference
        int a[] = new int[]{1,2,3,4,5};

        displayarray(a);
        int z[] = getValues();
        displayarray(z);
    }
    public static void displayarray(int[] b){
        for(int i = 0; i<b.length ; i++)
            System.out.println("Values of b[" + i + "] =" + b[i]);
    }
//Passing array to the method
    public static int[] getValues(){
        System.out.println("Enter the Values for array");
        int temp[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<temp.length ; i++)
            temp[i] = sc.nextInt();

        return temp;
    }
}

