class Moto extends Veiculo {
    private int quantidadeCilindradas;

    public Moto(String marca, int quantidadeCilindradas) {
        super(marca);
        this.quantidadeCilindradas = quantidadeCilindradas;
    }

    public int getQuantidadeCilindradas() {
        return quantidadeCilindradas;
    }

    @Override
    public void ligar() {
        // não precisa fazer nada
    }
}

