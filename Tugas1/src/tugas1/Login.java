/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class loginn extends JFrame implements ActionListener {
    JLabel Teks1 = new JLabel("Selamat Datang!");
    JLabel Teks2 = new JLabel("Silahkan Masuk untuk Melanjutkan");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JLabel kelamin = new JLabel("Jenis Kelamin");
    //tombol baru maniez
    JButton tombol = new  JButton ("Login");
    
    JTextField input = new JTextField();
    JTextField input1 = new JTextField();
    
    JRadioButton pilihP = new JRadioButton("Pria");
    JRadioButton pilihW = new JRadioButton("Wanita");
    
    loginn(){
        setVisible(true);
        setSize(450,480);
        setTitle("Buat Frame Baru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Teks1.setFont(Teks1.getFont().deriveFont(17f));
        
        setLayout(null);
        add(Teks1);
        Teks1.setBounds(10,20,150,25);
        add(Teks2);
        Teks2.setBounds(10,38,150,25);
        
        
        add(username);
        username.setBounds(10,60,150,25);
        add(input);
        input.setBounds(10, 80, 200, 20);
        
        add(password);
        password.setBounds(10,110,150,25);
        add(input1);
        input1.setBounds(10, 130, 200, 20);
        
        add(kelamin);
        kelamin.setBounds(10,150,150,25);
                
        //membuat group radio button
        ButtonGroup pilihKelamin = new ButtonGroup();
        pilihKelamin.add(pilihP);
        pilihKelamin.add(pilihW);
        add(pilihP);
        pilihP.setBounds(10,170,100,32);
        
        add(pilihW);
        pilihW.setBounds(120, 170, 100, 32);
        
        add(tombol);
        tombol.setBounds(130, 220, 180, 24);
        
        tombol.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String pilihKelamin = pilihP.isSelected() ? "MR. " : "Mrs. " ;
       String nama = input.getText();
       dispose();
       new hitungg(nama, pilihKelamin);
        
    }
}

