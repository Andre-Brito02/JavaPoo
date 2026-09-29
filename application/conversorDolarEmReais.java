package application;
import entities.CurrencyConverter;

public class conversorDolarEmReais {
    static void main() {
        CurrencyConverter cc = new CurrencyConverter();
        cc.cotacaoDolar = Double.parseDouble(IO.readln("What is the dollar price? "));
        cc.qtdDolarComprado = Double.parseDouble(IO.readln("How many dollars will be bought? "));

        IO.println(cc);
    }
}
