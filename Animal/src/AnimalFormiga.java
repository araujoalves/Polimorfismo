 class Animal {
    protected int pernas;

    public Animal() {
        this.pernas = 0;
    }

    public abstract void caminha();
    public abstract void come();
}

public class Formiga extends Animal {
    public Formiga() {
        super();
    }

    public void caminha() {
        System.out.println("Formiga andando com suas " + pernas + " pernas");
    }

    public void come() {
        System.out.println("Formiga comendo");
    }
}
