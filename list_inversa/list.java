public class list {

    public node head;
    public node last;

    public void add(int data){
        node aux = new node(data);
        if(head == null){
            head = aux;
            last = head;
        }else{
            last.next = aux;
            last = aux;
        }
    }

    public void display(){
        if(head != null){
            node aux = head;
            while (aux != null){
                System.out.print(aux.data + " ");
                aux = aux.next;
            }
            System.out.println();
        }else{
            System.out.println("List is empty");
        }
    }

    public void inverseDisplay(node aux){
        if(aux == null){
            return;
        }
        inverseDisplay(aux.next);
        System.out.print(aux.data + " ");
    }

    public void printInverse (){
        inverseDisplay(head);
        System.out.println();
    }

    public void inverseList (){
        node next = null;
        node current = head;
        node prev = null;

        if(current != null){
            /*
                A--->B--->NULL
                while(current == NULL)
                    next = current.next //apenas armazenar (B)
                    current.next = prev //trocando o ponteiro A(A)--->C(NULL)
                    prev = current // C:=A,      A(A)-----C(A)
                    current = next // A:=B,     A(B)---->C(A)

             */
            while (current != null){
                next = current.next; //B
                current.next = prev;// A --- X
                prev = current; // A ---- A
                current = next; // B ---- A
            }
            head = prev;
        }
    }


}
