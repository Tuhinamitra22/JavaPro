public class Arrayclass {
    public static void main(String[] args){
        //Assigning the value of one array to another array
        int a[]= new int[]{5,4,3,2,1};

        int b[]=a;
        for(int i = 0; i<b.length ; i++)
            System.out.println("Values of b[" + i + "] =" + b[i]);

    }
}
