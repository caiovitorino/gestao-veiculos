public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, double valorDiaria, int quantidadePortas) {
        super(marca, modelo, ano, valorDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("   └─ Tipo: Carro | Portas: " + quantidadePortas);
    }


    @Override
    public double calcularValorDiaria(int dias) {
        double taxaAdicionalPortas = (quantidadePortas > 2) ? 15.0 : 0.0;
        return super.calcularValorDiaria(dias) + (taxaAdicionalPortas * dias);
    }
}
