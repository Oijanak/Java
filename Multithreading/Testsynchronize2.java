class Table{
    public synchronized void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);

    }
}
class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(7);
        
    }
}
class Testsynchronize2{
    public static void main(String []args){
        Table a1=new Table();
        Thread1 t1=new Thread1(a1);
        Thread2 t2=new Thread2(a1);
        t1.start();
        t2.start();
    }
}