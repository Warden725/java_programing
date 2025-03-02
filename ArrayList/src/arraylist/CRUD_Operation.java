package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD_Operation {
    public static void thumnail(){
        System.out.print("""
                ========================[ Product ]====================
                0. Output
                1. Add New Product by name
                2. Search product name by name
                3. Update product name
                4. Delete product name
                5. Exit
                
                please choose Option :  """);
    }

    public static void main(String [] args){

        List<String> product=new ArrayList<>();
        int op=0,n=0;
        String name;
        do{
            thumnail();
            op=new Scanner(System.in).nextInt();

            switch (op){

                case 0 -> {
                    System.out.println("\n"+product+"\n");
                }

                case 1 -> {
                    System.out.print("Input n: ");
                    n = new Scanner(System.in).nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter name Product : ");
                        name = new Scanner(System.in).nextLine();
                        product.add(name);
                    }
                    System.out.println("==========[ Here the name of product you Add ]");
                    System.out.println("{ "+product+" }");
                }

                case 2 -> {
                    System.out.print("Enter name's Product for Search : ");
                    name = new Scanner(System.in).nextLine();
                    int index= product.indexOf(name);
                       if(index>=0){
                           System.out.println();
                           System.out.println(product.get(index));
                       }else{
                           System.out.println("Search not found ");
                       }
                    System.out.println();
                }

                case 3 -> {
                    System.out.print("Enter name's Product for Update : ");
                    name = new Scanner(System.in).nextLine();
                    int index= product.indexOf(name);
                        if (index >= 0) {
                            System.out.print("Enter new name : ");
                            String nameUpdate=new Scanner(System.in).nextLine();
                            product.set(index,nameUpdate);
                            System.out.println("Update Successfully ");
                            System.out.println("Here your all product \n"+product);
                        }else{
                            System.out.println("Name not found can not update ");
                        }
                    System.out.println();
                }

                case 4 -> {
                    System.out.print("Enter name for Delete : ");
                    name = new Scanner(System.in).nextLine();
                    int index=product.indexOf(name);
                        if(index>=0){
                            product.remove(name);
                            System.out.println("Remove successfully ");
                            System.out.println("Here your all product \n"+product);
                       }else{
                            System.out.println("Name not found can't Delete");
                       }
                    System.out.println(

                    );
                }

                case 5 -> {
                    System.out.println("Thank! ");
                }
            }
        }while(op!=5);

    }
}
