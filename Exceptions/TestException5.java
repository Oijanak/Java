class TestException5 extends Object{
    void display(){
        System.out.println("Finalize method program");
    }
    @Override
    protected void finalize(){//garbage collector calls finalize method once every object //finalize method is deprecated in java after jdk9
        System.out.println("Calling finalize method before garbage collection");
    }
    public static void main(String []args){
            TestException5 t=new TestException5();
            t.display();
           //unrefernced object
           t=null;


           TestException5 t1=new TestException5();
           TestException5 t2=new TestException5();
           t2=t1;

           new TestException5();

           System.gc();//force garbage collection

            

            
    }
}