package padrao;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class NaveJogador implements Subject {
    private static NaveJogador instance;
    private String nome;
    private Acao acao;
    private List<Observer> lista;

    public NaveJogador(String nome) {
        this.nome = nome;
        lista = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void adicionarAcao(Acao acao) {
        this.acao = acao;
        notificar();
    }

    @Override
    public void notificar() {
        for (Observer obs : lista) {
            obs.atualizar(acao);
        }
    }

    public void removerObservador(Observer observer) {
        lista.remove(observer);
    }

    public static NaveJogador getInstance(String nome) {
        if (instance == null) {
            instance = new NaveJogador(nome);
        }
        return instance;
    }

    public void movimentoAleatorio() {
        Random random = new Random();
        int numAcoes = Acao.values().length;
        Acao acaoAleatoria = Acao.values()[random.nextInt(numAcoes)];
        adicionarAcao(acaoAleatoria);
    }
}
