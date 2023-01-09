class Train implements Runnable{
     int available=1;
    int passenger;
    Train(int passenger){
        this.passenger=passenger;
}
public synchronized void run(){//one thread at a time
    String name=Thread.currentThread().getName();
    if(available>=passenger){
        System.out.println(name+" Reserved seat");
        available=available-passenger;
    }
    else{
        System.out.println("Sorry seat is not available");
    }
}
}
class Testsynchronize1{
    public static void main(String[] args){
       
        Train t1=new Train(1);//For one train
        
           Thread a1=new Thread(t1);
            Thread a2=new Thread(t1);
             Thread a3=new Thread(t1);

          a1.setName("ram");
           a1.start();
          a2.setName("hari");
            a2.start();
          a3.setName("Sita");
         
        
          a3.start();
    }
}