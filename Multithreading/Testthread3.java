class A extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(n);
        }
    }
}
class Testthread3{
    public static void main(String []args){
        A a1=new A();
        A a2=new A();
        A a3=new A();
        a1.setName("1");

        a1.start();
        String n=Thread.currentThread().getName();
         for(int i=0;i<3;i++){
            System.out.println(n);
        }

        a2.start();
        a3.start();
        
    }
}