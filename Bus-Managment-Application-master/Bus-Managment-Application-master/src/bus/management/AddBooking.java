/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTable;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author kamlesh
 */
public class AddBooking extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBooking
     */
    String luser;
    public AddBooking(String loginuser) {
        initComponents();
        busSourceCBFillData();
        busDestinationCBFillData();
        
        this.luser=loginuser;
        
    }
    public void busSourceCBFillData()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/busm";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
//            Class.forName("com.mysql.jdbc.Driver");
//            String databaseURL = "jdbc:mysql://localhost:3306/busm";
//            Connection con = DriverManager.getConnection(databaseURL, "root", "");
//            Statement stat = con.createStatement();
            Statement stat = con.createStatement();    
            String selectQuery="select distinct(bus_source) as bus_source from bus_details";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next())
            {
                sourceCB.addItem(rs.getString("bus_source"));
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void busDestinationCBFillData()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/busm";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();    
            String selectQuery="select distinct(bus_dest) as bus_dest  from bus_details";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next())
            {
                destinationCB.addItem(rs.getString("bus_dest"));
                
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        sourceCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        destinationCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        booking_user = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Journey_date = new com.toedter.calendar.JDateChooser();
        jTextField4 = new javax.swing.JTextField();
        bus_no = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        first_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        seat = new javax.swing.JTextField();
        paid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        Id_No = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Add Booking");

        jLabel1.setText("Source");

        sourceCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceCBActionPerformed(evt);
            }
        });

        jLabel2.setText("Destination");

        destinationCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Starting From");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Search Result.........");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fill Booking Details From Above Details..");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Add Booking Info_");

        jLabel7.setText("Upto");

        jTextField1.setText("Booking User");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.setText("Journey Date");

        jTextField4.setText("Bus No.");

        jTextField6.setText("Seat");

        jTextField8.setText("First Name");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setText("Last Name");

        jButton2.setText("Paid");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.setText("User ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(destinationCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sourceCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(first_name)
                                        .addComponent(booking_user, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Journey_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bus_no)
                                    .addComponent(seat))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paid)
                            .addComponent(Id_No, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(131, 131, 131))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(sourceCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(destinationCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel6)))
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(booking_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Journey_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bus_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String source=(String)sourceCB.getSelectedItem();
        String destination=(String)destinationCB.getSelectedItem();
        java.util.Date fromDate=jDateChooser1.getDate();
        java.util.Date toDate=jDateChooser2.getDate();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String fromDateFormated=sdf.format(fromDate);
        String toDateFormated=sdf.format(toDate);
 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/busm";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();    
            String selectQuery = "select * from bus_details where bus_source='"+source+"' and bus_dest='"+destination+"' and depart_date between '"+fromDateFormated+"' and '"+toDateFormated+"'";
            ResultSet rs=stat.executeQuery(selectQuery);
         
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
//        int index =jTable1.getSelectedRow();
//        TableModel model=jTable1.getModel();
//        String bus_no=(String) model.getValueAt(index, 1);
//        String movement=(String) model.getValueAt(index, 2);
//        String bus_source=(String) model.getValueAt(index, 3);
//        String bus_dest=(String) model.getValueAt(index, 4);
//        String depart_date=model.getValueAt(index, 5).toString();  
//        String depart_time=(String) model.getValueAt(index, 6);
//        String price=(String) model.getValueAt(index, 7);
//        String avail_seat=(String) model.getValueAt(index, 8);
//        
//        
//        BookingFormFrame=new JFrame();
//        BookingFormPanel=new JPanel();
//        gl=new GridLayout(0,4);
//        l1=new JLabel("Bus No");
//        l11=new JLabel(bus_no);
//        l2=new JLabel("Movement");
//        l12=new JLabel(movement);
//        l3=new JLabel("Bus Source");
//        l13=new JLabel(bus_source);
//        l4=new JLabel("Bus Dest");
//        l14=new JLabel(bus_dest);
//        l5=new JLabel("Depart Date");
//        l15=new JLabel(depart_date);
//        l6=new JLabel("Depart Time");
//        l16=new JLabel(depart_time);
//        l7=new JLabel("Price/seat");
//        l17=new JLabel(price);
//        l8=new JLabel("Available Seat");
//        l18=new JLabel(avail_seat);
//        seatnoL=new JLabel("Seat No");
//        idnoL=new JLabel("ID No.");
//        fnameL=new JLabel("First Name");
//        lnameL=new JLabel("Last Name");
//        t1=new JTextField(20);
//        t2=new JTextField(20);
//        t3=new JTextField(20);
//        t4=new JTextField(20);
//        
//        BookingFormFrame.getContentPane().add(BookingFormPanel);
//        BookingFormPanel.setLayout(gl);
//        
//        BookingFormPanel.add(l1);
//        BookingFormPanel.add(l11);
//        BookingFormPanel.add(l2);
//        BookingFormPanel.add(l12);
//        BookingFormPanel.add(l3);
//        BookingFormPanel.add(l13);
//        BookingFormPanel.add(l4);
//        BookingFormPanel.add(l14);
//        BookingFormPanel.add(l5);
//        BookingFormPanel.add(l15);
//        BookingFormPanel.add(l6);
//        BookingFormPanel.add(l16);
//        BookingFormPanel.add(l7);
//        BookingFormPanel.add(l17);
//        BookingFormPanel.add(l8);
//        BookingFormPanel.add(l18);
//        
//        BookingFormPanel.add(seatnoL);
//        BookingFormPanel.add(t1);
//        BookingFormPanel.add(idnoL);
//         BookingFormPanel.add(t2);
//        BookingFormPanel.add(fnameL);
//         BookingFormPanel.add(t3);
//        BookingFormPanel.add(lnameL);
//         BookingFormPanel.add(t4);
//        
//       int result = JOptionPane.showConfirmDialog(BookingFormFrame,BookingFormPanel,"Booking Form",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
//        if(result==JOptionPane.OK_OPTION)
//        {
//            String booking_user=luser;
//            String seatno=t1.getText();
//            String idno=t2.getText();
//            String first_tname=t3.getText();
//            String last_name=t4.getText();
//            try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            String databaseURL = "jdbc:mysql://localhost:3306/busm";
//            Connection con = DriverManager.getConnection(databaseURL, "root", "");
//            Statement stat = con.createStatement();    
//            String selectQuery = "select * from bus_booking where bus_no ='"+bus_no+"' and journey_date='"+depart_date+"' and booking_user='"+booking_user+"' and id_no='"+idno+"'";
//            System.out.println(selectQuery);
//            ResultSet rs=stat.executeQuery(selectQuery);
//         //   System.out.println(rs.next());
//           if(rs.next())
//           {
//             infoMessage("Already Booked", "ALert !!");
//            
//           }
//           else
//           {
//          String insertQuery = "insert into bus_booking values(null,'" + booking_user + "','" +depart_date  + "','" + bus_no + "','" + seatno + "','" + idno + "','" + first_tname + "','" + last_name + "')";
//           
//         int i= stat.executeUpdate(insertQuery);
//         if(i==1)
//         {
//           
//           int remaining_seat=Integer.parseInt(avail_seat)-Integer.parseInt(seatno);
//           
//           String updateQuery="update bus_details set total_seat='"+remaining_seat+"' where bus_no='"+bus_no+"' and movement='"+movement+"' and depart_date='"+depart_date+"'";
//           int j=stat.executeUpdate(updateQuery);
//           if(j==1)
//           {
//               
//        String source=(String)sourceCB.getSelectedItem();
//        String destination=(String)destinationCB.getSelectedItem();
//        java.util.Date fromDate=jDateChooser1.getDate();
//        java.util.Date toDate=jDateChooser2.getDate();
//        
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        String fromDateFormated=sdf.format(fromDate);
//        String toDateFormated=sdf.format(toDate);   
//           infoMessage("Booking Done", "Alert !!");
//           
//             String selectQuery1 = "select * from bus_details where bus_source='"+source+"' and bus_dest='"+destination+"' and depart_date between '"+fromDateFormated+"' and '"+toDateFormated+"'";
//            ResultSet rs1=stat.executeQuery(selectQuery1);
//         
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
//            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//           
//           }
//         }
//          
//               
//           
//        }
//        }
//        catch(Exception e)
//                {
//                    System.out.println(e);
//                }
//            
//        }
     
        
       
             
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void destinationCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationCBActionPerformed

    private void sourceCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceCBActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed
    
    public void clearFieldValue()
 {
     bus_no.setText("");
     seat.setText("");
     paid.setText("");
 }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String Booking_User=booking_user.getText();

       String First_Name=first_name.getText();
       String Bus_No=bus_no.getText();
       String Last_Name=last_name.getText();
       String Paid=paid.getText();
       String id_no=Id_No.getText();
       String Seat=seat.getText();
              java.util.Date departDateD= Journey_date.getDate();
             SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
       String departDate = oDateFormat.format(departDateD);
       
        
        try
        {
        
             Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/busm";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();    
            String selectQuery = "select * from bus_booking where id_no='"+Id_No+"'";
            
            ResultSet rs=stat.executeQuery(selectQuery);
         
           if(rs.next()==true)
           {
             infoMessage("Already Booked", "Create Fresh Entry !!");
             clearFieldValue();
           }
           else
           {
          String insertQuery = "insert into bus_booking values(null,'" + Booking_User + "','" + departDate + "','" + Bus_No + "','" + Seat + "','" + Paid + "','" + id_no + "','" + First_Name + "','" + Last_Name + "')";
                                                                                // First_Name  Bus_No  Last_Name  Paid  Seat  departDateD   id_no
          stat.executeUpdate(insertQuery);
          infoMessage("Bus Booked", "Yahhh !!");
          clearFieldValue();
            
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    GridLayout gl;    
    public JFrame BookingFormFrame;
    public JPanel BookingFormPanel;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11,l12,l13,l14,l15,l16,l17,l18,seatnoL,idnoL,fnameL,lnameL;
    public JComboBox seatCB;
    public JTextField t1,t2,t3,t4;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id_No;
    private com.toedter.calendar.JDateChooser Journey_date;
    private javax.swing.JTextField booking_user;
    private javax.swing.JTextField bus_no;
    private javax.swing.JComboBox<String> destinationCB;
    private javax.swing.JTextField first_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField seat;
    private javax.swing.JComboBox<String> sourceCB;
    // End of variables declaration//GEN-END:variables
}
