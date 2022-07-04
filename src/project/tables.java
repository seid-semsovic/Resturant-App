/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author asmir
 */
public class tables {

    public static void main(String[]args){
       
        Connection con = null;
        Statement st = null;
        try{
            con = ConnectionProvider.getCon();
            st= con.createStatement();
            
            st.executeUpdate("create table pica(IDPica int primary key auto_increment,ImeProizvoda varchar(200),Kolicina varchar(200),Cena decimal)");
            st.executeUpdate("create table hrana(IDHrana int primary key auto_increment,ImeProizvoda varchar(200),Kolicina varchar(200),Cena decimal)");
            JOptionPane.showMessageDialog(null,"Kreirali ste Tabele ");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            
            try{
                con.close();
                st.close();
            
        }
        catch(Exception e){
            
        }
            
        }
    }
}
