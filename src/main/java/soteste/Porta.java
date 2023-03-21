package soteste;

public class Porta {
    public boolean aberta = false;

    String cor;

    double dimensaoZ;

    double dimensaoY;

    double dimensaoX;

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void fechar() {
        aberta = false;
    }

    public void abrir() {
        aberta = true;
    }


    public void pintar (String cor){
        this.cor = cor;
    }
}

