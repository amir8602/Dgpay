package sara;

import java.util.Comparator;

public class PersonComparatorImpl implements Comparator<Person> {
    @Override
    public int compare(Person left, Person right) {
        if (left.getHeight() > right.getHeight()) {
            return 1;
        } else if (left.getHeight() < right.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}
