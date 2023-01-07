package Upackage1;
 class TestExample1{
   static int a=10;
    void show(){
        System.out.println("a="+a);
    }
    public static void main(String []args){
        TestExample1 t1=new TestExample1();
        t1.show();
        Accesss a1=new Accesss();
      //  System.out.println("b="+a1.b); private variable cannot be accessed
        System.out.println("String str="+Accesss.str);
        a1.display();


    }
}

