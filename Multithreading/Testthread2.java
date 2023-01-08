class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Run"+i);
        }
    }

}
class Testthread2{
    public static void main(String []args) throws InterruptedException{
        A a=new A();
        Thread t=new Thread(a);//To start thread in class A and invoke run method in class
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Main"+i);
            Thread.sleep(1000);// causes InterruptedException
        }
    }
}