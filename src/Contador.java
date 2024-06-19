import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parametro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo90 parametro");
        int parametroDois = sc.nextInt();

        sc.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidoException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroUm > parametroDois)
            throw new ParametroInvalidoException();

        int contagem = parametroDois - parametroUm;

        for (int cont = 0; cont < contagem; cont++) {
            System.out.println(cont);
        }
    }
}