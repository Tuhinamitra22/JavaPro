public class ABC {
    public static void main(String[] args) {
        ABC a = new ABC();
        a.A();
        System.out.println(10/0);
    }
    void A() {
        B();
       // System.out.println(10/0); //Exception
        System.out.println("Hi");

    }

    void B()
    {
        //System.out.println(10/0); //Exception
        System.out.println("Hello");
    }

}
