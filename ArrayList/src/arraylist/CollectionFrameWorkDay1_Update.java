package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

class CollectionFrameWorkDay1_Update {
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
            System.out.print("Enter new name : ");

            String a=new Scanner(System.in).nextLine();
            st.set(index,a);
            st.forEach(e-> System.out.println(e));
        }else {
            System.out.println("name not found ");
        }

    }
}
