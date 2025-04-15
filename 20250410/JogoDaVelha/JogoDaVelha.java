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
    }

    public void limpaTabuleiro() {
        for (int linha = 0; linha < dimensao; linha++) {
            for (int coluna=0; coluna < dimensao; coluna++) {
                tabuleiro[linha][coluna] = 0;    
            }
        }

        jogador = X;
    }

    public int[] posicoes() {
        Random random = new Random();
        int listaPosicoes[] = new int[2];

        listaPosicoes[0] = random.nextInt(0, dimensao);
        listaPosicoes[1] = random.nextInt(0, dimensao);

        return listaPosicoes;
    }

    public void preencherTabuleiro() {
        
        int vencedor = 2;
        jogador = X;

        while (vencedor == 2) {
            int listaPosicoes[] = posicoes();
            vencedor = vencedor();

            if (vencedor == 2) {
                if (tabuleiro[listaPosicoes[0]][listaPosicoes[1]] == VAZIO) {
                    tabuleiro[listaPosicoes[0]][listaPosicoes[1]] = jogador;
                    String tabuleiro = toString();
                    System.out.println(tabuleiro);
                    System.out.println();
                    jogador *= -1; 

                } else {
                    listaPosicoes = posicoes();
                }
            }
        }
    }
    
    public boolean eVencedor(int jogador) {

        // linha
        for (int linha = 0; linha < dimensao; linha++) {
            int totLinha = 0;
            for (int coluna = 0; coluna < dimensao; coluna++) {
                    totLinha += tabuleiro[linha][coluna];
            }
        
            if (totLinha == jogador*dimensao) {
                return true;
            }

        }      

        // coluna
        for (int coluna = 0; coluna < dimensao; coluna++) {
            int totColuna = 0;
            for (int linha = 0; linha < dimensao; linha++) {
                    totColuna += tabuleiro[linha][coluna];
            }

            if (totColuna == jogador* dimensao) {
                return true;
            }
        }

        // diagonal principal
        int totDiagonalPrincipal = 0;
        for (int linha = 0; linha < dimensao; linha++) {
            totDiagonalPrincipal += tabuleiro[linha][linha];
        }

        if (totDiagonalPrincipal == jogador * dimensao) {
            return true;
        }

        // diagonal secundaria
        int totDiagonalSecundaria = 0;
        for (int linha = 0; linha < dimensao; linha++) {
            totDiagonalSecundaria += tabuleiro[linha][dimensao - 1 - linha];
        }
    
        if (totDiagonalSecundaria == jogador * dimensao) {
            return true;
        }

        return false;

    }        

    public int vencedor() {
        
        if (eVencedor(X)) {
            return X;

        } else if (eVencedor(O)) {
            return O;
        }

        for (int linha = 0; linha < dimensao; linha++) {
            for (int coluna = 0; coluna < dimensao; coluna++) {
                if (tabuleiro[linha][coluna] == VAZIO) {
                    return 2;
                    }
                } 
            }

        return 0;
    }

    
    public String toString() {
        String retorno = "";

        for (int linha = 0; linha < dimensao ; linha++) {
            for (int coluna = 0; coluna < dimensao; coluna++) {
        
                if (tabuleiro[linha][coluna] == X) {
                    retorno += (" X ");

                } else if (tabuleiro[linha][coluna] == O) {
                    retorno += (" O ");
                
                } else {
                    retorno += ("   ");
                }

                if (coluna < dimensao){
                    retorno += (" | ");
                }
            }

        if (linha < dimensao - 1) {
            retorno += "\n";
        }
            
        }   

        return retorno;
    } 
    
}