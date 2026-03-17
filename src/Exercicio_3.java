boolean eh_primo(int numero) {
    for(int i=2;i<=numero/2;i++) {
        if(numero%i == 0) {
            return false;
        }
    }
    return true;
}

void main(){
    int numero = Integer.parseInt(IO.readln("Digite um número inteiro positivo:"));

    for(int i=2;i<=numero;i++) {
        if(eh_primo(i)){
            System.out.printf("%d, ",i);
        }
    }
}