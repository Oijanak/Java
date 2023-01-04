interface Printable{  
    default void call(){
        print();//To access private method through another class
}


    private void print(){
        System.out.println("Printing");
}
}  


class Showable implements Printable{  
        void show(){
            System.out.println("Showing");
        }
}  

class TestInterface4{  
public static void main(String args[]){  
Showable obj = new Showable();  
obj.call();  
obj.show();  
 }  
}  
 


