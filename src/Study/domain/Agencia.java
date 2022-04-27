package Study.domain;

import java.util.Arrays;

public class Agencia {
    String nome;
    Carro[] carro;
    ClienteReserva[] clienteReserva;
    Evento[] evento;

    public Agencia(String nome, Carro[] carro, ClienteReserva[] clienteReserva, Evento[] evento) {
        this.nome = nome;
        this.carro = carro;
        this.clienteReserva = clienteReserva;
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "nome='" + nome + '\'' +
                ", carro=" + Arrays.toString(carro) +
                ", clienteReserva=" + Arrays.toString(clienteReserva) +
                ", evento=" + Arrays.toString(evento) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro[] getCarro() {
        return carro;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }

    public ClienteReserva[] getClienteReserva() {
        return clienteReserva;
    }

    public void setClienteReserva(ClienteReserva[] clienteReserva) { this.clienteReserva = clienteReserva; }

    public Evento[] getEvento() {
        return evento;
    }

    public void setEvento(Evento[] evento) {
        this.evento = evento;
    }
}
