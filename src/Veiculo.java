public class Veiculo {
    boolean ligado;
    int ano;
    String marca;
    double kmRodados;
    double consumo;
    double tanqueAtual;


    public void ligar(){
        System.out.println(" carro ligado");
        ligado = true;
    }
    public void desligar(){
        System.out.println(" carro desligado");
        ligado = false;
    }

    public void viajar( double distancia){
        System.out.println("estou gasttando gasolina");

        double litrosGastos = distancia / consumo;
    }

    public void revisao(){
        consumo = consumo + consumo * 0.10;

    }

}
