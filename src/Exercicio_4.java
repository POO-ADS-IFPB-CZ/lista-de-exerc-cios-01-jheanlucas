void main(){
    int[] numeros = new int[5];

    numeros[0] = Integer.parseInt(IO.readln("Digite um número inteiro positivo:"));
    numeros[1] = Integer.parseInt(IO.readln("Digite um número inteiro positivo:"));
    numeros[2] = Integer.parseInt(IO.readln("Digite um número inteiro positivo:"));
    numeros[3] = Integer.parseInt(IO.readln("Digite um número inteiro positivo:"));
    numeros[4] = Integer.parseInt(IO.readln("Digite um número inteiro positivo:"));

    for(int valor : numeros) {
        for(int i=0;i<valor;i++) {
            IO.print("*");
        }
        IO.println("");
    }
}