package Use;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    int index;
    public CustomerComparator(int index) {
        this.index = index;
    }
    public CustomerComparator() {
        this(0);
    }

    @Override
    public int compare(Customer o1, Customer o2) {
       if(index ==0){
           return o1.getName().compareTo(o2.getName());
       }
       else if(index == 1){
            return o1.getAge() - o2.getAge();
        }
       else
           return o1.getPoint() - o2.getPoint();
    }
}
