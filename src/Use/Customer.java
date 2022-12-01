package Use;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    private int age;
    private int point;

    static  int compareIndex;

    public Customer(String name, int age, int point) {
        this.name = name;
        this.age = age;
        this.point = point;

    }

    public static void setComparator(int i){
        if(i > -1 && i < 2)
            compareIndex = i;
    }

    @Override
    public String toString(){
        return "{ "+this.name +" : "+this.age+" : "+this.point+"}";
    }

    @Override
    public int compareTo( Customer otherObj) {
        if(compareIndex ==0)
            return this.age - otherObj.age;
        else
            return this.point - otherObj.point;
    }
}
