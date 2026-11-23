public class Van extends Veiculo implements Inspecionavel,Avaliavel{
    private int numPassageiros;

    Van(int numPassageiros,String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status){
        super(placa, modelo, anoFabricacao ,valorDiaria, quilometragem, status);
        this.numPassageiros = numPassageiros;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println();
    }
    @Override
    public boolean possuiSeguroEspecial() {
        return false;
    }
    @Override
    public void realizarInspecao() {
        System.out.println("o veiculo sera inspecionado");
    }
    @Override
    public void avaliar(int nota) {
        System.out.println("voce avaliou o carro como nota: " + nota);
    }
}
