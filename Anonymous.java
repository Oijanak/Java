class Egg{
    public void cooked(){
        System.out.println("the egg is boiled");
    }
}
class Anonymous{
    public static void main(String[] args){
        Egg e=new Egg(){
            @Override
            public void cooked(){
                System.out.println("The egg is fried");
            }
        };
        e.cooked();
    }
}