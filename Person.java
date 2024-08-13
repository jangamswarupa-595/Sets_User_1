public class Person{
    // prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
    private String name;
    private int id;
    private double sal;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public Person(String name, int id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", sal=" + sal + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        long temp;
        temp = Double.doubleToLongBits(sal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (id != other.id)
            return false;
        if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
            return false;
        return true;
    }
    }
    