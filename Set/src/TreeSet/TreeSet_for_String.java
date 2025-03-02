package TreeSet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_for_String {
    public static void main(String[] args) {
        Set<String> name=new TreeSet<>(List.of("Channet","Yutepong"));
        name.add("Visal");
        for(String a: name){
            System.out.println(a);
        }

    }
}
