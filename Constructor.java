public class Constructor{
    public Constructor(){
        System.out.println("Object created");
    }
    public Constructor(String name,int age){
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" years old");
    }
    public void study(){
        System.out.println("I am studying");
    }
    public void study(String sub){
        System.out.println("I am studying "+sub);
    }
    public static void main(String[] args){
        Constructor s1=new Constructor();
        Constructor s2=new Constructor("Ram",18);
        s1.study();
        s1.study("Math");

    }
}