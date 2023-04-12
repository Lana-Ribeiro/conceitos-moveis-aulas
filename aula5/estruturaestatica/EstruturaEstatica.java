package estruturaestatica;

public class EstruturaEstatica<T>{
    
    public T[] elemementos;
    public int tamanho;

    //metodo construtor com parametros

    public EstruturaEstatica(int capacidade){
        this.elemementos = (T[]) new Object[capacidade];
        this.tamanho=0;
    }

    //metodo Construtor sem parametro

    public EstruturaEstatica(){
        this(10);
    }

    //metodo para add elementos

    public boolean adiciona(T elementos){
        this.aumentaCapacidade();
            if(this.tamanho < this.elemementos.length){
                this.elemementos[this.tamanho] = elementos;
                this.tamanho++;
                return true;
            }
            return false;
    }

    // metodo adicionar qualquer posiçao

    public boolean adiciona(int posicao, T elemento){
        if(!(posicao >=0 && posicao <tamanho)){
            throw new  IllegalAccessError("Posição Inválida!!");
        }
        this.aumentaCapacidade();
            for(int i=this.tamanho-1; i<=posicao; i--){
                this.elemementos[i+1]= this.elemementos[i];
            }
            this.elemementos[posicao] = elemento;
            this.tamanho++;


            return true;
    }

// metodo aumenta capacidade
    public void aumentaCapacidade(){
        if(this.tamanho == this.elemementos.length){
            T[] elementosNovos = (T[]) new Object[this.elemementos.length * 2];
                for(int i =0; i<this.elemementos.length;i++){
                    elementosNovos[i] = this.elemementos[i];
                }
                this.elemementos = elementosNovos;
        }
    }

    public T espiar(){
        if(this.estaVazia()){
            return null;
        }
        return this.elemementos[0];
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){
            StringBuilder s = new StringBuilder();
            s.append("[");

            for(int i  =0; i<this.tamanho-1; i++){
                s.append(this.elemementos[i]);
                s.append(",");
            }
            if (this.tamanho > 0 ){
                s.append(this.elemementos[this.tamanho-1]);
            }

            s.append("]");
            return s.toString();
    }
    public boolean estaVazia(){
        return this.tamanho==0;
    }

    public void remove(int posicao){
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessError("Posicao invalida!");
        }
        for(int i = posicao; i <tamanho-1;i++){
            elemementos[i]= elemementos[i+1];
        }
        tamanho--;
    }



}