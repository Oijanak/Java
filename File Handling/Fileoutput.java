import java.io.*;
class Fileoutput{
    public static void main(String []args) throws IOException{
       String str="Helloo FIleOutputstream";

       char a[]=str.toCharArray();
       System.out.println(a);
        byte[] b=str.getBytes();
        FileOutputStream f=new FileOutputStream("fileoutputstream.txt");
        f.write(b);
        f.close();
    }
}