public class FilaEstatica {

    int [] vetor;

    int capacidade = 10;

    int inicio;
    int fim;

    int contador;


    public FilaEstatica (){
        vetor = new int [capacidade];
        inicio = 0;
        fim = -1;
        contador = 0;
    }

    public FilaEstatica (int n){
        vetor = new int [n];
        inicio = 0;
        fim = -1;
        contador = 0;
    }


    public void enqueue (int elemento){
        fim++;
        vetor [fim] = elemento;
        contador++;
    }

    public int dequeue (){
        int aux = vetor [inicio];
        inicio++;
        contador--;

        return aux;
    }


    public boolean empty (){
        return contador == 0;
    }

    public void primeiroElemento (){
        System.out.println(inicio);
    }

    public int tamanho (){
        return contador;
    }

    public void show (){
        for(int i = inicio; i <= fim; i++){
            if(i == fim){
                System.out.println(vetor [i]);
            }else {
                System.out.print(vetor[i] + ", ");
            }
        }
    }

}
