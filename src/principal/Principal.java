/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author HP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Conexion a la base de datos
	Conexion cn = new Conexion();

        MongoCollection<Document> collection = cn.database.getCollection("categories");

        try {
            for (Document document : collection.find()) {
                System.out.println(document.get("_id") + " " + document.getString("nombre"));
            }
            cn.mongoClient.close();
        } catch (Exception e) {

        }
    }
    
}
