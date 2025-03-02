package Array;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int [] num={321,32,45,2,434,543,23,56};
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j]>num[j+1]){
                        int t=num[j];
                        num[j]=num[j+1];
                        num[j+1]=t;
                }
            }
        }
//        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

    }
}
