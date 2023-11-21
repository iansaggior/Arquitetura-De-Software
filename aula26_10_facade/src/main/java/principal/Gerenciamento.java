/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;
import facade.*;

/**
 *
 * @author ian.spereira
 */
public class Gerenciamento {

    public static void main(String[] args) {
        // Gerar Relatorio
        Facade facade = new Facade();
        facade.gerarRelatorio();
    }
}
