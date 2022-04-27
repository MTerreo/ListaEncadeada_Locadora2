package Study.domain;

public class ListaEncadeada {
    private Node primeiro, ultimo;

    public ListaEncadeada(){
        primeiro = null;
        ultimo = null;
    }

    public boolean listaVazia(){
        //return primeiro == null ? true : false;
        if(this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }

    public void inserirInicio(Agencia elemento) {
        Node newNode = new Node(elemento);
        if(listaVazia()){
            this.ultimo = newNode;
        } else {
            newNode.setProximo(this.primeiro);
        }
        this.primeiro = newNode;
    }

    public void inserirFinal(Agencia elemento) {
        Node newNode = new Node(elemento);
        if(listaVazia())
            this.primeiro = newNode;
        else
            this.ultimo.setProximo(newNode);
        this.ultimo = newNode;
    }

    public void remover(Agencia elemento){
        Node noTemp = this.primeiro;
        Node noAnt = null;
        if (primeiro.getAgencia().equals(elemento)){
            primeiro = primeiro.getProximo();
        } else {
            while ((noTemp != null) && (!noTemp.getAgencia().equals(elemento))){
                noAnt = noTemp;
                noTemp = noTemp.getProximo();
            }
            if (noTemp != null){
                noAnt.setProximo(noTemp.getProximo());
            }
            if (noTemp == ultimo){
                ultimo = noAnt;
            }
        }
    }

    public int contarNodes() {
        int tamanho = 0;
        Node nodeTemp = primeiro;

        while (nodeTemp != null) {
            tamanho = tamanho + 1;
            nodeTemp = nodeTemp.getProximo();
        }
        return tamanho;
    }

    public void visualizarLista() {
        Node nodeTemp = primeiro;
        while (nodeTemp != null){
            System.out.println("Agencia " + nodeTemp.getAgencia().nome);
            nodeTemp = nodeTemp.getProximo();
        }
    }

    public void visualizarListaNomes() {
        Node nodeTemp = primeiro;

        while (nodeTemp != null){
            System.out.println("Agencia " + nodeTemp.getAgencia().nome + " tem " + nodeTemp.getAgencia().carro.length + " carros:");
            for (int i = 0; i < nodeTemp.getAgencia().carro.length; i++){
                System.out.println("     Carro: " + nodeTemp.getAgencia().carro[i].getMarca() + " "
                                                  + nodeTemp.getAgencia().carro[i].getModelo() + " "
                                                  + nodeTemp.getAgencia().carro[i].getPlaca() + " ");
            }
            double valorTotal = 0d;
            System.out.println("Estão alugados os carros: ");
            for (int i = 0; i < nodeTemp.getAgencia().carro.length; i++){
                if (!nodeTemp.getAgencia().carro[i].isDisponivel()) {
                    valorTotal = valorTotal + nodeTemp.getAgencia().carro[i].getValor();
                    System.out.println("     Carro: " + nodeTemp.getAgencia().carro[i].getMarca() + " "
                                                      + nodeTemp.getAgencia().carro[i].getModelo() + " "
                                                      + nodeTemp.getAgencia().carro[i].getPlaca() + " " + " diaria: "
                                                      + nodeTemp.getAgencia().carro[i].getValor() + " ");
                }
            }
            System.out.println("Valor total das diarias de carros alugados: " + valorTotal);
            System.out.println("Clientes na fila de espera: ");

            for (int i = 0; i < nodeTemp.getAgencia().clienteReserva.length; i++){
                System.out.println("     Cliente: " + nodeTemp.getAgencia().clienteReserva[i].getNome()  + "  -  Aguarda o modelo: "
                        + nodeTemp.getAgencia().clienteReserva[i].getCarroDesejado());
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - ");
            System.out.println(" ");

            nodeTemp = nodeTemp.getProximo();
        }
    }
}
