Questão 5:

import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número decimal: ");
    double numero = sc.nextDouble();

    System.out.printf("Valor digitado: %.2f\n", numero);

    sc.close();
}

/*
Funcionamento:

- Scanner:
  O Scanner serve para ler dados do teclado.
  "new Scanner(System.in)" conecta o programa com a entrada padrão (teclado).
  O método "nextDouble()" lê um número decimal digitado pelo usuário.

- System.out.printf:
  O printf permite formatar a saída.
  "%.2f" significa que o número será exibido com 2 casas decimais:
      %  -> indica formatação
      .2 -> quantidade de casas decimais
      f  -> tipo float ou double

Exemplo:
Entrada: 5.6789
Saída: Valor digitado: 5.68
*/

Questão 6: 

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}

/*
Erros no código original:

1. Assinatura incorreta do main:
   Foi usado "String args" ao invés de "String[] args".

2. Falta de ponto e vírgula:
   A linha do println não tinha ";" no final.

3. Loop infinito:
   O contador não era incrementado dentro do while.

4. Scanner não utilizado:
   Foi declarado, mas nunca foi usado no código.
*/
