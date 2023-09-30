/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package strategy;

/**
 *
 * @author iansa
 */
public enum OpcImposto {
    IPTO01 {
        @Override
        public CalcOrcam opcaoCalcOrca() {
            CalcOrcam calcIpto01 = new IPTO1();
            return calcIpto01;
        }
    },
    IPTO02 {
        @Override
        public CalcOrcam opcaoCalcOrca() {
            CalcOrcam calcIpto02 = new IPTO2();
            return calcIpto02;
        }
    },
    IPTO03 {
        @Override
        public CalcOrcam opcaoCalcOrca() {
            CalcOrcam calcIpto03 = new IPTO3();
            return calcIpto03;
        }
    };

    public abstract CalcOrcam opcaoCalcOrca();
}
