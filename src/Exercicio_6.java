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