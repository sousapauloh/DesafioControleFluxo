import java.util.Scanner;

public class Contador extends ParametrosInvalidosException {
    public Contador(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            conta(parametroDois, parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());

        }
    }

}
