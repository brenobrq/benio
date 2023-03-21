package Odesafio;

    public class BilheteComum extends BilheteUnico {

        private double saldo;


        public BilheteComum(UsuarioDoSistema usuario) {
            super(usuario);
        }


        public void recarregarBilhete(double valor) {
            saldo = valor + saldo;
        }


        public void pagarPassagem() {
            saldo = saldo - 5;
        }


        public String toString(){
            String dados = "";
            dados += "dados do usuario: " + this.usuario.getNome() + (" ");
            dados += "codigo do bilhete: " + this.codigoDoBilhete + (" ");
            dados += "saldo: " + this.saldo + (" ");

            return dados;

        }

    }

