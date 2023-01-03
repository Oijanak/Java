class A{//Super class
    int a=5;
}


class B extends A{//Sub class 1
        int b=6;
        void minus(){
            System.out.println("Subtraction is "+(a-b));
        }
 }


class C extends B{//Sub class 2
    int d=7;
    void sum(){
        int sum=b+a+d;
        System.out.println("Output is "+sum);
    }
}
class Multilevel{//Executable Logic class
    public static void main(String[] args){
        C c=new C();//Subclass 1
        c.sum();
        c.minus();

        B bb=new B();//Subclass 2
        bb.minus();
        
    }
}