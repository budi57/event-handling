package tugaspbo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PenjualanTiket  extends JFrame
{
    JLabel lbltiket=new JLabel("TIKET KERETA API");
 JLabel lblnamapenumpang=new JLabel("Nama Penumpang ");
 JTextField txnamapenumpang=new JTextField(100);
 JLabel lblkode=new JLabel("Kode Kereta");
 String[] pilihkode={"pilih kode","56","12","23","001","222","212"};
 JComboBox cbkode=new JComboBox(pilihkode);
 JLabel lblnamakeretaapi=new JLabel("Nama Kereta Api ");
 JTextField txnamakeretaapi=new JTextField(100);
 JLabel lblkelas=new JLabel("Kelas");
 JRadioButton kelasEkonomi=new JRadioButton("Ekonomi");
 JRadioButton kelasBisnis=new JRadioButton("Bisnis");
 JButton tblpesan=new JButton("Pesan");
 JButton tblbatalkan=new JButton("Batalkan");
 JButton cetak=new JButton("Cetak");
 JTextArea hasil=new JTextArea();
    
 PenjualanTiket()
 {
 setTitle("Pesan Tiket");
 setLocation(300,100);
 setSize(500,500);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void Tiket()
 {
 getContentPane().setLayout(null);
 
 getContentPane().add(lbltiket);
 lbltiket.setBounds(60,10,200,20);
 getContentPane().add(lblnamapenumpang);
 lblnamapenumpang.setBounds(10,30,200,20);
 getContentPane().add(txnamapenumpang);
 txnamapenumpang.setBounds(150,30,100,20);
 getContentPane().add(lblkode);
 lblkode.setBounds(10,60,100,20);
 getContentPane().add(cbkode);
 cbkode.setBounds(150,60,100,20);
 getContentPane().add(lblnamakeretaapi);
 lblnamakeretaapi.setBounds(10,90,200,20);
 getContentPane().add(txnamakeretaapi);
 txnamakeretaapi.setBounds(150,90,100,20);
 getContentPane().add(lblkelas);
 lblkelas.setBounds(10,120,200,20);
  getContentPane().add(kelasEkonomi);
 kelasEkonomi.setBounds(75,120,100,20);
 getContentPane().add(kelasBisnis);
 kelasBisnis.setBounds(200,120,100,20);
  getContentPane().add(tblpesan);
 tblpesan.setBounds(180,150,95,20);
 getContentPane().add(tblbatalkan);
 tblbatalkan.setBounds(180,180,95,20);
 getContentPane().add(cetak);
 cetak.setBounds(180,210,95,20);
 getContentPane().add(hasil); 
 hasil.setBounds(10,240,270,150);
 
   setVisible(true);
 
 }
   void AksiReaksi()
{ 
   cetak.addActionListener(new ActionListener()
   {
       public void actionPerformed(ActionEvent e)
       {
           hasil.append(txnamapenumpang.getText()+"\n");
           hasil.append(txnamakeretaapi.getText()+"\n");
           if(kelasEkonomi.isSelected()==true)
           {
               hasil.append(kelasEkonomi.getText()+"\n");
           }
           else
           {
               hasil.append(kelasBisnis.getText()+"\n");
           } 
           { String pilihkode = (String)
                   cbkode.getSelectedItem();
           hasil.append(pilihkode+"\n");
           }
                
         }       
   });
}   
    public static void main(String args[])
   {
 PenjualanTiket kr=new PenjualanTiket();
 kr.Tiket();
 kr.AksiReaksi();
  } 
}
