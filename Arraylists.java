import java.util.*;
public class Arraylists{
    public static void main(String []args){

        //1D Arraylist
       /* ArrayList<String> food=new ArrayList<String>();
        food.add("Meat");
        food.add("Sushi");
        food.add("Ramen");
        food.add("MOMO");
        food.set(0,"Chowmein");
        food.remove(3);
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
            
        }
        food.clear();*/

        //2D ArrayList
        ArrayList<ArrayList<String>> school=new ArrayList<ArrayList<String>>();
        ArrayList<Integer> marks=new ArrayList<Integer>();
        marks.add(32);
        marks.add(43);
        marks.add(99);
        System.out.println(marks);

        ArrayList<String> sub=new ArrayList<String>();
        sub.add("Math");
        sub.add("Science");
        sub.add("Chemistry");
        System.out.println(sub);

         ArrayList<String> stu=new ArrayList<String>();
        stu.add("Mark");
        stu.add("Harry");
        stu.add("Chandu");
        System.out.println(stu);
        school.add(sub);
        school.add(stu);
        System.out.println(school);
        System.out.println(school.get(1).get(2));

    }
}