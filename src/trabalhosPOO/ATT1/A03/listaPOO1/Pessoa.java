package trabalhosPOO.ATT1.A03.listaPOO1;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        if (idade < 21) altura += 0.5;
        idade++;
    }

    public void engordar(double p) {
        peso += p;
    }

    public void emagrecer(double p) {
        peso -= p;
    }

    public void crescer(double a) {
        altura += a;
    }
}
