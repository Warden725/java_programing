package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionFrameworkDay1 {
    public static void main(String [] args){
        ArrayList<String> Student=new ArrayList<>(List.of("khemrak","Sok Meng","Visal"));
        Student.add("Channet");
        Student.add("Bro Porng");
        // update
        Student.set(1,"Buth");
        Collections.sort(Student);
        System.out.println(Student);
        System.out.println();
        Student.forEach(e-> System.out.println(e));

    }
}
