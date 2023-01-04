abstract class Vechicle{
   abstract void detail();
   abstract void color();
}
 abstract class Bike extends Vechicle{//Since it doessnt ovveride abstract method color() it should be abstract class
    String name="Pulsar";
    int mileage=23;
 //   @Override
    void detail(){
        System.out.println("Bike model "+name);
        System.out.println("Mileage "+mileage);
    }
}
class Car extends Bike{
    String name="Nissan";
    int mileage=150;
 /* @Override
    void detail(){
        System.out.println("Car Model "+name);
        System.out.println("Mileage "+mileage);
    }*/
    @Override
    void color(){
        System.out.println("Car is blue");
    }
}
   

class Abstracts{
    public static void main(String []args){
        Bike v1=new Car();
        v1.detail();
        v1.color();
       
    }
}
