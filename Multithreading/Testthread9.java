class A extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class Testthread9{
    public static void main(String []args) throws InterruptedException{
        A a1=new A();
        A a2=new A();
        A a3=new A();
        a1.setPriority(1);
        a2.setPriority(3);
        a3.setPriority(10);
        a1.start();
        
        a2.start();
       
        a3.start();
    }
}