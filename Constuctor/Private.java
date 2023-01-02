class A{
   /* private A(){ //Private COnstructor
        System.out.println("Hello");
    }*/
    A(int a){
        System.out.println(a);
    }
}
class Private{
    public static void main(String[] args){
       // A ob=new A();//A class cannot cannot be accessed
        A ob1=new A(5);
    }
}