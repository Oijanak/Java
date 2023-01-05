class TestException4{
    public static void main(String[] args){

        try{
                  int a=4/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
      
        finally{//finally alwayays comes with try
            String str=null;
            try{
                 System.out.println(str.toUpperCase());
            }
            catch(NullPointerException n){
                System.out.println("NullPointerException");
            }
           finally{
                System.out.println("Nested finally");
           }

        }
    }
}