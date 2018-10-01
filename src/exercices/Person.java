package exercices;

public class Person {

    //Atributes
    private String name;
    private int age;
    private boolean wilder;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Methods
    public String whoAmI(){
        return "My name is " + this.getName() + " and I'm " + Integer.toString(this.getAge());
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isWilder(){
        return this.wilder;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWilder(boolean wilder){
        this.wilder = wilder;
    }

    // Do not remove this empty constructor !
    public Person() {
    }
}
