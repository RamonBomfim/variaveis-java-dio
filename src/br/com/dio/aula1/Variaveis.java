package br.com.dio.aula1;

// Criando e explorando as possibilidades de criação de variáveis
public class Variaveis {
    public static void main(String[] args) {
        int i;
        // int i; ---> Não se pode criar variáveis com o mesmo nome
        int I; // Java é case sensitive
        // int 1a; ---> Não devemos iniciar variáveis com números
        int _1a; // Apesar de não apresentar erro de compilação, seguindo as boas práticas, não devemos iniciar nomes de variáveis com _
        int $1a; // Bem como, seguindo as boas práticas, também não é indicado iniciar variáveis com $

        i = 5;
        I = 10;
        _1a = 20;
        $1a = 7;

        final int j = 10; // Ao inicializar com a palavra 'final' indicamos que ali é uma constante
        // j = 15; ---> Ao tentar alterar o valor de j, será apresentado um erro, pois trata-se de uma constante
        int asrn24678md; // Apesar de estranho, é uma notação válida para nomear variáveis
        // int asrn246 78md; ---> Não pode conter espaços vazios no nome da variável
        int asrn2$4678_md = 10; // Variável válida, porém é preciso atentar-se as boas práticas quanto ao uso do $ e _
        // int asrn2$46%78_md = 10; --> % faz parte dos caracteres reservados da linguagem, portanto, não podemos usar na criação de variáveis


        asrn24678md = 100;

        int quantidadeProduto = 50; // Padrão camel case
        // int QuantidadeProduto; --> Não segue os padrões de boas práticas, pois esta iniciando com letra maiúscula
        final int NUMERO_TENTATIVAS = 5; // Letras maiúsculas e separação por _, são boas práticas para constantes
        // final int numeroTentativas = 5; --> Não segue as boas práticas para constantes
        int QUANTIDADE_OPCOES = 25; // Segue as boas práticas para constantes, porém não foi inicializado com 'final', logo, não é uma constante
        // int qtdProd; --> Explicito é melhor do que implicito

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($1a);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}
