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

        MongoCollection<Document> collection = cn.database.getCollection("cursos");

        try {
            for (Document document : collection.find()) {
                // .get -> ObjectID, .getString -> string, .getInteger -> int32
                // "_id" -> ObjectId, "nombre" -> string, "cantAlumnos" -> int32
                System.out.print("id: "+document.get("_id") + ", curso:" + document.getString("nombre"));
                System.out.println(", horario: "+document.getString("horario")+", Cant. Alumnos: "+document.getInteger("cantAlumnos"));
            }
            cn.mongoClient.close();
        } catch (Exception e) {

        }
    }
    
}
