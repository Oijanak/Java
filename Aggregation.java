class School{
    String name="NCIT";
    String phone="9809938";
    Teacher teach;
    void display(){
        System.out.println("Our College "+name+" Welcomes You");
         teach=new Teacher();
         System.out.println("Mr. "+teach.teacher);
         System.out.println("Our contact no. "+phone);


    }
   

}
class Teacher{
    String teacher="Santosh";

}
class Aggregation{
     public static void main(String[] args){
        School sc=new School();
        sc.display();

    }
}