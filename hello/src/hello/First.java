
package hello;

import java.util.Scanner;

class Person{
    int id;
    String name;
    char sex;
    static Scanner s=new Scanner(System.in);
        void Input(){
            System.out.print("Enter Id : "); id=s.nextInt();
            System.out.print("Enter Name : "); s.nextLine(); name=s.nextLine();
            System.out.print("Enter Sex : "); sex=s.nextLine().charAt(0); 
        }
        void Output(){
            System.out.print("ID : "+id+"   Name: "+name+"    Sex : "+sex+'\n');
        }
        public static void Search(int n,Person p[]){
            int search;
            System.out.print("Enter id for search : "); search=s.nextInt();
            for(int i=0;i<n;i++){
                
            }
    }
}
public class First {

    public static void main(String[] args) {
        int n;
       Scanner s=new Scanner(System.in);
       System.out.print("Input n: "); n=s.nextInt();
        Person[] p=new Person[n];
        for(int i=0;i<n;i++){
            p[i]=new Person();
            p[i].Input();
        }
        for(int i=0;i<n;i++){
            p[i].Output();
        }
        s.close();
    }
    
}
