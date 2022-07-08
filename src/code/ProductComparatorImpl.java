package code;

import java.util.Comparator;

public class ProductComparatorImpl implements Comparator<Product> {
    @Override
    public int compare(Product left, Product right) {
        if (left.getPrice()> right.getPrice())
            return 1;
        else if (left.getPrice()< right.getPrice())
            return -1;
        else
            return 0;
    }
}
