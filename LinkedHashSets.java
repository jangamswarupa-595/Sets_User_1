import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSets {
   static class Person {
        String name;
        int id;
        double sal;
        public Person(String name, int id, double sal) {
            this.name = name;
            this.id = id;
            this.sal = sal;
        }
        @Override
        public String toString() {
            return "Person [name=" + name + ", id=" + id + ", sal=" + sal + "]";
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<Person> s = new LinkedHashSet<>();
      
        s.add(new Person("SWarupa", 1, 20000.0));
        s.add(new Person("Sujatha", 2, 35800.0));
        s.add(new Person("Micky", 3, 25000.0));
        Iterator<Person> s1 = s.iterator();
        while (s1.hasNext()) {
            Person p1 = s1.next();
            System.out.println(p1);  
        }
    }
}
