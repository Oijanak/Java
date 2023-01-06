import java.io.*;
class FileReading{
    public static void main(String[] args) throws IOException{
        
             FileReader f=new FileReader("C:\\Users\\Hp\\Desktop\\Pro\\Java\\File Handling\\file1.txt");
             int i;
             while((i=f.read())!=-1){//read method returns ascii value of character
                
             System.out.print((char)i);//changing integer value into character value
             }
            
             f.close();
    
    
}
}