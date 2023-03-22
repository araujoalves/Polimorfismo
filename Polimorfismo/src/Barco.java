class Barco extends Veiculo {
    private int potenciaMotor;

    public Barco(String marca, int potenciaMotor) {
        super(marca);
        this.potenciaMotor = potenciaMotor;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    @Override
    public void ligar() {
        // não precisa fazer nada
    }
}

