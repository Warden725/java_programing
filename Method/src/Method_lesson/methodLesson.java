package Method_lesson;

import java.util.Arrays;

public class methodLesson {
    public static void thumnail(){
        System.out.println("""
               \t=====================[ Product ]==================
               \t|       1. Input product
               \t|       2. Output
               \t|       3. Search
               \t|       4. Sort
               \t|       5. Update
               \t|
               \t|       0.exit
               """);
    }
    public static void findDuplicate(int [] array){
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("Dupicate int is : "+array[i]);
                }
            }
        }
    }
    public static void sum(int...a){
        int sum=0;
        for(int n: a){
            sum+=n;
        }
        System.out.println("Sum : "+sum);
    }
    public static void Sort(int []a){
        Arrays.sort(a);
    }


    public static void main(String [] args){

    }
}
