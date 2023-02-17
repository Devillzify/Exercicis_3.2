package controlador;

import com.mongodb.client.*;
import org.bson.Document;

public class ComBBDD
{
    private String host = "";
    private String port = "";

    private String dbStr = "";
    private String collectionStr = "";

    private MongoClient mongoClient;
    private MongoDatabase db;
    private MongoCollection collection;


    public ComBBDD(String dbStr, String collectionStr, String port, String host)
    {
        this.dbStr = dbStr;
        this.collectionStr = collectionStr;
        this.port = port;
        this.host = host;
    }


    public void abrirConexion()
    {
        mongoClient = MongoClients.create("mongodb://" + host + ":" + port);
        db = mongoClient.getDatabase(dbStr);
        collection = db.getCollection(collectionStr);
    }

    public void verBases()
    {
        abrirConexion();
        MongoIterable<String> resultat = mongoClient.listDatabaseNames();
        for(String s: resultat)
        {
            System.out.println(s);
        }
        cerrarConexion();
    }

    public void verCollection()
    {
        abrirConexion();
        MongoIterable<String> resultat = db.listCollectionNames();
        for(String s: resultat)
        {
            System.out.println(s);
        }
        cerrarConexion();
    }

    public void insertCollection(Document aspirante){
        abrirConexion();
        collection.insertOne(aspirante);
        cerrarConexion();
    }

    public void verCampos()
    {
        abrirConexion();
       MongoCursor<Document> cursor = collection.find().iterator();
       print(cursor);
        cerrarConexion();
    }

    public void cerrarConexion()
    {
        mongoClient.close();
    }

    public static void print(MongoCursor<Document> cursor)
    {
        try{
            while(cursor.hasNext())
            {
                System.out.println(cursor.next().toJson());
            }
        } finally{
            cursor.close();
        }
    }
}
