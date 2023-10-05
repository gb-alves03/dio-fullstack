package fluxControl;
public class Contador {

    public static void contar(int firstParameter, int secondParameter) throws ParametrosInvalidosException {
        if (firstParameter > secondParameter) {
            throw new ParametrosInvalidosException();
        }
        int contagem = secondParameter - firstParameter;

        for(int i = 1; i < contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
