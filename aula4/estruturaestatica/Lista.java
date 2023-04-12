package estruturaestatica;

public class Lista<T> extends EstruturaEstatica<T> {
    //metodo Contrutor com parametros o super e porque esta herdando...

    public Lista(int capacidade){
        super(capacidade);
    }

    //metodo Construtor sem parametros
    public Lista(){
        super();
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao,elemento);
    }
    
}
