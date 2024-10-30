public class Student implements Person{
    private String name;
    private int age;
    private String studentID;
    private String surname;
    public Student(String name, int age, String studentID, String surname) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.surname = surname;

    }
    @Override
    public void getInfo(){
        System.out.println("Name: " + name+ "Age: "+age+ "Student ID: "+studentID+ "Surname: "+surname);
    }
}