package Odesafio;

public class BilheteDoEstudante extends BilheteUnico {
    private double cota;

    public BilheteDoEstudante(UsuarioDoSistema usuario) {
        super(usuario);
    }


    public void recarregarBilhete() {
        cota += 48;
    }


    public void pagarPassagem() {
       cota -= 1;
    }
    public String toString(){
        String dados = "";
        dados += "dados do usuario: " + this.usuario.getNome() + (" ");
        dados += "codigo do bilhete: " + this.codigoDoBilhete + (" ");
        dados += "cota: " + this.cota + (" ");

        return dados;

    }
}
