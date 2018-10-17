package adellacake;


import java.awt.event.*;
import javax.swing.*;

public class AdellaCake extends JFrame {
    
   JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(20);
    JLabel lblalamat=new JLabel("Alamat");
    JTextField txalamat=new JTextField(30);
    JLabel lbltlp=new JLabel("No . Telpon");
    JTextField txtlp=new JTextField(12);
    JLabel lblpesanan=new JLabel("Pesanan");
    JCheckBox BF = new JCheckBox("BlackForest");
    JCheckBox CC = new JCheckBox("CheeseCake");
    JCheckBox RV = new JCheckBox("RedVelvet");
    JCheckBox RC = new JCheckBox("RainbowCake");
    JLabel lblukuran=new JLabel("Ukuran");
    JRadioButton lb = new JRadioButton("15x15cm");
    JRadioButton de = new JRadioButton("24x24cm");
    JRadioButton el = new JRadioButton("45x45cm");
    ButtonGroup ukuran = new ButtonGroup(); 
    JTextArea hasil=new JTextArea();
    JButton cetak = new JButton("Cetak");
    
    AdellaCake() 
    {
        setTitle("PAYMENT");
        setLocation(500,100);
        setSize(600,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void KomponenVisual()
    {
        getContentPane().setLayout(null);
        getContentPane().add(lblnama);
        lblnama.setBounds(30,10,130,20);
        getContentPane().add(txnama);
        txnama.setBounds(165,10,250,20);
        getContentPane().add(lblalamat);
        lblalamat.setBounds(30,30,130,20);
        getContentPane().add(txalamat);
        txalamat.setBounds(165,30,250,20);
        getContentPane().add(lbltlp);
        lbltlp.setBounds(30,50,130,20);
        getContentPane().add(txtlp);
        txtlp.setBounds(165,50,130,20);
        
        getContentPane().add(lblpesanan);
        lblpesanan.setBounds(30,70,130,20);
        getContentPane().add(BF);
        BF.setBounds(165,70,150,20);
        getContentPane().add(CC);
        CC.setBounds(330,70,150,20);
        getContentPane().add(RV);
        RV.setBounds(165,90,150,20);
        getContentPane().add(RC);
        RC.setBounds(330,90,150,20);
        
        getContentPane().add(lblukuran);
        lblukuran.setBounds(30,120,130,20);
        ukuran.add(lb);
        ukuran.add(de);
        ukuran.add(el);        
        getContentPane().add(lb);
        lb.setBounds (165,120,80,20);
        getContentPane().add(de);
        de.setBounds(255,120,80,20);
        getContentPane().add(el);
        el.setBounds(355,120,80,20);
        
        
        
        getContentPane().add(cetak);
        cetak.setBounds(50,160,300,20);
        getContentPane().add(hasil);
        hasil.setBounds(50,185,300,150);
        setVisible(true);
    }
    
    void AksiReaksi()
    {
        cetak.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                hasil.append("Nama          : "+txnama.getText()+"\n");
                hasil.append("Alamat        : "+txalamat.getText()+"\n");
                hasil.append("No . Telp     : "+txtlp.getText()+"\n");
                
                if(BF.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+BF.getText()+"\n");
                }
                if(CC.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+CC.getText()+"\n");
                }
                if(RV.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+RV.getText()+"\n");
                }
                if(RC.isSelected()==true)
                {
                    hasil.append("Pesanan     : "+RC.getText()+"\n");
                }
                if(lb.isSelected()==true)
                {
                    hasil.append("Ukuran       : "+lb.getText()+"\n");
                }
                if(de.isSelected()==true)
                {
                    hasil.append("Ukuran       : "+de.getText()+"\n");
                }
                if(el.isSelected()==true)
                {
                    hasil.append("Ukuran       : "+el.getText()+"\n");
                }
            }
        });
    }

   
    public static void main(String[] args) {
        
           
    }
    
}
