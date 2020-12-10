public class Jogo {
    private Boolean turn = true;
    private int[][] jogo = new int[3][3];

    public Jogo() {
        for(int i = 0; i < jogo.length; i++) {
            for(int j = 0; j < jogo[i].length; j++) jogo[i][j] = 0;
        }
    }

    public void fazerJogada(String posicao) {
        posicao = posicao.toUpperCase();
        String erro = "Posição já ocupada! Escolha outra!";
        switch(posicao) {
            case "Q": 
                if(jogo[0][0] == 0) jogo[0][0] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            case "W": 
                if(jogo[0][1] == 0) jogo[0][1] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            case "E": 
                if(jogo[0][2] == 0) jogo[0][2] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            case "A":
                if(jogo[1][0] == 0) jogo[1][0] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            case "S":
                if(jogo[1][1] == 0) jogo[1][1] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            case "D":
                if(jogo[1][2] == 0) jogo[1][2] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            case "Z":
                if(jogo[2][0] == 0) jogo[2][0] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            case "X":
                if(jogo[2][1] == 0) jogo[2][1] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            case "C":
                if(jogo[2][2] == 0) jogo[2][2] = (turn) ? 1 : 2;
                else {
                    System.out.println(erro);
                    return;
                }
            break;
            default: 
                System.out.println("Opção inválida! Tente novamente");
                return;
        }
        turn = !turn;
    }

    public String verificarTurno() {
        return (turn) ? "X" : "O";
    }

    public int verificarJogo() {
        int cruzado = verificarCruzado();
        int vertical = verificarVertical();
        int horizontal = verificarHorizontal();

        if(cruzado != 0) return cruzado;
        if(vertical != 0) return vertical;
        if(horizontal != 0) return horizontal;

        Boolean semEspaco = true;
        for(int i = 0; i < jogo.length; i++) {
            for(int j = 0; j < jogo[i].length; j++) if(jogo[i][j] == 0) semEspaco = false;
        }
        if(semEspaco) return 3;

        return 0;
    }

    private int verificarCruzado() {
        if(jogo[0][0] == jogo[1][1] && jogo[0][0] == jogo[2][2]) return jogo[0][0];
        else if(jogo[0][2] == jogo[1][1] && jogo[0][2] == jogo[2][0]) return jogo[0][2];
        else return 0;
    }

    private int verificarVertical() {
        for(int i = 0; i < jogo.length; i++) if(jogo[0][i] == jogo[1][i] && jogo[0][i] == jogo[2][i]) return jogo[0][i];
        return 0;
    }

    private int verificarHorizontal() {
        for(int i = 0; i < jogo.length; i++) if(jogo[i][0] == jogo[i][1] && jogo[i][0] == jogo[i][2]) return jogo[i][0];
        return 0;
    }

    public void mostrarJogo() {
        for(int i = 0; i < jogo.length; i++) {
            for(int j = 0; j < jogo[i].length; j++) {
                int marca = jogo[i][j];
                if(marca == 1) System.out.print("X");
                else if(marca == 2) System.out.print("O");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
