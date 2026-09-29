package application;
import entities.BankAccount;

import java.util.Locale;

public class CadastroBancario {
    static void main() {
        BankAccount ba;

        int numberAccount = Integer.parseInt(IO.readln("Enter account number: "));
        String name = IO.readln("Enter account holder: ");
        char choice = IO.readln("Is there an initial deposit (y/n)? ").toLowerCase(Locale.ROOT).charAt(0);

        if(choice == 'y'){
            double initialValue = Double.parseDouble(IO.readln("Enter initial deposit value: "));
            ba = new BankAccount(numberAccount, name, initialValue);
        }else{
            ba = new BankAccount(numberAccount, name);
        }

        IO.println("\nAccount data:");
        IO.println(ba);

        double depositValue = Double.parseDouble(IO.readln("Enter a deposit value: "));
        ba.deposit(depositValue);
        IO.println("\nUpdated account data:");
        IO.println(ba);

        double withdrawValue = Double.parseDouble(IO.readln("Enter a withdraw value: "));
        ba.withdraw(withdrawValue);
        IO.println("\nUpdated account data:");
        IO.println(ba);
    }
}
