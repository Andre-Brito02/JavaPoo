package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double final_grade(){
        return grade1+grade2+grade3;
    }

    public String result(){
        return (final_grade() >= 60.0) ? "PASS" : "FAILED\nMISSING " +
                "%.2f".formatted(60.0-final_grade()) + " POINTS";
    }

    public String toString(){
        return "FINAL GRADE = " + "%.2f".formatted(final_grade()) +
                "\n" + result();
    }
}
