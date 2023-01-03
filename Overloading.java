class Bank{
    float interest=0;
    void getInterest(){
        System.out.println("Our interest rate is "+interest);
    }

}
class NIC extends Bank{
    float interest=23;
    @Override
    void getInterest(){
        System.out.println("Our NIC bank interest rate is "+interest);
    }


}
class BOK extends Bank{
    int interest=10;
    @Override
     void getInterest(){
        System.out.println("Our BOk bank interest rate is "+interest);
    }

}
class Overloading{
    public static void main(String []args){
        BOK b=new BOK();
        b.getInterest();
        NIC n=new NIC();
        n.getInterest();
    }
}