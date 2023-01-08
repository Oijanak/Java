class A extends Thread{
    @Override
    public void run() {//thread job
        try{
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
            Thread.sleep(1000);
        }
        System.out.println();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Testthread1{
    public static void main(String[] args) {//Default thread in java
        A a=new A();
        a.start();//starts thread
        for(int i=0;i<5;i++){
             System.out.println("Main method");
            
        }
       
    }
}