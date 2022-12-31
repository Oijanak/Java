import java.util.*;
class Student{
    String name;
    int roll;
    String address;
    public void inputs(){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name?");
        name=sc.nextLine();
        System.out.println("Your roll no.?");
       
        roll=sc.nextInt();
        System.out.println("Where do you live");
        sc.nextLine();
        address=sc.nextLine();
    }
    public void greeting(){
        System.out.println("Hello "+name);
    }
    public void fullDetails(){
        System.out.println("You are "+name+"\nYour roll call is "+roll+"\nYou live in "+address);
    }
    public static void main(String []args){
        Student s1=new Student();
        s1.inputs();
        s1.greeting();
        s1.fullDetails();
        Student s2=new Student();
        s2.inputs();
        s2.fullDetails();
    }
}