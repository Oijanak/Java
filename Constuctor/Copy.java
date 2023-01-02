import java.util.Arrays;
class A{
    String a;
    int b;
    int[] arr;
    A(String a,int b,int[] arr){
        this.a=a;
        this.b=b;
        this.arr=arr;
       
       
    }
    A(A ref){
        a=ref.a;
        b=ref.b;
        arr=ref.arr;
        System.out.println("a="+a+"\nb="+b);
        System.out.println(Arrays.toString(arr));
        
    }
}


class Copy{
    
    public static void main(String[] args){
        int[] arr={1,2,3};
        A r=new A("Janak",23,arr);
        A r2=new A(r);
        A r3=new A("name",69,arr);
        A r4=new A(r2);

    }
}