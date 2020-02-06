public class Arrays {
    public static void main(String[] args){
        //Declaration
        int a[];
        int []b;

        //Allocation
        a = new int[5];

        //Initialize Value
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int i =0;i < a.length ; i++){
            System.out.println("Value of a["+ i + "] = " + a[i]);
        }
    }
}
