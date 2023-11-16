package padrao;

/**
 *
 * @author ian.spereira
 */
public interface Subject {
    public void adcionarObvd(Observer observer);
    public void adcionarAcao(Acao acao);
    public void notificar();
    
    //public void removerObvd(Observer observer);
}
