package application;
import entities.Student;

public class notasAluno {
    static void main() {
        Student std = new Student();

        std.name = IO.readln("Name: ");
        std.grade1 = Double.parseDouble(IO.readln("Grade 1: "));
        std.grade2 = Double.parseDouble(IO.readln("Grade 2: "));
        std.grade3 = Double.parseDouble(IO.readln("Grade 3: "));

        IO.println(std);
    }
}
