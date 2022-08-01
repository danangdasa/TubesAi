package com.danang.sistempakarbaru;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SitemPakar extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel daftarGejalaTab;
    private JPanel diagnosaTab;
    private JRadioButton yaRadioButton;
    private JRadioButton tidakRadioButton;
    private JRadioButton tidakRadioButton1;
    private JRadioButton yaRadioButton1;
    private JRadioButton tidakRadioButton2;
    private JRadioButton yaRadioButton2;
    private JRadioButton tidakRadioButton3;
    private JRadioButton yaRadioButton3;
    private JRadioButton tidakRadioButton4;
    private JRadioButton yaRadioButton4;
    private JRadioButton tidakRadioButton5;
    private JRadioButton yaRadioButton5;
    private JRadioButton tidakRadioButton6;
    private JRadioButton yaRadioButton6;
    private JRadioButton tidakRadioButton7;
    private JRadioButton yaRadioButton7;
    private JRadioButton tidakRadioButton8;
    private JRadioButton yaRadioButton8;
    private JRadioButton tidakRadioButton9;
    private JRadioButton yaRadioButton9;
    private JRadioButton tidakRadioButton10;
    private JRadioButton yaRadioButton10;
    private JRadioButton tidakRadioButton11;
    private JRadioButton yaRadioButton11;
    private JRadioButton tidakRadioButton12;
    private JRadioButton yaRadioButton12;
    private JRadioButton tidakRadioButton13;
    private JRadioButton yaRadioButton13;
    private JRadioButton tidakRadioButton14;
    private JRadioButton yaRadioButton14;
    private JRadioButton tidakRadioButton15;
    private JRadioButton yaRadioButton15;
    private JRadioButton tidakRadioButton16;
    private JRadioButton yaRadioButton16;
    private JRadioButton tidakRadioButton17;
    private JRadioButton tidakRadioButton18;
    private JRadioButton tidakRadioButton19;
    private JRadioButton yaRadioButton17;
    private JRadioButton yaRadioButton18;
    private JRadioButton yaRadioButton19;
    private JButton keluarButton;
    private JButton diagnosaButton;
    private JPanel mainPanel;
    private JTextArea pencegahanTextArea;
    private JTextField diagnosaTextField;
    private JButton clearButton;
    private JButton clearButton1;
    private JLabel gejala1;
    private JLabel gejala7;
    private JLabel gejala2;
    private JLabel gejala3;
    private JLabel gejala4;
    private JLabel gejala5;
    private JLabel gejala6;
    private JLabel gejala8;
    private JLabel gejala9;
    private JLabel gejala10;
    private JLabel gejala11;
    private JLabel gejala12;
    private JLabel gejala13;
    private JLabel gejala14;
    private JLabel gejala15;
    private JLabel gejala16;
    private JLabel gejala17;
    private JLabel gejala18;
    private JLabel gejala19;
    private JLabel gejala20;
    private JTextArea gejalaTextArea;
    private JButton keluarButton1;

    public SitemPakar() {
        super("SistemPakar");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(1080,720);

        yaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton.isSelected()) {
                    tidakRadioButton.setSelected(false);
                }
            }
        });
        tidakRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton.isSelected()) {
                    yaRadioButton.setSelected(false);
                }
            }
        });
        yaRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton1.isSelected()) {
                    tidakRadioButton1.setSelected(false);
                }
            }
        });
        tidakRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton1.isSelected()) {
                    yaRadioButton1.setSelected(false);
                }
            }
        });
        yaRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton2.isSelected()) {
                    tidakRadioButton2.setSelected(false);
                }
            }
        });
        tidakRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton2.isSelected()) {
                    yaRadioButton2.setSelected(false);
                }
            }
        });
        yaRadioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton3.isSelected()) {
                    tidakRadioButton3.setSelected(false);
                }
            }
        });

        tidakRadioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton3.isSelected()) {
                    yaRadioButton3.setSelected(false);
                }
            }
        });
        yaRadioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton4.isSelected()) {
                    tidakRadioButton4.setSelected(false);
                }
            }
        });
        tidakRadioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton4.isSelected()) {
                    yaRadioButton4.setSelected(false);
                }
            }
        });
        yaRadioButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton5.isSelected()) {
                    tidakRadioButton5.setSelected(false);
                }
            }
        });

        tidakRadioButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton5.isSelected()) {
                    yaRadioButton5.setSelected(false);
                }
            }
        });
        yaRadioButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton6.isSelected()) {
                    tidakRadioButton6.setSelected(false);
                }
            }
        });
        tidakRadioButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton6.isSelected()) {
                    yaRadioButton6.setSelected(false);
                }
            }
        });
        yaRadioButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton7.isSelected()) {
                    tidakRadioButton7.setSelected(false);
                }
            }
        });
        tidakRadioButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton7.isSelected()) {
                    yaRadioButton7.setSelected(false);
                }
            }
        });
        yaRadioButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton8.isSelected()) {
                    tidakRadioButton8.setSelected(false);
                }
            }
        });
        tidakRadioButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton8.isSelected()) {
                    yaRadioButton8.setSelected(false);
                }
            }
        });
        yaRadioButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton9.isSelected()) {
                    tidakRadioButton9.setSelected(false);
                }
            }
        });
        tidakRadioButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton9.isSelected()) {
                    yaRadioButton9.setSelected(false);
                }
            }
        });
        yaRadioButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton10.isSelected()) {
                    tidakRadioButton10.setSelected(false);
                }
            }
        });
        yaRadioButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton11.isSelected()) {
                    tidakRadioButton11.setSelected(false);
                }
            }
        });
        tidakRadioButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton10.isSelected()) {
                    yaRadioButton10.setSelected(false);
                }
            }
        });
        tidakRadioButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton11.isSelected()) {
                    yaRadioButton11.setSelected(false);
                }
            }
        });
        yaRadioButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton12.isSelected()) {
                    tidakRadioButton12.setSelected(false);
                }
            }
        });
        yaRadioButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton13.isSelected()) {
                    tidakRadioButton13.setSelected(false);
                }
            }
        });
        yaRadioButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton14.isSelected()) {
                    tidakRadioButton14.setSelected(false);
                }
            }
        });
        yaRadioButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton15.isSelected()) {
                    tidakRadioButton15.setSelected(false);
                }
            }
        });
        yaRadioButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton16.isSelected()) {
                    tidakRadioButton16.setSelected(false);
                }
            }
        });
        yaRadioButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton17.isSelected()) {
                    tidakRadioButton17.setSelected(false);
                }
            }
        });
        yaRadioButton18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton18.isSelected()) {
                    tidakRadioButton18.setSelected(false);
                }
            }
        });
        yaRadioButton19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton19.isSelected()) {
                    tidakRadioButton19.setSelected(false);
                }
            }
        });
        tidakRadioButton12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton12.isSelected()) {
                    yaRadioButton12.setSelected(false);
                }
            }
        });
        tidakRadioButton13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton13.isSelected()) {
                    yaRadioButton13.setSelected(false);
                }
            }
        });
        tidakRadioButton14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton14.isSelected()) {
                    yaRadioButton14.setSelected(false);
                }
            }
        });

        tidakRadioButton15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton15.isSelected()) {
                    yaRadioButton15.setSelected(false);
                }
            }
        });
        tidakRadioButton16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton16.isSelected()) {
                    yaRadioButton16.setSelected(false);
                }
            }
        });
        tidakRadioButton17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton17.isSelected()) {
                    yaRadioButton17.setSelected(false);
                }
            }
        });
        tidakRadioButton18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton18.isSelected()) {
                    yaRadioButton18.setSelected(false);
                }
            }
        });
        tidakRadioButton19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tidakRadioButton19.isSelected()) {
                    yaRadioButton19.setSelected(false);
                }
            }
        });

        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        diagnosaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (yaRadioButton.isSelected()==true||tidakRadioButton.isSelected()==true||yaRadioButton1.isSelected()==true||tidakRadioButton1.isSelected()==true||yaRadioButton2.isSelected()==true||tidakRadioButton2.isSelected()==true||yaRadioButton3.isSelected()==true||tidakRadioButton3.isSelected()==true||yaRadioButton4.isSelected()==true||tidakRadioButton4.isSelected()==true||yaRadioButton5.isSelected()==true||tidakRadioButton5.isSelected()==true||yaRadioButton6.isSelected()==true||tidakRadioButton6.isSelected()==true||yaRadioButton7.isSelected()==true||tidakRadioButton7.isSelected()==true
                        ||yaRadioButton8.isSelected()==true||tidakRadioButton8.isSelected()==true||yaRadioButton9.isSelected()==true||tidakRadioButton9.isSelected()==true||yaRadioButton10.isSelected()==true||tidakRadioButton10.isSelected()==true||yaRadioButton11.isSelected()==true||tidakRadioButton11.isSelected()==true||yaRadioButton12.isSelected()==true||tidakRadioButton12.isSelected()==true||yaRadioButton13.isSelected()==true||tidakRadioButton13.isSelected()==true||yaRadioButton14.isSelected()==true||tidakRadioButton14.isSelected()==true||yaRadioButton15.isSelected()==true||tidakRadioButton15.isSelected()==true
                        ||yaRadioButton16.isSelected()==true||tidakRadioButton16.isSelected()==true||yaRadioButton17.isSelected()==true||tidakRadioButton17.isSelected()==true||yaRadioButton18.isSelected()==true||tidakRadioButton18.isSelected()==true||yaRadioButton19.isSelected()==true||tidakRadioButton19.isSelected()==true)
                {
                    if (yaRadioButton.isSelected()==true){
                        gejalaTextArea.setText("Rusak Sirip Pada Ujungnya");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Bakteri perusak sirip yang disebabkan oleh Pseudomonas sp ");
                        pencegahanTextArea.setText("Jaga Kualitas air, sesuaikan dengan temperatur dan PH air, kepadatan ikan dalam kolam dikurangi");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton2.isSelected()==true&&yaRadioButton7.isSelected()==true&&yaRadioButton13.isSelected()==true&&yaRadioButton16.isSelected()==true){
                        gejalaTextArea.setText("Kehilangan Nafsu Makan"+"\nBercak Putih pada ikan"+"\nNafas megap-megap dan sering ke permukaan air"+"\nIkan menjadi sering menggosok-gosokkan badan pada benda di sekitarnya");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Bercak Putih");
                        pencegahanTextArea.setText("Jaga Kualitas air, sesuaikan dengan temperatur dan PH air, gunakan suplemen ikan agar terhindar dari penyakit ini (yang mengandung pathogen)");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton3.isSelected()==true&&yaRadioButton2.isSelected()==true&&yaRadioButton8.isSelected()==true&&yaRadioButton10.isSelected()==true&&yaRadioButton15.isSelected()==true&&yaRadioButton11.isSelected()==true){
                        gejalaTextArea.setText("Luka terutama di kepala, sirip, kulit badan bagian belakang, ekor dan insang"+"\nKehilangan Nafsu Makan"+"\nWarna tubuh kusam/gelap"+"\nSuka berkumpul di dekat saluran pembuangan"+"\nTerjadi dropsy (kembung) yang ditandai perut membengkan dan lembek berisi cairan merah kekuningan"+"\nTimbul lendir berlebihan, lalu timbul perdarahan");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Aeromonas Atau Penyakit Merah");
                        pencegahanTextArea.setText("Jaga dan perbaiki kualitas air secara keseluruhan, utamanya dengan mengurangi kadar bahan organik terlarut pada air, pergantian air secara berkala, hindari stress, Lakukan vaksinasi anti aeromonas");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton4.isSelected()==true&&yaRadioButton1.isSelected()==true&&yaRadioButton12.isSelected()==true&&yaRadioButton13.isSelected()==true&&yaRadioButton14.isSelected()==true&&yaRadioButton15.isSelected()==true){
                        gejalaTextArea.setText("Bercak Merah Pada Ikan"+"\nInsang dan sirip menjadi rontok"+"\nIkan menjadi lemah dan pergerakannya lambat"+"\nNafas megap-megap dan sering ke permukaan air"+"\nWarna insang pucat"+"\nTimbul lendir berlebihan, lalu timbul perdarahan");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Pseudomoniasis/bacterial fin");
                        pencegahanTextArea.setText("Hindari terjadinya stress, Jaga kualitas air secara keseluruhan, Berikan pakan dalam jumlah yang sesuai dosis");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton4.isSelected()==true&&yaRadioButton2.isSelected()==true&&yaRadioButton13.isSelected()==true&&yaRadioButton8.isSelected()==true&&yaRadioButton16.isSelected()==true){
                        gejalaTextArea.setText("Bercak Merah Pada Ikan"+"\nInsang dan sirip menjadi rontok"+"\nKehilangan Nafsu Makan"+"\nKulit ikan melepuh"+"\nWarna tubuh kusam/gelap"+"\nNafas megap-megap dan sering ke permukaan air");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Trichodiniasis atau Penyakit Gatal");
                        pencegahanTextArea.setText("Jaga Kualitas air, sesuaikan dengan temperatur dan PH air, Kurangi kadar bahan organik terlarut pada air");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton4.isSelected()==true&&yaRadioButton16.isSelected()==true&&yaRadioButton17.isSelected()==true&&yaRadioButton18.isSelected()==true&&yaRadioButton19.isSelected()==true){
                        gejalaTextArea.setText("Insang dan sirip menjadi rontok"+"\nIkan menjadi sering menggosok-gosokkan badan pada benda di sekitarnya"+"\nkutu menempel pada tubuh ikan"+"\nTampak berenang zig-zag dan mengalami kehilangan keseimbangan"+"\nSering melompat ke permukaan");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Argulosis/kutu ikan");
                        pencegahanTextArea.setText("Jaga kualitas air secara keseluruhan,sesuaikan dengan temperatur dan PH air, Beri obat anti kutu ikan");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton4.isSelected()==true&&yaRadioButton2.isSelected()==true&&yaRadioButton3.isSelected()==true){
                        gejalaTextArea.setText("Kehilangan Nafsu Makan"+"\nLuka terutama di kepala, sirip, kulit badan bagian belakang, ekor dan insang"+"\nInsang dan sirip menjadi rontok");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Columnaris");
                        pencegahanTextArea.setText("Berikan pakan dalam jumlah yang sesuai dosis, kualitas air dijaga sesuai dengan temperatur dan PH air, Sinari dengan cahaya matahari");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton4.isSelected()==true&&yaRadioButton2.isSelected()==true&&yaRadioButton11.isSelected()==true&&yaRadioButton12.isSelected()==true&&yaRadioButton14.isSelected()==true){
                        gejalaTextArea.setText("Kehilangan Nafsu Makan"+"\nInsang dan sirip menjadi rontok"+"\nTerjadi dropsy (kembung) yang ditandai perut membengkan dan lembek berisi cairan merah kekuningan"+"\nIkan menjadi lemah dan pergerakannya lambat"+"\nWarna insang pucat");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Vibrosis");
                        pencegahanTextArea.setText("Berikan pakan dalam jumlah yang sesuai dosis, kualitas air dijaga sesuai dengan temperatur dan PH air, pensortiran ikan agar tidak menjalar");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton2.isSelected()==true&&yaRadioButton6.isSelected()==true&&yaRadioButton3.isSelected()==true){
                        gejalaTextArea.setText("Kehilangan Nafsu Makan"+"\nLuka terutama di kepala, sirip, kulit badan bagian belakang, ekor dan insang"+"\nKulit ikan melepuh");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Furuncolosis");
                        pencegahanTextArea.setText("Kualitas air dijaga sesuai dengan temperatur dan PH air, Sinari dengan cahaya matahari, pemberian pakan intensif");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton10.isSelected()==true){
                        gejalaTextArea.setText("Suka berkumpul di dekat saluran pembuangan");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Jamur");
                        pencegahanTextArea.setText("Pembersian kolam ikan, kualitas air dijaga sesuai dengan temperatur dan PH air, pemberian nutrisi ikan");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton5.isSelected()==true&&yaRadioButton9.isSelected()==true){
                        gejalaTextArea.setText("Pembengkakan pada kulit mengeluarkan cairan nanah berwarna kuning kemerah-merahan"+"\nSisik luka hingga terlepas, terdapat luka di sekitar mulut, dan bagian tubuh lain");
                        diagnosaTextField.setText("Ikan anda terkena penyakit Phylum Microspora");
                        pencegahanTextArea.setText("Penyesuaian suhu dan PH air, pergantian air secara berkala, penggunaan garam krosok sebagai penstabil PH air");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }else if (yaRadioButton13.isSelected()==true&&yaRadioButton18.isSelected()==true&&yaRadioButton19.isSelected()==true){
                        gejalaTextArea.setText("Nafas megap-megap dan sering ke permukaan air"+"\nTampak berenang zig-zag dan mengalami kehilangan keseimbangan"+"\nSering melompat ke permukaan");
                        diagnosaTextField.setText("Ikan anda terkena penyakit stresor");
                        pencegahanTextArea.setText("Penyesuaian temperatur dan PH air, pengendapan air kolam, pergantian air secara berkala");
                        JOptionPane.showMessageDialog(null,"Diagnosa Berhasil, silahkan buka form diagnosa", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }else {
                        JOptionPane.showMessageDialog(null,"Maaf Penyakit Tidak Terdeteksi", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    clearForm();

                }else{
                    JOptionPane.showMessageDialog(null, "Pilihan Tidak Boleh Kosong", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
        clearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm1();
            }
        });
        keluarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new SitemPakar();

        mainFrame.setVisible(true);
    }

    public void clearForm1(){
        diagnosaTextField.setText("");
        pencegahanTextArea.setText("");
        gejalaTextArea.setText("");
    }

    public void clearForm(){
        yaRadioButton.setSelected(false);
        yaRadioButton1.setSelected(false);
        yaRadioButton2.setSelected(false);
        yaRadioButton3.setSelected(false);
        yaRadioButton4.setSelected(false);
        yaRadioButton5.setSelected(false);
        yaRadioButton6.setSelected(false);
        yaRadioButton7.setSelected(false);
        yaRadioButton8.setSelected(false);
        yaRadioButton9.setSelected(false);
        yaRadioButton10.setSelected(false);
        yaRadioButton11.setSelected(false);
        yaRadioButton12.setSelected(false);
        yaRadioButton13.setSelected(false);
        yaRadioButton14.setSelected(false);
        yaRadioButton15.setSelected(false);
        yaRadioButton16.setSelected(false);
        yaRadioButton17.setSelected(false);
        yaRadioButton18.setSelected(false);
        yaRadioButton19.setSelected(false);
        tidakRadioButton.setSelected(false);
        tidakRadioButton1.setSelected(false);
        tidakRadioButton2.setSelected(false);
        tidakRadioButton3.setSelected(false);
        tidakRadioButton4.setSelected(false);
        tidakRadioButton5.setSelected(false);
        tidakRadioButton6.setSelected(false);
        tidakRadioButton7.setSelected(false);
        tidakRadioButton8.setSelected(false);
        tidakRadioButton9.setSelected(false);
        tidakRadioButton10.setSelected(false);
        tidakRadioButton11.setSelected(false);
        tidakRadioButton12.setSelected(false);
        tidakRadioButton13.setSelected(false);
        tidakRadioButton14.setSelected(false);
        tidakRadioButton15.setSelected(false);
        tidakRadioButton16.setSelected(false);
        tidakRadioButton17.setSelected(false);
        tidakRadioButton18.setSelected(false);
        tidakRadioButton19.setSelected(false);
    }
}
