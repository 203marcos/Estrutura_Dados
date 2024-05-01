public class FilaDinamica {
    No primeiro;
    No ultimo;

    int contador = 0;
    public FilaDinamica (){
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void enqueue  (int elemento){
        No novo = new No(elemento);

        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else{
            ultimo.proximo = novo;
            ultimo = novo;
        }
        contador++;
    }

    public int dequeue (){
        int aux = primeiro.dado;
        primeiro = primeiro.proximo;
        contador --;
        return aux;
    }

    public boolean empty (){
        return contador == 0;
    }

    public int peek (){
        if(primeiro == null){
            System.out.print("ESTA VAZIO ");
            return -1;
        }
        return primeiro.dado;
    }

    public int tamanho (){
        return contador;
    }

    public void show (){
        No aux = primeiro;

        while (aux != null){
            if(aux == ultimo){
                System.out.print(aux.dado);
                aux = aux.proximo;
            }else {
                System.out.print(aux.dado + ", ");
                aux = aux.proximo;
            }
        }

        System.out.println();

    }


}
