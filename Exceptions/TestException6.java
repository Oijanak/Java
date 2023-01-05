import java.util.*;
class TestException6{
    void div(int a,int b) {
        if(b==0){
            try{
                 throw new ArithmeticException("Divided by 0");

            }
            catch(ArithmeticException e){
                System.out.println("Change the value of b");
                Scanner sc =new Scanner(System.in);
                b=sc.nextInt();
                div(a,b);
                
            }
           
        }
        else{
            int c=a/b;
            System.out.println("Output is "+c);
        }
    }
    public static void main (String []args) throws ArithmeticException {
        TestException6 t=new TestException6();
        t.div(10,0);

    }
}