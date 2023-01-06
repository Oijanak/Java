import java.util.Scanner;
class Underage extends Exception{
    Underage(String msg){
        super(msg);
    }
}
class TestException7{
   
   static Scanner sc =new Scanner(System.in);
    static int age;
    public static void main(String[] args) throws Underage{
        TestException7 t=new TestException7();
         System.out.println("What is your age?");
        age=sc.nextInt();
        if(age<18){
            throw new Underage("you are underage");
        }
        else{
            System.out.println("You are eligible to vote");
        }

    }
}