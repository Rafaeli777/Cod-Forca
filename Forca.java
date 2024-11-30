import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavraSecreta = "JAVA"; 
        String palavraAdivinhada = "_".repeat(palavraSecreta.length()); // Cria a string com os underscores
        int tentativas = 6;
        boolean jogoAtivo = true;

        System.out.println("Bem-vindo ao Jogo da Forca!");

        while (jogoAtivo && tentativas > 0) {
            System.out.println("\nPalavra secreta: " + palavraAdivinhada);
            System.out.println("Tentativas restantes: " + tentativas);
            desenhaBoneco(tentativas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            if (palavraSecreta.indexOf(letra) >= 0) {
                StringBuilder novaPalavraAdivinhada = new StringBuilder(palavraAdivinhada);
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == letra) {
                        novaPalavraAdivinhada.setCharAt(i, letra);
                    }
                }
                palavraAdivinhada = novaPalavraAdivinhada.toString();
                System.out.println("Boa! A letra está na palavra.");
            } else {
                tentativas--; // 
                System.out.println("Ops! A letra não está na palavra.");
            }

            if (palavraAdivinhada.equals(palavraSecreta)) {
                System.out.println("\nParabéns, você adivinhou a palavra secreta: " + palavraSecreta);
                jogoAtivo = false; // 
            }
        }

        if (tentativas == 0) {
            System.out.println("\nVocê perdeu! A palavra secreta era: " + palavraSecreta);
            desenhaBoneco(tentativas);
        }

        scanner.close();
    }

    public static void desenhaBoneco(int tentativas) {
        switch (tentativas) {
            case 6:
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                break;
            case 5:
                System.out.println("   _____");
                System.out.println("   |   |");
                System.out.println("   |   ");
                System.out.println("   |   ");
                System.out.println("   |   ");
                System.out.println("   |   ");
                break;
            case 4:
                System.out.println("   _____");
                System.out.println("   |   |");
                System.out.println("   |   O");
                System.out.println("   |   ");
                System.out.println("   |   ");
                System.out.println("   |   ");
                break;
            case 3:
                System.out.println("   _____");
                System.out.println("   |   |");
                System.out.println("   |   O");
                System.out.println("   |   |");
                System.out.println("   |   ");
                System.out.println("   |   ");
                break;
            case 2:
                System.out.println("   _____");
                System.out.println("   |   |");
                System.out.println("   |   O");
                System.out.println("   |  /|\\");
                System.out.println("   |   ");
                System.out.println("   |   ");
                break;
            case 1:
                System.out.println("   _____");
                System.out.println("   |   |");
                System.out.println("   |   O");
                System.out.println("   |  /|\\");
                System.out.println("   |  / ");
                System.out.println("   |   ");
                break;
            case 0:
                System.out.println("   _____");
                System.out.println("   |   |");
                System.out.println("   |   O");
                System.out.println("   |  /|\\");
                System.out.println("   |  / \\");
                System.out.println("   |   ");
                break;
        }
    }
}
