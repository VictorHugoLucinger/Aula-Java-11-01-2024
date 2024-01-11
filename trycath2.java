import java.util.*;

public class trycath2 {
    public static void verificarIdade(short idade) {
        if (idade>= 18) {
        System.out.println("Acesso garantido.");
        } else {
            throw new ArithmeticException("Idade não permitida.");
        }
    }
    public static void main(String[] args) {
        Scanner scnInput = new Scanner(System.in);
        Scanner scnSair = new Scanner(System.in);
        boolean deuRuim = false;
        try {
            System.out.println("Digite sua idade");
            Short idadeDigitada = scnInput.nextShort();
            verificarIdade(idadeDigitada);
            scnInput.close();
        } catch (Exception e) {
            System.err.println("opss! Ocorreu o erro " + e);
            System.err.println(e.getMessage() + "Precione enter para continuar...");
            scnSair.nextLine();
            scnSair.close();
        }
        finally {
            if (deuRuim == true) {
                System.out.println("Reinicie o sistema!");
            } else {
                System.out.println("Ok! Zerou o jogo...");
            }
        }
    }
}
