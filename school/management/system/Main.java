package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Teacher Orazbek = new Teacher(1, "Orazbek", 100);
        Teacher Nugman = new Teacher(2, "Nugman", 50);
        Teacher Olzhas = new Teacher(3, "Olzhas", 25);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Orazbek);
        teacherList.add(Olzhas);
        teacherList.add(Nugman);

        List<Student> studentList = new ArrayList<>();

        Student Yerzhan = new Student(1, "Yerzhan", 5);
        Student Nurzhan = new Student(4, "Nurzhan", 1);
        Student Nurlybek = new Student(2, "Nurlybek", 10);

        studentList.add(Yerzhan);
        studentList.add(Nurlybek);
        studentList.add(Nurzhan);

        School num_124 = new School(teacherList, studentList);
        for(int i = 0; i < studentList.size(); i++){
            int pees = rand.nextInt(5000);
            studentList.get(i).payFees(pees);
        }

        for(int i = 0; i < teacherList.size(); i++){
            int salary = teacherList.get(i).getSalary();
            teacherList.get(i).receiveSalary(salary);
        }


        System.out.println("num_124 has earned $" + num_124.getTotalMoneyEarned());
        
    }
}
