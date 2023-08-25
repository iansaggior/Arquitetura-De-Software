/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanque;

/**
 *
 * @author ian.spereira
 */
public class Tanque implements Cores, Posicao, Canhao {

    private CoresRGB corTanque;
    private CoresRGB corCanhao;
    private int x, y;

    public Tanque() {
    }

    public Tanque(CoresRGB CorTanque, CoresRGB corCanhao, int x, int y) {
        this.corTanque = CorTanque;
        this.corCanhao = corCanhao;
        this.x = x;
        this.y = y;
    }

    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public void atribCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
        return corCanhao;
    }

    @Override
    public CoresRGB retCorTanque() {
        return corTanque;
    }

    @Override
    public void movLeste() {
        x++;
    }

    @Override
    public void movOeste() {
        x--;
    }

    @Override
    public void movNorte() {
        y++;
    }

    @Override
    public void movSul() {
        y--;
    }

    @Override
    public int retPosicaoX() {
        return x;
    }

    @Override
    public int retPosicaoY() {
        return y;
    }

    @Override
    public void atirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atirar(long cadencia) {
        for(int i = 1; i < 5; i++) {
            System.out.println("Atirando...");
            esperar(1000*cadencia);
        }
    }
    
    private void esperar(long cadencia) {
        try 
        {
            if (cadencia > 5000) 
            {
                throw new IllegalArgumentException("Valor inválido. Muito tempo");
            }
            else 
            {
                Thread.sleep(cadencia);
            }
        } 
        catch (InterruptedException e) 
        {
            System.err.print("Error");                    
        }
    }
}