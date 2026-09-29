package application;

import entities.Rectangle;

/*
* Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.
*/
public class calculosRetangulo {
    static void main() {
        Rectangle rec = new Rectangle();
        IO.println("Enter rectangle width and height:");
        rec.width = Double.parseDouble(IO.readln("Width: "));
        rec.height = Double.parseDouble(IO.readln("Height: "));
        IO.println(rec);
    }
}
