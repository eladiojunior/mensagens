import java.util.Calendar;
public class FelizAnoNovo {
    /**
     * Exibe mensagem de feliz ano novo na sysout (console).
     * Autor: Eladio Júnior (https://github.com/eladiojunior/mensagens)
     * @param agrs - Váriavel para passagem de parâmetros de entrada.
     */
    public static void main(String[] agrs) {
        System.out.println("Galera, Feliz " + (Calendar.getInstance().get(Calendar.YEAR) + 1)+ "!!!\n\r"+
        "Muita saúde, paz e muita codificação neste novo ano.");
    }
}