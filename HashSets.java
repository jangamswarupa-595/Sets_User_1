import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) {
    HashSet<Integer> s1=new HashSet<>();
    s1.add(6);
    s1.add(7);
    s1.add(1);
    s1.add(7);
    s1.add(8);
    for (Integer integer : s1)
    System.out.println(integer);
    
}

}

