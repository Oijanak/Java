import java.io.FileInputStream;  
public class Fileinput {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("fileoutputstream.txt"); 
            int n=fin.available();
            byte[] b=new byte[n];   
           int f= fin.read(b);  
           System.out.println(f);
            for(int i:b){
                  System.out.print((char)i); 
            }
             
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  