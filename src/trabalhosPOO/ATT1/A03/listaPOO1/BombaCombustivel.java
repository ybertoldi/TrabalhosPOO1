package trabalhosPOO.ATT1.A03.listaPOO1;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double qtdCombustivel;

    public BombaCombustivel(String tipo, double valor, double qtd) {
        this.tipoCombustivel = tipo;
        this.valorLitro = valor;
        this.qtdCombustivel = qtd;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros > qtdCombustivel) {
            System.out.println("Combustível insuficiente.");
        } else {
            qtdCombustivel -= litros;
            System.out.println("Litros abastecidos: " + litros);
        }
    }

    public void abastecerPorLitro(double litros) {
        double valor = litros * valorLitro;
        if (litros > qtdCombustivel) {
            System.out.println("Combustível insuficiente.");
        } else {
            qtdCombustivel -= litros;
            System.out.println("Valor a pagar: R$ " + valor);
        }
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoTipo) {
        this.tipoCombustivel = novoTipo;
    }

    public void alterarQuantidadeCombustivel(double novaQtd) {
        this.qtdCombustivel = novaQtd;
    }
}
