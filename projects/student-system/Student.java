import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println(name + " - " + marks);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            list.add(new Student(name, marks));
        }

        System.out.println("\nStudent Records:");
        for(Student s : list){
            s.display();
        }
    }
}
