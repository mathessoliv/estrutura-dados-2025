import java.util.Scanner;

public class JogaJogoDaVelha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int resp = 1;

        System.out.println("Bem vindo ao Jogo da Velha!");

        while (resp == 1) {

            int dimensao = 0;

            while (dimensao % 2 == 0) {
                System.out.println("Digite o número da dimensão do tabuleiro: ");
                dimensao = scanner.nextInt();

                if (dimensao < 3) {
                    System.out.println("O tamanho informado é muito pequeno, por favor, informe um maior.");

                } else if (dimensao % 2 == 0) {
                    System.out.println("Por favor, digite um valor ímpar.");
                }
            }

            JogoDaVelha jogo = new JogoDaVelha(dimensao); 

            jogo.limpaTabuleiro();
            String tabuleiro = jogo.toString();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println(tabuleiro);

            int vencedor = 2;
            while (vencedor == 2) {
                System.out.println("Jogador " + (jogo.jogador == JogoDaVelha.X ? "X" : "O") + ", faça sua jogada.");
                int[] posicao = jogo.posicoes();
                if (jogo.tabuleiro[posicao[0]][posicao[1]] == JogoDaVelha.VAZIO) {
                    jogo.tabuleiro[posicao[0]][posicao[1]] = jogo.jogador;
                    tabuleiro = jogo.toString();
                    System.out.println(tabuleiro);
                    vencedor = jogo.vencedor();
                    jogo.jogador *= -1; 
                } else {
                    System.out.println("Posição já ocupada, tente novamente.");
                }
            }

            if (vencedor == JogoDaVelha.X) {
                System.out.println("X venceu o jogo!");
            } else if (vencedor == JogoDaVelha.O) {
                System.out.println("O venceu o jogo!");
            } else {
                System.out.println("O jogo deu empate!");
            }

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            System.out.println("Você deseja jogar novamente? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            resp = scanner.nextInt();

            while (resp != 1 && resp != 2) {
                System.out.println("Por favor, digite um número válido.");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                resp = scanner.nextInt();
            }
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Obrigado por jogar!");
    }
}