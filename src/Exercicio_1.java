void main(){
    String nome = IO.readln("Escreva seu nome: ");

    double nota1 = Double.parseDouble(IO.readln("Escreva sua primeira nota: "));
    double nota2 = Double.parseDouble(IO.readln("Escreva sua segunda nota: "));
    double nota3 = Double.parseDouble(IO.readln("Escreva sua terceira nota: "));

    double media = (nota1+nota2+nota3*2)/4;
    System.out.printf("A sua média foi %.2f.\n",media);

    if(media > 7) {
        IO.println("Você está aprovado.");
    } else {
        IO.println("Você está reprovado.");
    }
}
