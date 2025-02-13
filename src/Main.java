public class Main {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "111.222.333-44");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Rua B, 456", "12.345.678/0001-99");

        pf.exibirInformacoes();
        System.out.println();
        pj.exibirInformacoes();
    }
}
