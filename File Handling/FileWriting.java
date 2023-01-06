import java.io.*;
class FileWriting{
    public static void main(String[] args){
        try{
            FileWriter f=new FileWriter("file1.txt");//Creates desination file or instantiate existing file
             f.write("Hello my name is Janak Chaudhary");
         f.close();
        }
        catch(IOException a){
            System.out.println(a);
        }
        
       
    }
}