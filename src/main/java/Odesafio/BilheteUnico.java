package Odesafio;

import java.util.Random;

public abstract class BilheteUnico {
    protected String codigoDoBilhete;

    protected UsuarioDoSistema usuario;

    protected String codigo;

    private String recarregarBilhete;

    public BilheteUnico(UsuarioDoSistema usuario) {
        this.codigoDoBilhete = gerarCodigo();
        this.usuario = usuario;
    }
    public String gerarCodigo() {
        int bilhete;
        Random random = new Random();
        bilhete = (int)(random.nextDouble() * 1000);

        return String.valueOf(bilhete);
    }

    public UsuarioDoSistema getUsuario() {
        return usuario;
    }

    public String getCodigoDoBilhete() {
        return codigoDoBilhete;
    }

    public void pagarPassagem() {

    }

    public void recarregarBilhete() {

    }

    public void pesquisarBilhetePorCpf() {

    }

    public void recarregarBilhete(double valor) {

    }

}

