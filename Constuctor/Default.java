import java.util.*;
class Default{
    int a;
    String b;
    Default(){
        int[] ch={1,2,3};
        
          System.out.println(Arrays.toString(ch));
          System.out.println(ch[0]);

    }
    
    public static void main(String []args){
        Default df=new Default();
        System.out.println(df.a);
        System.out.println(df.b);
      
    }
}