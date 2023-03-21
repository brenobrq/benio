package soteste;

import java.util.ArrayList;

public class Teste1pt2 {
    public static void main(String[] args) {

        Teste1 p1 = new Teste1("Breno Luz");
        p1.setIdade(17);

        // Isso aqui serve para aumentar os anos de vida(fazer aniversário.)
        //poderia usar um código para repetir o aumento de idade?

        p1.FAzaniversario();
        p1.FAzaniversario();
        p1.FAzaniversario();

        System.out.println(" nome da pessoa: " + p1.getNome());
        System.out.println(" idade da pessoa: " + p1.getIdade());
    }
}

