package Study;

import Study.domain.*;

import java.util.ArrayDeque;
import java.util.Queue;

//Esta é uma aplicação de lista encadeada

public class RedeLocadoraApplication {

    public static void main(String[] args) {
        Carro[] carro = new Carro[10];
        ClienteReserva[] clienteReserva = new ClienteReserva[10];
        Evento[] evento = new Evento[10];

        //Cria as agencias
        Agencia agenciaPaulista = new Agencia("Paulista", carro, clienteReserva, evento);
        Agencia agenciaCongonhas = new Agencia("Congonhas", carro, clienteReserva, evento);
        Agencia agenciaIguatemi = new Agencia("Iguatemi", carro, clienteReserva, evento);
        Agencia agenciaSantos = new Agencia("Santos", carro, clienteReserva, evento);
        Agencia agenciaCampinas = new Agencia("Campinas", carro, clienteReserva, evento);

        ListaEncadeada listaAgencias = new ListaEncadeada();

        listaAgencias.inserirInicio(agenciaPaulista);
        listaAgencias.inserirInicio(agenciaCongonhas);
        listaAgencias.inserirInicio(agenciaIguatemi);
        listaAgencias.inserirInicio(agenciaSantos);
        listaAgencias.inserirFinal(agenciaCampinas);

        System.out.println("Agencias na lista:");
        listaAgencias.visualizarLista();
        System.out.println("Quantidade total de agencias: " + listaAgencias.contarNodes());
        System.out.println(" ");

        //Testes para mudar a posição das agencias na lista encadeada
        System.out.println("Agencias na lista, teste de remoçao/adição no final:");
        listaAgencias.remover(agenciaIguatemi);
        listaAgencias.inserirFinal(agenciaIguatemi);
        listaAgencias.visualizarLista();
        System.out.println("Quantidade total da lista: " + listaAgencias.contarNodes());
        System.out.println(" ");

        System.out.println("Agencias na lista, teste de remoçao/adição no início:");
        listaAgencias.remover(agenciaIguatemi);
        listaAgencias.inserirInicio(agenciaIguatemi);
        listaAgencias.visualizarLista();
        System.out.println("Quantidade total da lista: " + listaAgencias.contarNodes());
        System.out.println(" ");

        //Inicializa carros e fila de clientes, esta etapa poderia ser leitura de banco de dados
        Carro[] carrosPaulista = {
                new Carro("AAA-1001","Fiat","Preto","Toro",120.00,Boolean.TRUE),
                new Carro("AAA-1002","Fiat","Branco","Toro",119.00,Boolean.FALSE),
                new Carro("AAA-1003","Toyota","Cinza chumbo","Hilux SW4",150.00,Boolean.TRUE),
                new Carro("AAA-1004","Chevrolet","Preto","Onix",95.00,Boolean.TRUE),
                new Carro("AAA-1005","Ford","Branco","Fiesta",90.00,Boolean.FALSE),
                new Carro("AAA-1006","Ford","Prata","Fiesta",92.00,Boolean.TRUE),
                new Carro("AAA-1007","Fiat","Vermelho","Argo",89.00,Boolean.TRUE) };
        agenciaPaulista.setCarro(carrosPaulista);

        Queue<ClienteReserva> clienteReservasPaulista = new ArrayDeque<>();
        clienteReservasPaulista.add(new ClienteReserva("José", "11 99999-1001", "Casa1","Toro"));
        clienteReservasPaulista.add(new ClienteReserva("Ana", "11 99999-1002", "Casa2","Fiesta"));

        ClienteReserva[] reservasPaulista = clienteReservasPaulista.stream().toArray(ClienteReserva[]::new);
        agenciaPaulista.setClienteReserva(reservasPaulista);

        Carro[] carrosCongonhas = {
                new Carro("BBB-2001","Fiat","Preto","Toro",120.00,Boolean.TRUE),
                new Carro("BBB-2002","Fiat","Branco","Toro",119.00,Boolean.TRUE),
                new Carro("BBB-2003","Toyota","Cinza chumbo","Hilux SW4",150.00,Boolean.FALSE),
                new Carro("BBB-2004","Toyota","Preto","Corolla",115.00,Boolean.TRUE),
                new Carro("BBB-2005","Ford","Branco","Fiesta",90.00,Boolean.TRUE),
                new Carro("BBB-2006","Ford","Prata","Fiesta",92.00,Boolean.TRUE),
                new Carro("BBB-2007","Fiat","Preto","Argo",89.00,Boolean.TRUE) };
        agenciaCongonhas.setCarro(carrosCongonhas);

        Queue<ClienteReserva> clienteReservasCongonhas = new ArrayDeque<>();
        clienteReservasCongonhas.add(new ClienteReserva("Pedro","11 8888-0001","Casa3","Toro"));
        clienteReservasCongonhas.add(new ClienteReserva("Lucia","11 8888-0002","Casa4","Toro"));

        ClienteReserva[] reservasCongonhas = clienteReservasCongonhas.stream().toArray(ClienteReserva[]::new);
        agenciaCongonhas.setClienteReserva(reservasCongonhas);

        Carro[] carrosIguatemi = {
                new Carro("CCC-3001","Fiat","Preto","Toro",120.00,Boolean.TRUE),
                new Carro("CCC-3002","Fiat","Branco","Toro",119.00,Boolean.TRUE),
                new Carro("CCC-3003","Toyota","Cinza chumbo","Hilux SW4",150.00,Boolean.TRUE),
                new Carro("CCC-3004","Toyota","Preto","Corolla",115.00,Boolean.FALSE),
                new Carro("CCC-3005","Jipe","Preto","Compass",149.00,Boolean.FALSE) };
        agenciaIguatemi.setCarro(carrosIguatemi);

        Queue<ClienteReserva> clienteReservasIguatemi = new ArrayDeque<>();
        clienteReservasIguatemi.add(new ClienteReserva("Maria","11 8888-9901","Casa5","Toro"));
        clienteReservasIguatemi.add(new ClienteReserva("João","11 8888-9902","Casa6","Toro"));

        ClienteReserva[] reservasIguatemi = clienteReservasIguatemi.stream().toArray(ClienteReserva[]::new);
        agenciaIguatemi.setClienteReserva(reservasIguatemi);

        Carro[] carrosSantos = {
                new Carro("DDD-4001","Fiat","Preto","Strada",100.00,Boolean.FALSE),
                new Carro("DDD-4002","Fiat","Branco","Strada",99.00,Boolean.TRUE),
                new Carro("DDD-4003","Toyota","Cinza chumbo","Hilux SW4",150.00,Boolean.FALSE),
                new Carro("DDD-4004","Toyota","Preto","Corolla",115.00,Boolean.TRUE),
                new Carro("DDD-4005","Jipe","Preto","Renegade",129.00,Boolean.TRUE) };
        agenciaSantos.setCarro(carrosSantos);

        Queue<ClienteReserva> clienteReservasSantos = new ArrayDeque<>();
        clienteReservasSantos.add(new ClienteReserva("Sandra","13 7777-9901","Casa7","Toro"));
        clienteReservasSantos.add(new ClienteReserva("Paulo","13 7777-9902","Casa8","Toro"));

        ClienteReserva[] reservasSantos = clienteReservasSantos.stream().toArray(ClienteReserva[]::new);
        agenciaSantos.setClienteReserva(reservasSantos);

        Carro[] carrosCampinas = {
                new Carro("EEE-5001","Fiat","Preto","Strada",100.00,Boolean.TRUE),
                new Carro("EEE-5002","Fiat","Branco","Strada",99.00,Boolean.FALSE),
                new Carro("EEE-5003","Toyota","Preto","Yaris",95.00,Boolean.TRUE),
                new Carro("EEE-5004","Toyota","Preto","Corolla",115.00,Boolean.TRUE),
                new Carro("EEE-5005","Jipe","Preto","Renegade",129.00,Boolean.TRUE) };
        agenciaCampinas.setCarro(carrosCampinas);

        Queue<ClienteReserva> clienteReservasCampinas = new ArrayDeque<>();
        clienteReservasCampinas.add(new ClienteReserva("Luana","19 7777-7701","Casa9","Toro"));
        clienteReservasCampinas.add(new ClienteReserva("Juca","19 7777-7702","Casa10","Toro"));

        ClienteReserva[] reservasCampinas = clienteReservasCampinas.stream().toArray(ClienteReserva[]::new);
        agenciaCampinas.setClienteReserva(reservasCampinas);

        listaAgencias.visualizarLista();

        System.out.println(" ");
        System.out.println("Lista das Agencias: ");
        System.out.println(" ");
        listaAgencias.visualizarListaNomes();
        System.out.println("_______________________________________");
        System.out.println(" ");


        System.out.println("    =========       00000  00000    0  ");
        System.out.println("   |         |      0      0   0    0  ");
        System.out.println("   ===========      00000  0   0  00000");
        System.out.println("  |() ===== ()|         0  0   0    0  ");
        System.out.println("  =============     00000  O00OO    0  ");
        System.out.println("  ||         ||     ___________________");
    }
}
