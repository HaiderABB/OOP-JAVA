public class inheritance {

    public static void main(String args[]) {
        Student student1 = new Student();
        student1.SetName("Unkil");
        student1.SetAge(20);
        student1.SetDegree("SE");
        student1.SetNationality("Pakistani");
        student1.showDetails();
    }
}

class Student {
    private String name;
    private String degree;
    private int age;
    public String nationality;

    public void SetName(String nme) {
        name = nme;
    }

    public void SetDegree(String deg) {
        degree = deg;
    }

    public void SetAge(int a) {
        age = a;
    }

    public void SetNationality(String n) {
        nationality = n;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Degree " + degree);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
    }
}