import java.util.*;

public class trycatch2 {
    public static void filmeAcabou(){
            throw new ArithmeticException("Obrigado por vir aqui no cinema Victor.");
    }

public static void main(String[] args) {
    int tempoTotal = 2;
    int minutoContado = 0;
    int segundoContado = 0;
    boolean bug = false;
    while (minutoContado <= tempoTotal) {
        try {
            System.out.println("Assistindo filme. Se passaram " + minutoContado + "minuto(s) e " + segundoContado + " sgundo(s)");
            Thread.sleep(1);
            segundoContado++;
            if (segundoContado == 60) {
                minutoContado++;
                segundoContado = 0;
            }
        } catch (Exception e) {
            bug = true;
        }
        finally {
            if (bug == true) {
                System.out.println("Ocorreu um problema, renicie o sistema.");
            } else {
                if (minutoContado == tempoTotal) {
                    filmeAcabou();
                } else {
                    System.out.println("Opps! ocorreu um bug.");
                }
            }
        }
    }
}
}