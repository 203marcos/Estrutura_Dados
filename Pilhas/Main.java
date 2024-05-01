public class Main {
    public static void main(String[] args) {
        PilhaEstatica pilha = new PilhaEstatica();

        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        pilha.show();

        System.out.println("SAIU O ELEMENTO: "+ pilha.pop());
        System.out.println("SAIU O ELEMENTO: "+ pilha.pop());
        System.out.println("SAIU O ELEMENTO: "+ pilha.pop());

        System.out.println(pilha.peek());


    }
}