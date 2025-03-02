
package Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int num[]={312,313,54,43,23,66,454,34};
        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
        // for(int i=0;i<num.length;i++){
        //     for(int j=0;j<num.length-1;j++){
        //         if(num[j]>num[j+1]){
        //             int temp;
        //             temp=num[j];
        //             num[j]=num[j+1];
        //             num[j+1]=temp;
        //         }
        //     }
        // }
        System.out.println(Arrays.toString(num));
    }
}
