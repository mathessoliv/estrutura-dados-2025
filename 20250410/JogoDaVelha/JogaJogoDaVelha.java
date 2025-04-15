import java.util.Scanner;

public class JogaJogoDaVelha {
    public static void main(String[] args) {

        /** Sua classe deve fazer o seguinte:
         * Instanciar um jogo da velha
         * Fazer jogadas até ganhar ou empatar
         * Imprimir qual jogador ganhou ou se houve empate
         * Imprimir o tabuleiro final
         * Após a impressão do tabuleiro, deve ser oferecida
         * a opção de iniciar um novo jogo
         */
        Scanner scanner = new Scanner(System.in);

        int resp = 1;

        System.out.println("Bem vindo ao Jogo da Velha Automatizado!");

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

            jogo.preencherTabuleiro();
            String tabuleiro = jogo.toString();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println(tabuleiro);


            if (jogo.vencedor() == 1) {
                System.out.println("X venceu o jogo!");
            } else if (jogo.vencedor() == -1) {
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
