package aula1;
import java.util.Scanner;

public class ex1{
    

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    double media,soma;
    int dias_acima, dias_abaixo;
    soma=0;
    double temperatura[]= new double[7];
 

    for(int i=0;i < 7 ;i++){

        System.out.print("Digite a temperatura: ");
        temperatura[i]= sc.nextDouble();
        soma += temperatura[i];
  
    }

    media = soma/7;
    dias_acima=0;
    dias_abaixo=0;

    for(int i=0;i<7;i++){
      if(temperatura[i]>media){
        dias_acima += +1;
      }
      if(temperatura[i]<media){
        dias_abaixo+= +1;
      }
    }

    System.out.println("A media das temperaturas é: "+media);
    System.out.println("\nA quantidade de dias acima da média é: "+dias_acima);
    System.out.println("\n Dias abaixo da media é: "+dias_abaixo);

}
}

