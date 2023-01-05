//IOException and FileNotFoundException is checked exception so it is checked by compiler during compile time
import java.io.*;
class TestException2{
    public static void main(String[] args){
     /* FileReader fileReader = new FileReader("Test.txt");

        System.out.println(fileReader.read());

        fileReader.close(); */
        int a=2/0;//Unchecked Exception is checked at runtime and JVM deals with it 
    } 
}