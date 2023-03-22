class Estacionamento {
    private ArrayList<Veiculo> veiculos;

    public Estacionamento() {
        veiculos = new ArrayList<Veiculo>();
    }

    public boolean estacionar(Veiculo veiculo) {
        return veiculos.add(veiculo);
    }

    public boolean estacionarMoto(Moto moto) {
        return veiculos.add(moto);
    }
}
