class Animal{//Super classs
        void show(){
            System.out.println("Hello super class Animal");
        }
}
class Dog extends Animal{//Subclass1 inherits same super class
    void bark(){
    System.out.println("Hello Dog woff");
    }
}
class Bird extends Animal{//Subclass2 inherits same super class
    void sing(){
        System.out.println("Kukdooooooo");
    }
}
class Hierarchy{
    public static void main(String []args){
        Dog d=new Dog();
        d.show();
        d.bark();
        Bird b=new Bird();
        b.show();
        b.sing();
    }
}