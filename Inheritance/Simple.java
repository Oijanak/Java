import java.util.*;
class Simple{
    public static void main(String []args){
      /*  Employee e=new Employee();
        e.inputs();
        e.show();*/
        Programer p=new Programer();//Simple Inheritance
        p.inputs();
        p.show();
        p.status();


    }
}
class Employee{//Super class
    String name;
    int salary;
    void inputs(){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name?");
        name=sc.nextLine();
        System.out.println("What is your salary");
        salary=sc.nextInt();

    }
    void show(){
        System.out.println("Hello "+name+" "+salary+" has been credited in your account");
    }

}
class Programer extends Employee{//Subclass of Employee class
    String position;
    void status(){
        System.out.println("What is your position?");
        Scanner sc=new Scanner(System.in);
        position=sc.nextLine();
        System.out.println("You are a "+position+" earning"+salary);

    }
}