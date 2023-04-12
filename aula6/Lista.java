public class Lista {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        System.out.println("Tamanho da Lista: "+lista.getTamanho());

        lista.adiciona("Rodrigo");
        lista.adiciona("Alvaro");
        lista.adiciona("Pedro");
        lista.adiciona("Kule");


        
        System.out.println("\nTamanho da lista: "+lista.getTamanho());
        System.out.println("\nInicio da Lista: "+lista.getinicio().getElemento());
        System.out.println("\nFim da Lista: "+lista.getFim().getElemento());
        System.out.println("\nElemento na posicao 2: "+lista.get(2).getElemento());
        System.out.println(lista);

        lista.remover("Pedro");
          
        System.out.println("\nTamanho da lista: "+lista.getTamanho());
        System.out.println("\nInicio da Lista: "+lista.getinicio().getElemento());
        System.out.println("\nFim da Lista: "+lista.getFim().getElemento());
        System.out.println(lista);


    }

    
    
}
