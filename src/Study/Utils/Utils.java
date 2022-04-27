package Study.Utils;
import Study.domain.Carro;
import Study.domain.Evento;
import java.util.Arrays;
import java.util.Stack;

public class Utils {

    public static void ordenaValor(Carro[] carros){

        Arrays.sort(carros, new Carro.CarroValorCompare());

        System.out.println(" ");

        System.out.println("FIFTY CARS");
        System.out.println("Confira nossos modelos por ordem de valor crescente:");
        System.out.println(" ");

        for (int i = 0; i < carros.length; i++) {
            if (carros[i].isDisponivel()) {
                System.out.println("Modelo " + (i + 1));
            } else {
                System.out.println("Modelo " + (i + 1) + " *** não disponível ***");
            }
            System.out.print("Marca: " + carros[i].getMarca() + "     ");
            System.out.print("Modelo: " + carros[i].getModelo() + "     ");
            System.out.println("Cor: " + carros[i].getCor());
            System.out.print("Placa: " + carros[i].getPlaca() + "      ");
            System.out.println("Valor da Diária: R$" + carros[i].getValor());
            System.out.println(" ");
        }
    }

    public static Stack<Evento> eventoLog = new Stack<>();
}
