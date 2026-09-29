package entities;

public class CurrencyConverter {
    public double cotacaoDolar;
    public double qtdDolarComprado;
    public static double valorIOF = 0.06;

    public double valorAPagar(){
        return (qtdDolarComprado + (qtdDolarComprado*valorIOF)) * cotacaoDolar;
    }

    public String toString(){
        return "Amount to be paid in reais = R$ " + "%.2f".formatted(valorAPagar());
    }
}
