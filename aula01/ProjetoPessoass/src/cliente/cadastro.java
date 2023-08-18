package cliente;

import javax.swing.JOptionPane;

import heranca.*;

public class cadastro {
    public static void main(String[] args) {
        
        String nomePF;
        long cpf;
        int matricula;
        String nomePJ;
        long cnpj;
        String[] persons = {"Pessoa Física", "Pessoa Jurídica"};
        int optionPerson = JOptionPane.showOptionDialog(null, "Qual tipo de pessoa voce quer cadastar?",
            null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, persons, persons[0]);

        
        if (optionPerson == 0) {
            nomePF = JOptionPane.showInputDialog("Digite seu nome: ");
            cpf = Long.parseLong(JOptionPane.showInputDialog("Digite seu CPF: "));
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua matrícula: "));
            Funcionario  funcionario = new Funcionario(nomePF, cpf, matricula);
            System.out.println(funcionario);
        } else {
            nomePJ = JOptionPane.showInputDialog("Digite o nome da sua empresa: ");
            cnpj = Long.parseLong(JOptionPane.showInputDialog("Digite o CNPJ da empresa: "));
            PessoaJuridica  pesJur = new PessoaJuridica(nomePJ, cnpj);
            System.out.println(pesJur);
        }
        
    }

}
