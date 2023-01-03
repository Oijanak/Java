class Blocks{
    {//Instance block 2.Needs Object to run 3.Executed before constructor
        int a=100;
        System.out.println("Instance block output "+a);
    }
    Blocks(){
            System.out.println("Constructor output");
    }

  static{//Static block 2.Doesnt need Object`
        int a=10,b=20;
        int c=a+b;
        System.out.println("Static block output "+c);
    }
    public static void main(String[] args){
            Blocks obj=new Blocks();
    }
}