public class Start{
    static String name="Mylo";
    Start(String age){
        System.out.println(age);
         System.out.println(this);


    }

    
    public static void main(String[] args){
        Start st=new Start("23");
        System.out.println(st);
        System.out.println(st.name);
        Runn rn=new Runn();
        System.out.println(rn.name);
        Start st1=new Start("42");
          System.out.println(st1);
          System.out.println(name);

        
        


    }
}