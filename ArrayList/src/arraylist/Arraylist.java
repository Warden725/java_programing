package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Person {
    int id, age;
    String name;
    
    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void Output() {
        System.out.println("ID: " + id + "    Name: " + name + "    Age: " + age);
//        JOptionPane.showMessageDialog(null, "ID: " + id + "\nName: " + name + "\nAge: " + age);
    }
}

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Input n : "); n=s.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("#"+(i+1)+'\n');
            System.out.print("Enter id  : "); int id=s.nextInt();
            System.out.print("Enter name : ");s.nextLine(); String name=s.nextLine();
            System.out.print("Enter age : "); int age=s.nextInt();
            System.out.print("\n");
//            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID : "));
//            String name = JOptionPane.showInputDialog("Enter name : ");
//            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age : "));
            list.add(new Person(id, age, name));
        }

        for (Person p : list) {
            p.Output();
        }
    }
}