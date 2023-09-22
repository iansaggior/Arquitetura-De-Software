package fabrica;
/**
 *
 * @author ian.spereira
 */
public class FabricaFiat implements Criadora {
    @Override
    public Carro metodoFabrica(Tipo modelo) 
    {
        if (modelo.equals(Tipo.ARGO)) {
            return new Argo(123000, "Argo XPTO");
        } else if (modelo.equals(Tipo.UNO)) {
            return new Uno(150000, "Uno");
        }
        return null;
    }
}
