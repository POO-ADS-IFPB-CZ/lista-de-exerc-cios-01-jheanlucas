void main(){
    int numero = Integer.parseInt(IO.readln("Digite um número:"));

    if(numero%5 == 0 && numero%3 == 0) {
        IO.println("É multiplo de ambos.");
    } else if(numero%5 == 0) {
        IO.println("multiplo de 5.");
    } else if(numero%3 == 0) {
        IO.println("É multiplo de 3.");
    } else {
        IO.println("Não é múltiplo de 3 nem de 5.");
    }
}