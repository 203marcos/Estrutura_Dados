public class Main {
    public static void main(String[] args) {
        FilaEstaticaCircular fila = new FilaEstaticaCircular();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        fila.enqueue(7);
        fila.enqueue(8);
        fila.enqueue(9);
        fila.enqueue(10);
        fila.show();



        fila.dequeue();//1
        fila.show();

        fila.dequeue();//2
        fila.show();

        fila.enqueue(11);
        fila.enqueue(12);
        fila.show();
    }
}