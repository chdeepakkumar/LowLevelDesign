package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = new String("abcd");
        String s4 = new String("abcd");
        // s1 == s2 True
        // s1 == s3 False
        // s3 == s4 False
        Integer i1 = 1;
        Integer i2 = 1;
//        System.out.println(i1 == i2);
        // i1 == i2
        int i3 = 128;
//        System.out.println(i1 == i3);
        Employee e1 = new Employee(1, "Kohli", "Batsman");
        Employee e2 = new Employee(17, "Kohli", "Batsman");
        Employee e3 = e2;
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));

        Map<Employee, Integer> map = new HashMap<>();
        map.put(e1, 1);
        map.put(e2, 2);
//        map.put(e3, 3);
        System.out.println(map);
    }
}
