import java.io.*;
class FileHandle2{
    public static void main (String []args){
        File f=new File("file1.txt");
        try{
              f.createNewFile();
        } 
        catch(IOException e){

            
            System.err.println(e);
        }
        
      
        
        if(f.exists()){
            System.out.println("File Successfully ceated");
            System.out.println("File name "+f.getName());
            System.out.println("File location "+f.getAbsolutePath());
            System.out.println("File Readable "+f.canRead());
            System.out.println("FIle Size "+f.length());
            f.delete();
           
        }
        else {
            System.out.println("File already exists");
        }

    }
}