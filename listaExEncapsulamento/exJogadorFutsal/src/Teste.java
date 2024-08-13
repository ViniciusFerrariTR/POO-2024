public class Teste {
    public static void main(String[] args) throws Exception {
        JogadorFutsal jogador1 = new JogadorFutsal();
        JogadorFutsal jogador2 = new JogadorFutsal();

        jogador1.setNome("Vinicius");
        jogador1.setIdade(21);
        jogador1.setPosicao("Ala");


        jogador2.setNome("Marcelo");
        jogador2.setIdade(22);
        jogador2.setPosicao("Pivô");




        System.out.println("Jogador 1:" + jogador1.getNome() + " Idade:" + jogador1.getIdade() + " Posicao:" + jogador1.getPosicao());
        System.out.println("Jogador 2:" + jogador2.getNome() + " Idade:" + jogador2.getIdade() + " Posicao:" + jogador2.getPosicao());
    }
}
