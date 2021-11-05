package section10;

public class Pensionato {

    private String nome;
    private String email;
    private int number;

    public Pensionato(String nome, String email, int number) {
        this.nome = nome;
        this.email = email;
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return number
                + ": "
                + nome
                + ", "
                + email;

}}
