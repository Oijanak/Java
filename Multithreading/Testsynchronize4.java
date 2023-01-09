class Bank extends Thread{
    static int bal=5000;
    static int withdraw;
    Bank(int withdraw){
        this.withdraw=withdraw;
        
    }
    public static synchronized void Withdraw(){
        String name=Thread.currentThread().getName();
        if(withdraw<=bal){
            System.out.println(name+" withdrawn money");
            bal=bal-withdraw;
    }
    else{
        System.out.println("Insufficient balance");
    }
    }
      public void run(){//run method cannot be overriden if static
        Withdraw();
    }
  
}
class Testsynchronize4{
    public static void main(String []args){
        Bank b1=new Bank(5000);
        Thread t1=new Thread(b1);
        Thread t2=new Thread(b1);
      
        t1.setName("Ram");
        t2.setName("Sita");
          Bank b2=new Bank(5000);
           Thread t3=new Thread(b2);
        Thread t4=new Thread(b2);
        t3.setName("Gita");
        t4.setName("Babita");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
      
    }
}