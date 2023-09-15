package strategy;

/*
 *  Professor Gerson Risso
 */
public class ABC implements CalcularFreteEmpresas{

    @Override
    public double calcularFrete(double peso) {
        double frete;
        if (peso <= 5) {
                frete = 11.3;
            } else if (peso <= 10) {
                frete = 19;
            } else {
                frete = 23.8;
            }
        return frete;
    }
 
}
