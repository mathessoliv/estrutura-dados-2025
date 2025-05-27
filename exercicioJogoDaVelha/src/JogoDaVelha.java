import java.util.Random;

public class JogoDaVelha {
    protected static final int X = 1, O = -1;
    protected static final int VAZIO = 0;
    protected int tabuleiro[][];
    protected int jogador;
    protected int dimensao;

    public JogoDaVelha(int dimensao) {
        this.dimensao = dimensao;
        this.tabuleiro = new int[dimensao][dimensao];
        limpaTabuleiro();
    }

    public void limpaTabuleiro() {
        for (int linha = 0; linha < dimensao; linha++) {
            for (int coluna = 0; coluna < dimensao; coluna++) {
                tabuleiro[linha][coluna] = VAZIO;
            }
        }
        jogador = X;
    }

    // TODO: Implementar método para gerar posições aleatórias
    public int[] posicoes() {
        // Exemplo de estrutura para você completar
        Random random = new Random();
        int listaPosicoes[] = new int[2];
        // Gerar posições aleatórias dentro do tabuleiro
        return listaPosicoes;
    }

    // TODO: Implementar método para preencher o tabuleiro dinamicamente
    public void preencherTabuleiro() {
        // Exemplo de estrutura para você completar
        while (vencedor() == 2) {
            int[] posicao = posicoes();
            // Preencher o tabuleiro com base nas posições geradas
        }
    }

    // TODO: Implementar método para verificar o vencedor
    public int vencedor() {
        // Exemplo de estrutura para você completar
        // Retornar 1 para X, -1 para O, 0 para empate e 2 para jogo em andamento
        return 2;
    }

    // TODO: Implementar método toString para exibir o tabuleiro
    public String toString() {
        // Exemplo de estrutura para você completar
        String retorno = "";
        // Construir a string do tabuleiro
        return retorno;
    }
}