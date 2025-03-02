package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ProjectMap {
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
        String value=studentInfo.remove(id);
        if(value!=null){
            return true;
        }
        return false;
    }
    private static boolean updateNewStudent(int id,String newName){
        String value=studentInfo.put(id,newName);
        if(value!=null){
            return true;
        }
        return false;
    }
    private static void home() {
        while (true) {
        System.out.println("""
                1.Add Student name
                2.Search Student By ID
                3.Delete Student By ID
                4.Update Student By ID
                5.Exit
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
                    System.out.print("Enter ID for Search : ");
                    int id=new Scanner(System.in).nextInt();
                    searchStudentByKey(id);
                }
                case 3 -> {
                    System.out.print("Enter ID for Delete : ");
                    int id=new Scanner(System.in).nextInt();
                    removeStudentByKey(id);
                    System.out.println("Remove successfully");
                    System.out.println(studentInfo);
                }
                case 4 -> {
                    System.out.print("Enter ID for Update : ");
                    int id=new Scanner(System.in).nextInt();

                }
                case 5 -> {System.exit(0);}

            }
        }
    }
    public static void main(String[] args) {
        home();
    }
}
