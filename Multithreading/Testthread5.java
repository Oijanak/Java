class A extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(n);
        }
    }
}
class Testthread5j {
    public static void main(String []args) throws InterruptedException{
        System.out.println("Main");
        A a1=new A();
        A a2=new A();
        A a3=new A();
        a1.start();
       
        a2.start();
        a2.suspend();
        
        
        a3.start();
        a1.resume();
        
    }
}