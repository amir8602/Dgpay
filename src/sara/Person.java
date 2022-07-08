package sara;

public class Person {
    private String name;
    private Integer height;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public static Person personFactory(String name, Integer height, Integer age) {
        return new Person() {
            {
                setName(name);
                setHeight(height);
                setAge(age);

            }

        };
    }

    //todo :  setters   getters   factory method    to String            //done

    //todo : create impl class from comparator

    //todo : create anons class

    //todo : create lambda


    //for all compare with height
}
