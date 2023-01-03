class A{
    private String name;
    private int age;
    public void setData(String name,int age){
            this.name=name;
            this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Encapsule{
    public static void main(String[] args){
        A a=new A();
        //System.out.println("class A private member "+a.name);//Data hiding cannot be accessed directly
        a.setData("Rama",20);
        System.out.println("Name is "+a.getName());
        System.out.println("Age is "+a.getAge());
    }
}