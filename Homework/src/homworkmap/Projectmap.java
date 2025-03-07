package homworkmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Projectmap {
    private static Map<Integer,String> studentInfo=new HashMap<>();
    private static boolean addNeStudentName(String newStudentName){
        int key=new Random().nextInt(100);
        studentInfo.put(key,newStudentName);
        return true;
    }
    private static boolean searchStudentByKey(int id) {
        if (studentInfo.containsKey(id)) {
            System.out.println("Student Found: " + studentInfo.get(id));
            return true;
        }
        System.out.println("Student with ID " + id + " not found.");
        return false;
    }
    private static boolean removeStudentByKey(int id){
        if (studentInfo.containsKey(id)) {
            studentInfo.remove(id);
            System.out.println("Remove success !");
            return true;
        }
        System.out.println("Student with ID " + id + " not found can't delete ");
        return false;
    }
    private static void home() {
        while (true) {
            System.out.println("""
                1.Add Student name
                2.Search Student By ID
                3.Delete Student By ID
                4.Update Student By ID
                5.show name student
                6.Exit
                """);
            System.out.print("Plz chose Option : ");
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    System.out.println("Student Record ");
                    System.out.print("input n : ");
                    int n = new Scanner(System.in).nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter name for add to record : ");
                        String newStudentName = new Scanner(System.in).nextLine();
                        boolean inserted = addNeStudentName(newStudentName);
                    }
                    System.out.println(studentInfo);
                }
                case 2 -> {
                    System.out.print("Enter key for Search : ");
                    int id=new Scanner(System.in).nextInt();
                    searchStudentByKey(id);
                }
                case 3 -> {
                    System.out.print("Enter key for Delete : ");
                    int id=new Scanner(System.in).nextInt();
                    removeStudentByKey(id);
                    System.out.println("Remove successfully");
                    System.out.println(studentInfo);
                }
                case 4 -> {
                    System.out.print("Enter key for Update : ");
                    int id=new Scanner(System.in).nextInt();
                    if(studentInfo.containsKey(id)){
                        System.out.print("Enter new name : ");
                        String newName=new Scanner(System.in).nextLine();
                        studentInfo.put(id,newName);
                        System.out.println("update success ");
                        System.out.println(studentInfo);
                    }else{
                        System.out.println("Key not found can't update\n");
                    }
                }
                case 5 -> {
                    System.out.println(studentInfo);
                    System.out.println();
                }
                case 6 -> {System.exit(0);}

            }
        }
    }
    public static void main(String[] args) {
        home();
    }
}
