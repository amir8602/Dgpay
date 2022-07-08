package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();

        list.add(Product.productFactory(1l , "HP Laptop",250000.0));
        list.add(Product.productFactory(2l,"Dell Mouse",150000.0));
        list.add(Product.productFactory(3l,"Keyboard",300000.0));



        Collections.sort(list,new ProductComparatorImpl());




        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product left, Product right) {
                if (left.getPrice()>right.getPrice())
                    return 1;
                else if(left.getPrice()< right.getPrice())
                    return -1;
                else return 0;
            }
        });


        Collections.sort(list, (left, right) -> {
            if (left.getPrice()>right.getPrice())
                return 1;
            else if(left.getPrice()< right.getPrice())
                return -1;
            else return 0;
        });











// with class impl
//        Collections.sort(list,new ProductComparatorImpl());



// with lambda
        Collections.sort(list,(o1, o2) -> {
            if (o1.getPrice()>o2.getPrice()){
                return 1;}
            else if(o1.getPrice()==o2.getPrice()){
                return 0;
            }else {
                return -1;
            }
        });




// with inner class
//        Collections.sort(list, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                Product one = (Product) o1;
//                Product two = (Product) o2;
//
//                if (one.getPrice()> two.getPrice())
//                    return 1;
//                else if (one.getPrice()< two.getPrice())
//                    return -1;
//                else
//                    return 0;
//            }
//        });

        System.out.println(list);
    }
}
