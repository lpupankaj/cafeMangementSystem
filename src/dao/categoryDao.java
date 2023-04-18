/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.category;

/**
 *
 * @author girip
 */
public class categoryDao {
    public static void save(category category ){
        String query="insert into category(name) values('"+category.getName()+"')";
        DbOperations.setDataOrDelete(query,"category Added Sucessfully");
    }
    
    public static ArrayList<category> getAllRecords(){
        ArrayList<category> arrayList=new ArrayList<>();
        try{
            ResultSet rs=DbOperations.getData("select * from category");
            while(rs.next()){
                category category=new category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query="delete from category where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "category Deleted Sucessfully");
        
    }
}
