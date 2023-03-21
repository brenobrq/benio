package Odesafio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static List<BilheteUnico> bilhetes = new ArrayList<BilheteUnico>();

    static List<UsuarioDoSistema> usuarios = new ArrayList<UsuarioDoSistema>();


    Scanner teclado = new Scanner(System.in);

    public void pagarPassagem() {

    }

    public void menu() {



        int opcoes = 0;

        int guardarTipoBilhete;

        String nome,telefone,email,cpf;

        String codigoDoBilhete;


        do {
            System.out.println("--menu--");
            System.out.println(" 1 = Cadastrar Usuário ");
            System.out.println(" 2 = Cadastrar Bilhete " );
            System.out.println(" 3 = Recarregar Bilhete ");
            System.out.println(" 4 = Pagar Passagem ");
            System.out.println(" 5 = Listar Bilhetes ");
            System.out.println(" 6 = Pesquisar Bilhete por CPF ");
            System.out.println(" 99 – Sair ");

            try{
                opcoes = teclado.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("valor invalido,insira um número");
                teclado.next();
            }

            switch (opcoes) {

                case 1:
                    teclado.nextLine();
                    System.out.println("opção 1 selecionada: ");
                    System.out.println("digite seu nome: ");

                    nome = teclado.nextLine();
                    System.out.println("digite seu telefone: ");

                    telefone = teclado.nextLine();
                    System.out.println("digite seu cpf: ");

                    cpf = teclado.nextLine();
                    System.out.println("digite seu email: ");

                    email = teclado.nextLine();
                    UsuarioDoSistema usuario = new UsuarioDoSistema(nome, cpf, email, telefone);
                    usuarios.add(usuario);
                    break;

                case 2:
                    System.out.println(" 2 = Cadastrar Bilhete ");
                    teclado.nextLine();
                    System.out.println("Insira Seu CPF");
                    String cpf2 = teclado.nextLine();
                    UsuarioDoSistema p1 = null;
                    boolean achou = false;
                    for (UsuarioDoSistema u:usuarios){
                        if (cpf2.equals(u.getCpf())){
                            p1 = u;
                            achou = true;

                        }
                    }
                    if (!achou) {
                        System.out.println(" CPF Inválido! Tente Novamente. ");

                    }else {
                        System.out.println(" informe o tipo de Bilhete: ");
                        System.out.println("1 = Bilhete Comum");
                        System.out.println("2 = Bilhete Estudante");
                        guardarTipoBilhete = teclado.nextInt();
                        BilheteUnico b1;
                        if (guardarTipoBilhete == 1) {
                            b1 = new BilheteComum(p1);


                            System.out.println(" Bilhete Comum Cadastrado! ");

                        }else {
                            b1 = new BilheteDoEstudante(p1);
                            System.out.println(" Bilhete do Estudante Cadastrado! ");
                        }
                        bilhetes.add(b1);

                    }
                    break;

                case 3:
                    String guardarCodigo;
                    System.out.println(" recarregar bilhete: ");
                    achou = false;
                    System.out.println(" informe o seu código: ");
                    teclado.nextLine();
                    guardarCodigo = teclado.nextLine();
                    BilheteUnico b2 = null;
                    for (BilheteUnico value : bilhetes) {
                        if (guardarCodigo.equals(value.getCodigoDoBilhete())) {
                            b2 = value;
                            achou = true;
                        }
                    }
                    if (achou == false) {
                        System.out.println(" código inválido! Tente novamente. ");
                    } else {

                        if (b2 instanceof BilheteDoEstudante) {
                            b2.recarregarBilhete();
                        } else {
                            System.out.println("insira o valor");
                            double guardarValor = teclado.nextDouble();
                            b2.recarregarBilhete(guardarValor);
                        }

                    }
                    break;

                case 4:
                    achou = false;
                    teclado.nextLine();
                    System.out.println(" informe o seu código: ");
                    String codigoDobilhete = teclado.nextLine();
                    b2 = null;
                    for (BilheteUnico value : bilhetes) {
                        if (codigoDobilhete.equals(value.getCodigoDoBilhete())) {
                            b2 = value;
                            achou = true;
                        }
                    }
                    if (achou == false) {
                        System.out.println("código inválido informe outro código: ");
                    } else {
                        b2.pagarPassagem();
                    }
                    break;

                case 5:
                    System.out.println(" listar bilhete: ");
                    teclado.nextLine();

                    System.out.println(" lista de bilhetes: ");
                    for (BilheteUnico bilhete:bilhetes
                    ) {
                        System.out.println(bilhete);
                    }
                    break;

                case 6:
                    boolean achado = false;
                    String cp = teclado.nextLine();
                    System.out.println(" Digite o CPF: ");
                    String salvarCpf = teclado.nextLine();
                    BilheteUnico salvar = null;
                    for (BilheteUnico bilhete : bilhetes) {
                        if(salvarCpf.equals(bilhete.getUsuario().getCpf())) {
                            salvar = bilhete;

                        }
                    }
                    if (achado == true)
                        System.out.println(" Bilhete: " + salvar);
                   else
                System.out.println(" O CPF não foi encontrado: ");
                   break;

                case 99:
            }
        }while (opcoes != 99);

    }

}

