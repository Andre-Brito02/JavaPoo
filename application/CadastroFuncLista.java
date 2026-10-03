package application;
import entities.ListEmployees;
import java.util.ArrayList;
import java.util.List;

public class CadastroFuncLista {
    static void main() {
        List<ListEmployees> listaDeFuncionarios = new ArrayList<>();
        int qtdFuncionarios = Integer.parseInt(IO.readln("Informe quantos funcionários serão cadastrados: "));

        for(int i = 0; i < qtdFuncionarios; i++){
            IO.println("\nEmployeee #%d:".formatted(i+1));
            int id = Integer.parseInt(IO.readln("Id: "));

            boolean idExiste;
            do {
                idExiste = false;

                for (ListEmployees funcionario : listaDeFuncionarios) {
                    if (id == funcionario.getId()) {
                        idExiste = true;
                        IO.println("This id already exists! Try another one.");
                        id = Integer.parseInt(IO.readln("Id: "));
                        break;
                    }
                }
            } while (idExiste);

            String name = IO.readln("Name: ");
            double salary = Double.parseDouble(IO.readln("Salary: "));

            ListEmployees emp = new ListEmployees(id, name, salary);
            listaDeFuncionarios.add(emp);
        }

        int id = Integer.parseInt(IO.readln("Enter the employee id that will have salary increase: "));
        boolean encontrado = false;

        for (ListEmployees dadosFunc : listaDeFuncionarios) {
            if (id == dadosFunc.getId()) {
                double percentage = Double.parseDouble(IO.readln("Enter the percentage: "));
                dadosFunc.increaseSalary(percentage);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            IO.println("This id does not exist!");
        }

        IO.println("\nList of employees: ");
        for(ListEmployees dadosFunc: listaDeFuncionarios){
            IO.println(dadosFunc);
        }
    }
}
