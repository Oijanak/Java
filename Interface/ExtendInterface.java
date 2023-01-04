interface A{
    void add();
}
interface D{
    void multiply();
}
interface B extends A,D{//Interface extends other interface
    void sub();
}
class C implements B{//Classes implements other interfaces
    @Override
    public void add(){
        System.out.println("Addittion is completed");
    }
    @Override
    public void sub(){
        System.out.println("Subtraction is completed");
    }
    @Override
    public void multiply(){
        System.out.println("Multiplication is completed");
    }
}
class ExtendInterface{
    public static void main(String []args){
        A c=new C();
        c.add();
       // c.sub(); is error since sub() method is not in A interface
       B b=new C();
       b.add();
       b.sub();
       b.multiply(); 
    }
}
