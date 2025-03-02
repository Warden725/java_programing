package Array;

import java.util.Scanner;

public class FindMAX {
    public static void main(String[] args){

        System.out.println("Insert lenght of array : ");
        int n=new Scanner(System.in).nextInt();Integer [] num=new Integer[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter  element : ");
            num[i]= new Scanner(System.in).nextInt();
        }
        int max=num[0];
        for(Integer a: num){
            if(max<a){
                max=a;
            }
        }
        System.out.println("this is the max : "+max);
    }
}
