package Study.domain;

public class ClienteReserva extends  Cliente{
    String nome, telefone, endereco, carroDesejado;

    public ClienteReserva(String nome, String telefone, String endereco, String carroDesejado) {
        super(nome, telefone, endereco);
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.carroDesejado = carroDesejado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", carroDesejado='" + carroDesejado + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getCarroDesejado() { return carroDesejado; }

    public void setCarroDesejado(String carroDesejado) { this.carroDesejado = carroDesejado; }
}
