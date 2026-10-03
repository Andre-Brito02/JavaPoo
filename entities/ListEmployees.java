package entities;

public class ListEmployees {
    private int id;
    private String name;
    private double salary;

    public ListEmployees(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void increaseSalary(double percentage){
        this.salary += this.salary * percentage / 100.0;
    }

    public String toString(){
        return id + ", " + name + ", %.2f".formatted(salary);
    }
}
