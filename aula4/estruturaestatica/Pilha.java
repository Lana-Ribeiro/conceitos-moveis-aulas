package estruturaestatica;

public class Pilha <T> extends EstruturaEstatica<T>{

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha (T elemento){
        // reutilizando o codigo pai
        super.adiciona(elemento);
    }
    
}
