package Study.domain;

public class Node {
    private Agencia agencia;
    private Node proximo;

    public Node(Agencia agenciaLoja){
        this.agencia = agenciaLoja;
        proximo = null;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
