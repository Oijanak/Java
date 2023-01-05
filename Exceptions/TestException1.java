class TestException1{
    public static void main(String[] args){
        String str=null;
        System.out.println(str);
        try{
            try{
                int c=10/0;
            }
            catch(Exception e){
                System.out.println("Handling Airthemetic exception");
            }
        System.out.println(str.toUpperCase());
        }
        catch(NullPointerException a){
            System.out.println("Handling null pointer exception");
        }
        System.out.println("Exception handled");
    }
}