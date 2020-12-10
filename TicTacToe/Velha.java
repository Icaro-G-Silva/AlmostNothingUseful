import java.util.Scanner;

public class Velha {
    public static void main(String args[]) {
        Jogo jogo = new Jogo();
        Scanner scanner = new Scanner(System.in);

        mostrarRegras();
        while(true) {
            System.out.println("É a vez do: " + jogo.verificarTurno());
            System.out.print("\n->");
            String jogada = scanner.nextLine();
            jogo.fazerJogada(jogada);
            jogo.mostrarJogo();
            int resultado = jogo.verificarJogo();
            if(resultado != 0 && resultado != 3) {
                System.out.println("Parabéns, " + ((resultado == 1) ? "X" : "O") + "! Você ganhou!\n");
                break;
            }
            else if(resultado == 3) {
                System.out.println("Empate!!\n");
                break;
            }
        }
        
        System.out.println("Obrigado por jogar!");
        scanner.close();
    }

    private static void mostrarRegras() {
        System.out.println("É um jogo da Velha qualquer!\n");
        System.out.println("Tabuleiro:\nQ W E\nA S D\nZ X C");
        System.out.println("Para jogar, basta selecionar a posição da sua jogada, na sua vez.");
    }

}
