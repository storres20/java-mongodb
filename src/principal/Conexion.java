/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author HP
 */
public class Conexion {
    MongoClient mongoClient;
    MongoDatabase database;

    public Conexion() {
        try {
            ConnectionString connString = new ConnectionString("mongodb+srv://demo:2ZS91XrwfQqNbFyU@cluster0.8kaczfr.mongodb.net");
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connString)
                    .retryWrites(true)
                    .build();
            mongoClient = MongoClients.create(settings);
            database = mongoClient.getDatabase("pacientes");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
