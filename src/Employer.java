public class Employer implements Person {
    private String name;
    private String surname;
    private int age;
    public Employer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public void getInfo(){
        System.out.println("Name: " + name+ " Surname: " + surname+ " Age: " + age);
    }
}
