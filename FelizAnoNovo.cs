namespace Mensagens {
    class FelizAnoNovo {
        /**
        * Exibe mensagem de feliz ano novo na Console.WriteLine.
        * Autor: Eladio Júnior (https://github.com/eladiojunior/mensagens)
        */
        static void Main(string[] args) {
            Console.WriteLine("Galera, Feliz " + (DateTime.Now().getYear() + 1)+ "!!!\n\r"+
            "Muita saúde, paz e muita codificação neste novo ano.");
        }
    }
}