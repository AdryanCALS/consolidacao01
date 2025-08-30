//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.titulo = "Memorias postumas de bras cubas";
        livro1.autor = "Machado de Assis";
        livro1.preco = 59.99;

        livro2.titulo = "Diario de um banana: Rodrick e o cara";
        livro2.autor = "Jeff Kinney";
        livro2.preco = 199.99;

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}