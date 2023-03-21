package soteste;

import java.util.Scanner;

public class Porta2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Porta p1 = new Porta();

        if(p1.aberta){
            System.out.println(" A porta está aberta ");

        }else{
            System.out.println(" A porta está fechada ");
        }

        //dimensões
        p1.dimensaoZ = 1;
        p1.dimensaoY = 2;
        p1.dimensaoX = 3;


        System.out.println("dimensão da porta: " + p1.dimensaoZ);
        System.out.println("dimensãoda porta: " + p1.dimensaoX);
        System.out.println("dimensão da porta: " + p1.dimensaoY);

        //pintura da porta
        p1.pintar("Azul");
        System.out.println("cor da porta:" + p1.cor);

        teclado.close();

    }
}

