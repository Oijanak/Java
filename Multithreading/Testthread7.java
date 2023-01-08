class A extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(n);
        }
    }
}
class Testthread7 {
    public static void main(String []args) throws InterruptedException{
        System.out.println("Main");
        A a1=new A();
        A a2=new A();
        A a3=new A();
         System.out.println("The thread0 is alive  "+a1.isAlive());
        a1.start();
        System.out.println("The thread0 is alive "+a1.isAlive());
        
        a3.start();
        
    }
}