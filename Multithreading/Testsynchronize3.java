class Msg{
    public void show(String name){
        System.out.println("Good morning"+Thread.currentThread().getName());
        synchronized(this){
              for(int i=0;i<3;i++){
            System.out.println("How are you "+name);
        }
        }
      
    }
}
class Threads extends Thread{
    Msg m;
    String name;
    Threads(Msg m,String name){
        this.m=m;
        this.name=name;
    }
    public void run(){
        m.show(name);
    }
}
class Testsynchronize3{
    public static void main(String []args){
        Msg m1=new Msg();
        Threads t1=new Threads(m1,"Ram");
        Threads t2=new Threads(m1,"Hari");
        t1.start();
        t2.start();
    }
}