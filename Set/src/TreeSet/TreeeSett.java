package TreeSet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeeSett {
    public static void main(String [] args){
        Set<Integer> num=new TreeSet<>(
                List.of(1,2,3,2,33,32,88));
        num.add(325);
        System.out.println(num);
    }
}
