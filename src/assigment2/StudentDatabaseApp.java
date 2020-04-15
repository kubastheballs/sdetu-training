package assigment2;

import java.util.Scanner;

public class StudentDatabaseApp
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Tim", "Short", "2133523");
        System.out.println(s1.toString());
        System.out.println(s1.getEmail());
        System.out.println(s1.getUserID());
        s1.enroll();
        s1.pay();
    }
}
class Student
{
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private static int id = 1000;
    private String userID;
    double balance;
    double courseFee = 500;
    int courseEnrolled;
    String courseName;
    String courses = "";


    public Student (String firstName, String lastName, String ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        id++;

        setEmail();
        setUserID();

    }

    void setEmail()
    {
        String emailAfterAt = "@university.com";
        email = firstName + "." + lastName + emailAfterAt;

    }
    String getEmail()
    {
        return email;
    }

    void setUserID()
    {
        int random = (int) (Math.random() * 10000);

        userID = "" + id + random + ssn.substring(3);

    }
    String getUserID()
    {
        return userID;
    }

    void enroll()
    {
        do
        {
            System.out.println("Courses to enroll(each costs $500):\n1 History \n2 Physics\n3 Mathematics\n5 for quit");
            Scanner in = new Scanner(System.in);
            courseEnrolled = in.nextInt();

            switch (courseEnrolled)
            {
                case 1: courseName = "History"; break;
                case 2: courseName = "Physics"; break;
                case 3: courseName = "Mathematics"; break;
                case 5: break;
            }
            if (courseEnrolled != 5)
            {
                courses += "\n" + courseName;
                balance -= courseFee;
                checkBalance();
                showCourses();
            }
            else if (courseEnrolled == 5)
            {
                checkBalance();
                showCourses();
                break;
            }
            checkBalance();
            showCourses();
        }
        while  (0 == 0);

    }
    void pay( )
    {
        double amount;
        System.out.println("Enter your payment:");
        Scanner in = new Scanner(System.in);
        amount = in.nextDouble();
        balance += amount;
        checkBalance();
    }
    void checkBalance()
    {
        System.out.println("Your balance: $" + balance);
    }
    @Override
    public String toString()
    {
        return "[Name: " + firstName + " " + lastName + " ]\n[userID: " + userID +"]";
    }

    void showCourses()
    {

        System.out.println("Courses enrolled: " + courses);
    }
}
