package function;

public class Person {

    private Boolean sex;
    private Integer age;

    public Person() {

    }

    static String show(Boolean sex , Integer age){
        System.out.println(sex+" "+age);
        return sex+" "+age;
    }

    //public static Person personFactory(){}


    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(Boolean sex, Integer age) {
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex=" + sex +
                ", age=" + age +
                '}';
    }
}
