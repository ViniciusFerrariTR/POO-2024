import java.util.Scanner;

public class App {
    static Turma[]turmas = new Turma[50];
    static int quantidadeDeTurma = 0;
    static Campus[] campus = new Campus[50];
    static int quantidadeDeCampus = 0;
    static Curso[] cursos = new Curso[50];
    static int quantidadeDeCursos = 0;
    static Matricula[] matriculas = new Matricula[50];
    static int quantidadeDeMatricula = 0;
    static Aluno[] alunos = new Aluno[50];
    static int quantidadeDeAlunos = 0;
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        

        int opcao = 0;
        int opcaoListaCadastrados = 0;
        do {
            exibirMenu();
            opcao = teclado.nextInt();
            roteador(opcao);
            if (opcao == 6) {
                exibirListaCadastro();
                opcaoListaCadastrados = teclado.nextInt();
                roteadorListas(opcaoListaCadastrados);
                if (opcaoListaCadastrados == 6) {
                    exibirMenu();
                }
            }
            

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
                cadastrarAluno();
                break;
            case 5:
                cadastrarTurma();
                break;
            case 6:
                exibirListaCadastro();
                break;
            default:
            if (opcao !=0) {
                System.out.println("Valor invalido");
            }
                break;
        }
    }
    
    public static void roteadorListas(int opcao) {
        switch (opcao) {
            case 1:
                exibirCampo();
                break;
            case 2:
                exibirCurso();
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                exibirTurma();
                break;
            case 6:
                exibirListaCadastro();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Valor invalido");
                }
                break;
        }
    }

    /* FUNÇÕES PARA EXIBIÇAO DAS LISTAS */
    private static void exibirCampo() {

        for (int i = 0; i < quantidadeDeCampus; i++) {
            System.out.println("Campus Cadastrados:");
            System.out.println("Nome do Campus: " + campus[i].nome);
            System.out.println("Endereço do Campus: " + campus[i].endereco);
            System.out.println("Cidade do Campus: " + campus[i].cidade);
        }
    }
    
    private static void exibirCurso() {

        for (int i = 0; i < quantidadeDeCampus; i++) {
            System.out.println("Cursos Cadastrados:");
            System.out.println("Nome do Curso: " + cursos[i].nome);
            System.out.println("Duração do Curso: " + cursos[i].duracao);
            System.out.println("Modalidade do Curso: " + cursos[i].modalidade);
        }
    }
    private static void exibirTurma() {
        
        for (int i = 0; i < quantidadeDeTurma; i++) {
            System.out.println("Turmas cadastradas:");
            System.out.println("Nome turma: " + turmas[i].nome);
            System.out.println("Numero minimo da turma: " + turmas[i].numeroMinimo);
            System.out.println("Ano de ingresso da turma: " + turmas[i].anoIngresso);
        }
    }

    /* FUNÇÕES PARA EXIBIÇAO DAS LISTAS ACABA AQUI*/







    /* FUNÇÕES PARA CADASTRO  */
    private static void cadastrarCampus() {
        teclado.nextLine();
        Campus campo = new Campus();
        System.out.println("Digite o nome do campus: ");
        campo.nome = teclado.nextLine();
        System.out.println("Digite o endereço do campus: ");
        campo.endereco = teclado.nextLine();
        System.out.println("Digite a cidade do campus: ");
        campo.cidade = teclado.nextLine();
        campus[quantidadeDeCampus] = campo;
        quantidadeDeCampus++;
    }

    private static void cadastrarCurso() {
        teclado.nextLine();
        Curso curso = new Curso();
        System.out.println("Digite o nome do curso: ");
        curso.nome = teclado.nextLine();
        System.out.println("Digite a duracao do curso: ");
        curso.duracao = teclado.nextLine();
        System.out.println("Digite a modalidade do curso: ");
        curso.modalidade = teclado.nextLine();
        cursos[quantidadeDeCursos] = curso;
        quantidadeDeCursos++;
    }

    private static void cadastrarAluno() {
    }

    private static void cadastrarMatricula() {
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

    /* FUNÇÕES PARA CADASTRO ACABA AQUI */










    /* MENUS */
    public static void exibirMenu() {
        System.out.println("******************************");
        System.out.println("| Digite o valor desejado:   |");
        System.out.println("| 1 - Campus                 |");
        System.out.println("| 2 - Curso                  |");
        System.out.println("| 3 - Matricula              |");
        System.out.println("| 4 - Estudante              |");
        System.out.println("| 5 - Turma                  |");
        System.out.println("| 6 - Exibir menu de listas  |");
        System.out.println("| 0 - Sair                   |");
        System.out.println("******************************");

    }

    public static void exibirListaCadastro(){
        System.out.println("**********************************************");
        System.out.println("| Digite o valor desejado:                   |");
        System.out.println("| 1 - Exibir lista de Campus                 |");
        System.out.println("| 2 - Exibir lista de Curso                  |");
        System.out.println("| 3 - Exibir lista de Matricula              |");
        System.out.println("| 4 - Exibir lista de Estudante              |");
        System.out.println("| 5 - Exibir lista de Turma                  |");
        System.out.println("| 6 - Voltar ao menu de cadastro             |");
        System.out.println("| 0 - Sair                                   |");
        System.out.println("**********************************************");
    }

    /* MENUS ACABA AQUI */
}
