public class PilhaEstatica {

    int [] vetor ;

    int capacidade = 10;

    int contador = 0;



    public PilhaEstatica (){
        vetor = new int[capacidade];
        contador = 0;
    }

    public PilhaEstatica (int n){
        vetor = new int[n];
        contador = 0;
    }

    public void push (int elemento){
        vetor [contador] = elemento;
        contador++;
    }

    public int pop (){
         int aux = vetor [contador - 1];
         contador--;
         return aux;
    }

    public boolean empty (){
        if(contador == 0){
            return false;
        }
        return true;
    }

    public int peek (){ //ou topo
        if(contador == 0){
            System.out.print("ESTA VAZIO ");
            return -1;
        }

        return vetor [contador - 1];
    }

    public int tamanho (){
        return contador;
    }

    public void show (){
        for(int i = 0; i < contador; i++){
            if(i == contador - 1){
                System.out.println(vetor [i]);
            }else {
                System.out.print(vetor[i] + ", ");
            }
        }
    }


}
