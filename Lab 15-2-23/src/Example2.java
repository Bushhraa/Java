public class Example2 {
    private int var1,var2;
    public Example2(){
        this.var1=10;
        this.var2=20;
    }
    public Example2(int num1, int num2)
    {
        this.var1=num1;
        this.var2=num2;
    }
    public int getValue1()
    {
        return var1;
    }
    public int getValue2(){
        return var2;
    }
    public static void main(String[] args){

       Example2 obj1=new Example2();
       Example2 obj2=new Example2();
        System.out.println("var1 is:"+obj1.getValue1());
        System.out.println("var1 is:"+obj2.getValue2());
    }
}
