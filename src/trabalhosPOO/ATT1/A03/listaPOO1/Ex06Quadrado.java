package trabalhosPOO.ATT1.A03.listaPOO1;

public class Ex06Quadrado {
    private double lado;

    public Ex06Quadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
