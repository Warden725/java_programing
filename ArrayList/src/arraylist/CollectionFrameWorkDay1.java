package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class CollectionFrameWorkDay1_Delete {
    public static void main(String [] args){
        ArrayList<String> st=new ArrayList<>();
        System.out.print("Input n : ");
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter name ["+(i+1)+"] : ");
            String name=new Scanner(System.in).nextLine();
            st.add(name);
        }
        System.out.println(st);

        // delete
        System.out.print("Enter name for update : ");
        String names=new Scanner(System.in).nextLine();
        int index= st.indexOf(names);
        if(index>=0){
            st.remove(names);
            System.out.println("Remove name : "+names+" Successfuly! ");
        }else {
            System.out.println("name not found ");
        }
        st.forEach(e-> System.out.println(e));
    }
}
