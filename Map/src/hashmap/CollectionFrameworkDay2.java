package hashmap;

import java.util.*;

public class CollectionFrameworkDay2 {
    public static void main(String[] args) {
        Map<Integer,String> n=new HashMap<>();
        n.put(1,"Apple");
        n.put(2,"Orange");
        n.put(3,"Cat");
//        Set<Integer> key=n.keySet();
//        System.out.println("All key : "+key);
//        Collection<String> value=(n.values());
//        System.out.println("All Value : "+value);
        //=================== for each in map
        for(Map.Entry<Integer,String> obj: n.entrySet()){
            System.out.println("Key : "+obj.getKey());
            System.out.println("Value : "+obj.getValue());
//            System.out.println(obj);
        }

    }
}
