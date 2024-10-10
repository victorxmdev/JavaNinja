package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
         * Dados primitivos: int, double, float, char, boolean
         * Objeto da aula: Criar um ninja - Naruto -
         * */

        int idade = 17; // Valor maximo:2147483647
        double altura = 1.64;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 20137383647L; // Valor maximo: 9,223,372,036,854,775,807


        System.out.println("A idade do Naruto é:" + idade); // Comando para mostrar para o usuario
        System.out.println("A altura do Naruto é: " + altura);
        System.out.println("O saldo bancario do Naruto é = " + saldoBancario);
        System.out.println("A inicial do Naruto é: " + inicial);
        System.out.println("O naruto está vivo? " + vivoOuMorto);
    }
}
