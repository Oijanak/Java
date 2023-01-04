interface Client{//Requirements
    void webDesign();
    void webDevelop();
}
abstract class Janak implements Client{
    public void webDesign(){
         System.out.println("Web design has been created");
    }
}
class Amit extends Janak{
    public void webDevelop(){
        System.out.println("Backend completed");
    }
}
class TestInterface{
    public static void main(String []args){
        Client r=new Amit();
        r.webDesign();
        r.webDevelop();

    }
}