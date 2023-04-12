package ex1;
public class Teste {

    public static void main(String[] args) {
        
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("fulano","32414", "fulano22@gmail.com");
        Contato c2 = new Contato("fulano","32414", "fulano12@gmail.com" );
        Contato c3 = new Contato("fulano","32414", "fulano72@gmail.com" );

        try {
                vetor.adiciona(c1);
                vetor.adiciona(c2);
                vetor.adiciona(c3);
        } catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("Tamanho do vetor: "+vetor.tamanho());

        System.out.println(vetor);















    }
    
}
