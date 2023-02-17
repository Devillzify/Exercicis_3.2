package mongodb;

import controlador.ComBBDD;
import dades.Aspirant;
import org.bson.Document;

public class ProversIniciacio
{
    public static void main(String[] args)
    {
        ComBBDD conexion = new ComBBDD("PracticaDB","Aspirants","27017","localhost");
       // conexion.verBases();
       // conexion.verCollection();

       // Aspirant a1 = new Aspirant("433333","toniete","marmol","00888");
     //   System.out.println(a1.toMap());
       // conexion.insertCollection(new Document(a1.toMap()));

        conexion.verCampos();
    }
}
