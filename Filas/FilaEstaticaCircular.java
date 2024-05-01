public class FilaEstaticaCircular {
    int [] vetor;
    int contador;
    int inicio;
    int fim;


    public FilaEstaticaCircular() {
        vetor = new int[10];
        contador = 0;
        fim = -1;
        inicio = 0;
    }

    public FilaEstaticaCircular(int n) {
        vetor = new int[n];
        contador = 0;
        fim = -1;
        inicio = 0;
    }

    public void enqueue(int elemento) {
        if (contador < vetor.length) {
            if(fim != vetor.length-1){
                fim++;
                vetor[fim] = elemento;
                contador++;
            }else{
                fim = 0;
                vetor [fim] = elemento;
                contador++;
            }
        } else {
            System.out.println("A fila está cheia. Não é possível adicionar mais elementos.");
        }
    }

    public int dequeue() {
        if (!empty()) {
            if(inicio != vetor.length) {
                int aux = vetor[inicio];
                inicio++;
                contador--;
                return aux;
            }else{
                inicio = 0;
                int aux = vetor[inicio];
                contador --;
                return aux;
            }
        } else {
            System.out.println("A fila está vazia. Não há elementos para remover.");
            return -1;
        }
    }

    public boolean empty() {
        return contador == 0;
    }

    public void primeiro (){
        System.out.println(vetor[inicio]);
    }
    public boolean estaCheia() {
        return contador == vetor.length;
    }

    public void destruir() {
        vetor = new int[vetor.length]; // Cria um novo vetor com o tamanho original
        contador = 0; // Reinicializa o contador para zero
        fim = 0;
        inicio = 0;
    }

    public int tamanho() {
        return contador;
    }

    public void show() {
        if(contador != 0) {
            if (inicio <= fim) {
                for (int i = inicio; i <= fim; i++) {
                    if(i == fim){
                        System.out.println(vetor [i]);
                    }else {
                        System.out.print(vetor[i] + ", ");
                    }
                }
            } else { //MODO CIRCULAR
                if (fim != -1) {
                    for (int i = inicio; i < vetor.length; i++) {
                        System.out.print(vetor[i] + ", ");
                    }

                    for (int i = 0; i < fim; i++) {
                        System.out.print(vetor[i] + ", ");
                    }
                    System.out.print(vetor [fim]);
                }
            }
        }else{
            System.out.println("ESTA VAZIO O VETOR");
        }
    }



}