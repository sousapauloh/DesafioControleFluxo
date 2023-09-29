public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    static void conta(int contagem, int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        // realizar o for para imprimir os números com base na variável contagem
        for (contagem = (parametroUm+1) ; contagem <= parametroDois; contagem++) {
            System.out.println("Imprimindo o número " + contagem);
        }
    }
}
