public class EncapsulationMain {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Value of Var" + a.getVar());
        a.setVar(100);
        System.out.println("Value of Var" + a.getVar());
        a.setVar(1500);
        System.out.println("Value of Var" + a.getVar());
    }
}
