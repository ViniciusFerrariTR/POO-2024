import java.util.Scanner;

public class App {
    static Turma[]turmas = new Turma[50];
    static int quantidadeDeTurma = 0;
    static Campus[] campus = new Campus[50];
    static int quantidadeDeCampus = 0;
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        

        int opcao = 0;

        do {
            exibirMenu();
            opcao = teclado.nextInt();
            roteador(opcao);
        } while (opcao != 0);
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarCampus();
                break;
            case 2:
                cadastrarCurso();
                break;
            case 3:
                cadastrarMatricula();
                break;
            case 4:
                cadastrarEstudante();
                break;
            case 5:
                cadastrarTurma();
                break;
            case 6:
                exibirTudo();
                break;
            default:
            if (opcao !=0) {
                System.out.println("Valor invalido");
            }
                break;
        }
    }

    private static void exibirTudo() {
        for (int i = 0; i < quantidadeDeTurma; i++) {
            System.out.println("Nome turma: " + turmas[i].nome);
            System.out.println("Numero minimo da turma: " + turmas[i].numeroMinimo);
            System.out.println("Ano de ingresso da turma: " + turmas[i].anoIngresso);
        }
    }

    private static void cadastrarCurso() {;
    }

    private static void cadastrarEstudante() {
    }

    private static void cadastrarMatricula() {
    }

    private static void cadastrarCampus() {
        }

    private static void cadastrarTurma() {
        teclado.nextLine();
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma: ");
        turma.nome = teclado.nextLine();
        System.out.println("Digite o numero minimo de alunos: ");
        turma.numeroMinimo = teclado.nextInt();
        System.out.println("Digite o ano de ingresso: ");
        turma.anoIngresso = teclado.nextInt();
        turmas[quantidadeDeTurma] = turma;
        quantidadeDeTurma++;
    }

    public static void exibirMenu() {
        System.out.println("******************************");
        System.out.println("| Digite o valor desejado:   |");
        System.out.println("| 1 - Campus                 |");
        System.out.println("| 2 - Curso                  |");
        System.out.println("| 3 - Matricula              |");
        System.out.println("| 4 - Estudante              |");
        System.out.println("| 5 - Turma                  |");
        System.out.println("| 6 - Exibir tudo            |");
        System.out.println("| 0 - Sair                   |");
        System.out.println("******************************");

    }
}
