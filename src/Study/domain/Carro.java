package Study.domain;

import java.util.Comparator;

public class Carro {
    private String placa, marca, cor, modelo;
    private double valor;
    private boolean disponivel;

    public Carro(String placa, String marca, String cor, String modelo, double valor, boolean disponivel) {
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valor=" + valor +
                ", disponivel=" + disponivel +
                '}';
    }

    public static class CarroValorCompare implements Comparator<Carro> {
        @Override
        public int compare(Carro o1, Carro o2) {
            return (int) (o1.getValor() - o2.getValor());
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
