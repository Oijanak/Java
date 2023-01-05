class TestException3{
    public static void main(String []args){
        try{
            int a=1/2;
            System.out.println(a);
            String str=null;
            System.out.println(str.toUpperCase());
           

        }
        catch(ArithmeticException a){
            System.out.println("AirthemeticException Handled");
            String str="abc";
            try{
                int num=Integer.parseInt(str);

            }
            catch(NumberFormatException n){
                System.out.println("NumberFormatException handled");
            }
        }
        catch(Exception e){
            System.out.println("Exception handled");
        }
    }
}