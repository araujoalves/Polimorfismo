public class Peixe extends Animal {
    private String nome;

    public Peixe() {
        super();
        this.nome = "Sem nome";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void caminha() {
        System.out.println("Peixe nadando");
    }

    public void come() {
        System.out.println("Peixe comendo");
    }

    public void brinca() {
        System.out.println("Peixe brincando");
    }
}
