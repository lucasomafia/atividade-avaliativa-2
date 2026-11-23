public class Carro extends Veiculo implements Avaliavel{
    private int quantidadePortas;

    Carro(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status,int quantidadePortas){
        super(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public boolean possuiSeguroEspecial() {
        return false;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println();
    }
    @Override
    public void avaliar(int nota) {
        System.out.println("voce avaliou o carro como nota: " + nota);
    }

}

