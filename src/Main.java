import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Paciente pac = new Paciente();

        int select;




        pac.setNome(JOptionPane.showInputDialog("Entre com o nome:"));
        pac.setTelefone(JOptionPane.showInputDialog("Entre com o Tel:"));
        pac.setEmail(JOptionPane.showInputDialog("Digite o E-mail"));
        pac.setDatanasc(JOptionPane.showInputDialog("Informe a data de nascimento"));
        pac.setEndereco(JOptionPane.showInputDialog("Informe o endereço"));
        pac.setSexo(JOptionPane.showInputDialog("Informe o sexo: "));

        Scanner scan = new Scanner(System.in);



        select = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A ESPECIALIDADE: \n(1) - PEDIATRIA; \n(2) - ORTOPEDIA; \n(3) - CLÍNICO GERAL; \n(4) - NEUROLOGISTA:"));





        switch (select){
            case 1:
                JOptionPane.showMessageDialog(null,"\nNome: " + pac.getNome()+"\nTelefone: " + pac.getTelefone()+"\nE-mail: " + pac.getEmail()+"\nAniversário: " + pac.getDatanasc()+"\nEndereço: " + pac.getEndereco()+"\nSexo: " + pac.getSexo());
                Pediatra ped = new Pediatra("\nDr. Paulo","Manhã","Segunda-Feira");
                JOptionPane.showMessageDialog(null,"\nInformações da consulta: "+ped.getDados());
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"\nNome: " + pac.getNome()+"\nTelefone: " + pac.getTelefone()+"\nE-mail: " + pac.getEmail()+"\nAniversário: " + pac.getDatanasc()+"\nEndereço: " + pac.getEndereco()+"\nSexo: " + pac.getSexo());
                Ortopedista ort = new Ortopedista("Dr. Sandro","Tarde","Terça-Feira");
                JOptionPane.showMessageDialog(null,"\nInformações da consulta: "+ort.getDados());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"\nNome: " + pac.getNome()+"\nTelefone: " + pac.getTelefone()+"\nE-mail: " + pac.getEmail()+"\nAniversário: " + pac.getDatanasc()+"\nEndereço: " + pac.getEndereco()+"\nSexo: " + pac.getSexo());
                Clinico clin = new Clinico("Dr. Carlos","Noite","Quarta-Feira");
                JOptionPane.showMessageDialog(null,"\nInformações da consulta: "+clin.getDados());
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"\nNome: " + pac.getNome()+"\nTelefone: " + pac.getTelefone()+"\nE-mail: " + pac.getEmail()+"\nAniversário: " + pac.getDatanasc()+"\nEndereço: " + pac.getEndereco()+"\nSexo: " + pac.getSexo());
                Neurologista neuro = new Neurologista("Dr. Rafael","Noite","Quinta-Feira");
                JOptionPane.showMessageDialog(null,"\nInformações da consulta: "+neuro.getDados());
                break;

            default:
                out.printf("OPERAÇÃO INVÁLIDA");

        }

    }
}
