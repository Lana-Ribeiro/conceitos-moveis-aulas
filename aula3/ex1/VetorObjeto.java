package ex1;
import java.util.Arrays;

public class VetorObjeto {

    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;

    }

    public void adiciona(Object elemento) throws Exception{
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor ja está cheio!!");
        }
    }
    private void aumentaCapacidade() {
    }

    public int tamanho(){
        return this.tamanho;
    }


    
}
