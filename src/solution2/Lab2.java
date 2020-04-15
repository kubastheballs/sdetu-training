package solution2;

public class Lab2
{
    public static void main(String[] args)
    {
        Student stu1 = new Student("janelle", "321456987");
    }
}

class Student
{
    private static int id = 1000;
    private String userID;
    private String name;
    private String ssn;
    private String email;
    private String courses = "";
    private static final int costOfCourse = 800;
    private int balance = 0;

    public Student(String name, String ssn)
    {
        id++;
        this.name = name;
        this.ssn = ssn;
        setUserID();
        setEmail();
    }
    private void setEmail()
    {
        email = name.toLowerCase() + "." + id + "@sdetuniversity.com";
        System.out.println("Your e-mail is: " + email);
    }
    public String getEmail() {
        return email;
    }
    private void setUserID()
    {
        int max = 9000;
        int min = 1000;
        int randNum = (int) (Math.random() * (max - min));
        randNum = randNum + min;
        userID = id + randNum + ssn.substring(5);
        System.out.println("Your userID is: " + userID);
    }
    public void enroll(String course)
    {
        this.courses += course;
        System.out.println(courses);

        balance += costOfCourse;
    }
    public void payTuition(int amount)
    {
        System.out.println("Payment $" + amount);
        balance -= amount;
    }
    public void checkBalance()
    {
        System.out.println("Balance: $" + balance);
    }
    public void showCourses()
    {
        System.out.println(courses);
    }
    @Override
    public String toString()
    {
        return "[NAME: " + name + "]\n[Courses: " + courses + "]\nBALANCE: " + balance + "]";
    }
}
