/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balok;


import javax.swing.JTextField;

public class operasi implements balokk{

    private double input, input1, input2;
    
    public operasi(double input, double input1, double input2) {
        this.input = input;
        this.input1 = input1;
        this.input2 = input2;
    }

    public operasi(JTextField pnj, JTextField lbr, JTextField tng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getpnj() {
        return input;
    }

    public void setpnj(double input) {
        this.input = input;
    }

    public double getlbr() {
        return input1;
    }

    public void setlbr(double input1) {
        this.input1 = input1;
    }
    
    public double gettng() {
        return input2;
    }

    public void settng(double input2) {
        this.input2 = input2;
    }
    
    // Membuat sebuah method Luas untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double hasilLP() {
        return input * input1;
    }
    
    @Override
    public double hasilKP() {
        return 2 * (input + input1);
    }
    
    @Override
    public double hasilVB() {
        return (input * input1 * input2);
    }
    
    @Override
    public double hasilLPB() {
        return 2 * ( ((input * input1) + (input * input2) + (input1 * input2)));
    }

    
}
