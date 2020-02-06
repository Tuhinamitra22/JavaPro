public class A {
    private int var=50;
//getter
    public  int getVar(){
        return var;
    }
//setter
    public void setVar(int var) {
        if (var > 1000) {
            this.var = 0;
        } else {
            this.var = var;
        }
    }
}

