/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import balok.operasi;

class hitungg extends JFrame implements ActionListener {
    
    JLabel Teks1 = new JLabel();
    JLabel Teks2 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel luasP = new JLabel("Luas Persegi");
    JLabel kelP = new JLabel("Keliling Persegi");
    JLabel volB = new JLabel("Volume Balok");
    JLabel luasPB = new JLabel("Luas Permukaan Balok");
    
    //tombol baru maniez
    JButton tombol = new  JButton ("Hitung");
    JButton tombol1 = new  JButton ("Reset");
    JButton tombol3 = new  JButton ("BALIK KE HOMEEE");
    
    
    JTextField input = new JTextField();
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    
    
    hitungg(String nama, String pilihKelamin){
        setVisible(true);
        setSize(450,480);
        setTitle("Buat Frame Baru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Teks1.setFont(Teks1.getFont().deriveFont(17f));
        
        
        setLayout(null);
        Teks1.setText("Welcome," + pilihKelamin + nama);
        add(Teks1);
        Teks1.setBounds(10,20,300,25);
        add(Teks2);
        Teks2.setBounds(10,38,400,25);
        
        
        add(panjang);
        panjang.setBounds(10,70,150,25);
        add(input);
        input.setBounds(70, 70, 190, 20);
        
        add(lebar);
        lebar.setBounds(10,100,150,25);
        add(input1);
        input1.setBounds(70, 100, 190, 20);
        
        add(tinggi);
        tinggi.setBounds(10,130,150,25);
        add(input2);
        input2.setBounds(70, 130, 190, 20);
        
        add(tombol);
        tombol.setBounds(90, 160, 280, 24);
        tombol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validasi();
                hitung1();
            }
        });
        

        add(tombol1);
        tombol1.setBounds(90, 190, 280, 24);
        tombol1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        
        add(tombol3);
        tombol3.setBounds(90, 340, 280, 24);
        tombol3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pulang();
            }
        });
        
        
         add(hasil);
        hasil.setBounds(215,220,180,25);
        
        add(luasP);
        luasP.setBounds(10,240,150,25);
     
        
        add(kelP);
        kelP.setBounds(10,260,150,25);
        
        
        add(volB);
        volB.setBounds(10,280,150,25);
        
        
        add(luasPB);
        luasPB.setBounds(10,300,190,25);
      
    }

 @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


private void hitung1(){
        // Mengambil nilai panjang, lebar, dan tinggi dari JTextField
        double panjang = Double.parseDouble(input.getText());
        double lebar = Double.parseDouble(input1.getText());
        double tinggi = Double.parseDouble(input2.getText());

        // Membuat objek balok dengan nilai panjang, lebar, dan tinggi yang diambil dari input
        operasi balokku = new operasi(panjang, lebar, tinggi);

        // Menghitung hasil menggunakan metode-metode yang telah didefinisikan di kelas balok
        double luasPersegi = balokku.hasilLP();
        double kelilingPersegi = balokku.hasilKP();
        double volumeBalok = balokku.hasilVB();
        double luasPermukaanBalok = balokku.hasilLPB();

        // Menetapkan hasil perhitungan ke JLabel masing-masing
        luasP.setText("Luas Persegi : " + luasPersegi);
        kelP.setText("Keliling Persegi : " + kelilingPersegi);
        volB.setText("Volume Balok : " + volumeBalok);
        luasPB.setText("Luas Permukaan Balok : " + luasPermukaanBalok);
    }

private void validasi (){
    if(input.getText().equals("") || input1.getText().equals("") || input2.getText().equals("")){
       JOptionPane.showMessageDialog(null, "ISI DATA DENGAN LENGKAP");
    }else{
        input.setText(input.getText());
        input1.setText(input1.getText());
        input2.setText(input2.getText());
    }
}

private void reset(){
        input.setText("");
        input1.setText("");
        input2.setText("");
        luasP.setText("Luas Persegi : ");
        kelP.setText("Keliling Persegi : ");
        volB.setText("Volume Balok : ");
        luasPB.setText("Luas Permukaan Balok : ");
    }
 private void pulang(){
        dispose();
        new loginn();
    }
}