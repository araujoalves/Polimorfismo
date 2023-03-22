import java.util.ArrayList;

class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void ligar();
}

class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, int quantidadePortas) {
        super(marca);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public void ligar() {
        // não precisa fazer nada
    }
}
