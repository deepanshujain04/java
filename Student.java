import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int roll_no;
    String sec;

    void input() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter section: ");
        sec = sc.nextLine();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll_no);
        System.out.println("Section: " + sec);
    }

    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();

        System.out.println("Enter details for student 1:");
        s.input();
        System.out.println("\nEnter details for student 2:");
        s2.input();

        System.out.println("\nDetails of student 1:");
        s.display();
        System.out.println("\nDetails of student 2:");
        s2.display();
    }
}