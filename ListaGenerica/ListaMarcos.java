public class ListaMarcos <T> {
    public int tamanho = 10;
    public int cont;
    public Object[] elementos;

    public ListaMarcos(){
        this.elementos = new Object[10];
        this.cont = 0;
    }

    public ListaMarcos(int n){
        this.elementos = new Object[n];
    }

    public void add (int elemento){
        elementos [cont] = elemento;
        cont++;
    }

    public T retorna (int n){
        return (T) elementos [n];
    }

    public void retornaTodos (){
        for(int i=0;i<cont;i++){
            System.out.println(retorna(i));
        }
    }

    public int size (){
        return cont-1;
    }

    public void add(int posicao, T elemento){
        Object aux = elementos[posicao];
        elementos[posicao] = elemento;
        Object aux2;
        cont++;
        for(int i=posicao+1;i<cont;i++){
            aux2 = elementos [i];
            elementos[i] = aux;
            aux = aux2;

        }

    }

    public void aumentaTamanho(){
        int novaCapacidade = tamanho * 2;
        Object vetorNovo = new Object[novaCapacidade];

    }



}