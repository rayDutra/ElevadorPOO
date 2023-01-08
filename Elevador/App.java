import java.util.Scanner;

public class ElevadorInterativo{
    
    public void main(String[] args){
      Scanner s = new Scanner(System.in);
      int elevadorAndares = Integer.parseInt(s.nextLine());

      Elevador elevador = new Elavador (elevadorAndares);

      while (true){
       String menu =
       "0- Sair"
       "1- Destino"
       "2-Andar Atual"

       System.out.println(menu);

       int comando = Integer.parseInt(s.nextLine());

       if(comando == 1){
        int andarDestino = Integer.parseInt(s.nextLine());

        int [] andares;
        andares= elevador.irPara (andarDestino);

        for(int i=0; i<andares.length; i++)
          System.out.println("=>" + andares[i]);
       }else if (comando ==2){
        System.out.println(elevador.getAndarAtual());
       }else{
        break;
       }

      }

    }
}