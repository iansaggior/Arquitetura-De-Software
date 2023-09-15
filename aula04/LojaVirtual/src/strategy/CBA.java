package strategy;

/*
 *  Professor Gerson Risso
 */
public class CBA implements CalcularFreteEmpresas{

    @Override
    public double calcularFrete(double peso) {
        double frete;
        if (peso <= 5) {
                frete = 12;
            } else if (peso <= 10) {
                frete = 22.6;
            } else {
                frete = 31.5;
            }
        return frete;
    }

}
