package HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSett  {
    public static void main(String[] args){
        Set<String> Orignal=new HashSet<>(
                List.of("Khemrak","Visal"));
        Set<String> names=new HashSet<>(
                List.of("Khemrak","Visal"));
        if(Orignal.containsAll(names)){
            System.out.println("This set are the same");
        }
        names.addAll(Orignal);
        System.out.println(names);
        names.forEach(e-> System.out.println(e));
        System.out.println(names.size());
    }
}


