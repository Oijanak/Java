class Apple{
    int rate=250;
    void show(){
        System.out.println("The rate is "+rate);
    }
    static class Mustang{
        void display(){
            System.out.println("Mustang class");
        }
    }
}
class InnerClass{
    public static void main(String []args){
        Apple a1=new Apple();
        a1.show();
        Apple.Mustang m1=new Apple.Mustang();
        //Apple.Mustang m1=a1.new Mustang(); if classis not static 
        m1.display();
       
        

    }
}