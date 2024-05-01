public class PilhaDinamica {
    No primeiro;
    No ultimo;

    int contador = 0;
    public PilhaDinamica (){
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    public void push (int elemento){
        No novo = new No(elemento);

        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else{
            novo.proximo = primeiro;
            primeiro = novo;
        }
        contador++;
    }

    public int pop (){
        int aux = primeiro.dado;
        primeiro = primeiro.proximo;
        contador --;
        return aux;
    }

    public boolean empty (){
        if(contador == 0){
            return true;
        }
        return false;
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
