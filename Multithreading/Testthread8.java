class A extends Thread{
    public void run(){
        try{
             for (int i=0;i<3;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }

        }
        catch(InterruptedException e){
            System.err.println(e);
        }
       
    }
}
class Testthread8{
    public static void main(String []args) {
        A a=new A();
        a.start();
        a.interrupt();//sleeps thread in waiting state
        
    }
}