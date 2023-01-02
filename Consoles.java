import java.io.Console;
class Consoles{
    public static void main(String[] args){
        Console con=System.console();
        System.out.println("ENter Username:");
        String name=con.readLine();
        System.out.println("Enter Password:");
        char[] pass=con.readPassword();
        System.out.println("Hello "+name);
        String password=String.valueOf(pass);//Character array into string
        System.out.println("Your password is "+password);
    }
}