import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        List<String> usserLogged = new ArrayList<>();
        int userLimit = 2;
        Scanner scnInput = new Scanner(System.in);
        String usuario;
        try {
            while (usserLogged.size() < userLimit) {
                System.out.println("Digite um nome de usuario ou tecla enter para gerar um nome de usuario aleatorio");
                usuario = scnInput.nextLine();
                if (usuario != "") {
                    usserLogged.add(usuario);
                } else {
                    usserLogged.add("user" + Math.random());
                }
                Thread.sleep(1000);
            }
            System.out.println("Limite de usúarios atigindo");
            for (int i = 0; i < userLimit; i++) {
                System.out.println(i+1 +"° usuário [ " + usserLogged.get(i) + " ] ");
            }
        } catch (Exception e) {
            System.out.println("Opps! Ocorreu o erro " + e.getMessage());
        }
        scnInput.close();
    }
}
