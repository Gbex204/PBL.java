import java.util.Scanner; // Importação da biblioteca Scanner para o programa receber input's
class PBL1{ // Criação da classe PBL1, onde o código será executado.
    public static void print(String param_mensagem){
        System.out.print(param_mensagem);
    }

    public static void println(String param_mensagem){
        System.out.println(param_mensagem);
    }
    public static void main(String[] args){ // Método main com propriedades 'public' (para ser executado fora da classe) e 'static' (para ser executado sem precisar ser um objeto instânciado).
        Scanner teclado = new Scanner(System.in); // System.in é o comando que faz a leitura do input do teclado do usuário, passado como parâmetro para um objeto 'teclado' do tipo Scanner.

        print("Digite o valor do primeiro termo da PA: ");
        float a_1 = teclado.nextFloat(); // A variável mensagem do tipo String recebe a próxima linha de input's (antes do usuário pressionar ENTER) recebidos pelo objeto.

        print("Digite a razão da PA: ");
        float r = teclado.nextFloat();

        print("Digite o número de termos da PA: ");
        int n = teclado.nextInt();

        double a_n = a_1 + (n-1) * r;
        println("Ultimo valor da PA: " + a_n);

        double S_n = (a_1 + a_n) * n / 2;
        println("Soma de todos os termos da PA: " + S_n);
    }
}