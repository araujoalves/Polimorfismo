public class Cachorro extends Animal {
    private String nome;

    public Cachorro() {
        super();
        this.nome = "Sem nome";
    }

    public Cachorro(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void caminha() {
        System.out.println("Cachorro andando com suas " + pernas + " pernas");
    }

    public void come() {
        System.out.println("Cachorro comendo");
    }

    public void brinca() {
        System.out.println("Cachorro brincando");
    }
}
