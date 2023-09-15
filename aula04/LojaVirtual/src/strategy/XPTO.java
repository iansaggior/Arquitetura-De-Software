package strategy;

/*
 *  Professor Gerson Risso
 */
public class XPTO implements CalcularFreteEmpresas{

    @Override
    public double calcularFrete(double peso) {
      double frete;
            if (peso <= 5) {
                frete = 10;
            } else if (peso <= 10) {
                frete = 17.6;
            } else {
                frete = 23.1;
            }
            return frete;
    }

}
