public class Celular {
    String marca;
    String modelo;
    String ano;
     double porcentagemBateria ;


     public void tirarFoto(){
         porcentagemBateria -= 10;
     }
     public void recarregar(){
         porcentagemBateria = 100;

     }

     public void aplicativo(String nome){
         if (nome.equals("whatsapp")) {
             porcentagemBateria -= 45;
         } else {

             porcentagemBateria -= 5;
         }

     }


}
