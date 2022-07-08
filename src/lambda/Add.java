package lambda;

public class Add {
    public static void main(String[] args) {


        AddAble addAble10 = (a,b) -> (a + b);
        System.out.println(addAble10.sum(10, 20));




        AddAbleImpl addAble22 = new AddAbleImpl();
        System.out.println(addAble22.sum(10, 50));


        AddAble addAble = (a, b) -> a + b;
        System.out.println(addAble.sum(12,15));

                AddAble addAble2=(Integer a,Integer b)->(a+b);
                System.out.println(addAble2.sum(12,15));

                AddAble addAble1=(Integer aa,Integer bb)->{
                return(aa+bb);
                };
                System.out.println(addAble1.sum(20,30));

                }
                }
