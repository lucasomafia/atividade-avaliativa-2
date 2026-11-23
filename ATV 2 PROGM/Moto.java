public class Moto extends Veiculo implements Inspecionavel{
    private int cilindradas;

    Moto(int cilindradas,String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status){
        super(placa, modelo, anoFabricacao ,valorDiaria, quilometragem, status);
        this.cilindradas = cilindradas;
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
    public void realizarInspecao() {
        System.out.println("o veiculo sera inspecionado");
    }

}
