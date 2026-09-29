package application;
import entities.Employee;

public class dadosFuncionario {
    static void main() {
        Employee emp = new Employee();
        emp.name = IO.readln("Name: ");
        emp.grossSalary = Double.parseDouble(IO.readln("Gross Salary: "));
        emp.tax = Double.parseDouble(IO.readln("Tax: "));

        IO.println("Employee: " + emp);

        double percentage = Double.parseDouble(IO.readln("Which percentage to increase salary? "));
        emp.increaseSalary(percentage);

        IO.println("Updated data: " + emp);
    }
}
