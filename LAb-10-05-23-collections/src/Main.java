import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(5242,"Anika",20);
        Student s2=new Student(5140,"Atia",21);
        Student s3=new Student(5241,"Afroz",22);
        ArrayList<Student>al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        for (int i=0;i<al.size();i++){
            System.out.println(s1.rollno+" "+s1.name+" "+s1.age);
            System.out.println(s2.rollno+" "+s2.name+" "+s2.age);
            System.out.println(s3.rollno+" "+s3.name+" "+s3.age);
        }


    }
}