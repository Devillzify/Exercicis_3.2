package dades;

import java.util.HashMap;
import java.util.Objects;

public class Aspirant
{
    String nif = "";
    String nom = "";
    String llinatges = "";
    String codigoPostal = "";

    public Aspirant(String nif, String nom, String llinatges, String codigoPostal)
    {
        this.nif = nif;
        this.nom = nom;
        this.llinatges = llinatges;
        this.codigoPostal = codigoPostal;
    }

    public String getNif()
    {
        return nif;
    }

    public void setNif(String nif)
    {
        this.nif = nif;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getLlinatges()
    {
        return llinatges;
    }

    public void setLlinatges(String llinatges)
    {
        this.llinatges = llinatges;
    }

    public String getCodigoPostal()
    {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal)
    {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString()
    {
        return "Aspirant: \n" +
                "nif: " + nif + " || " +
                "nom: " + nom + " || " +
                "llinatges: " + llinatges + " || " +
                "codigoPostal: " + codigoPostal + "\n";
    }


    public HashMap<String, Object> toMap()
    {
        HashMap<String,Object> aspirtanteTransformado = new HashMap<>();
        aspirtanteTransformado.put("nif",this.nif);
        aspirtanteTransformado.put("nom",this.nom);
        aspirtanteTransformado.put("llinatges",this.llinatges);
        aspirtanteTransformado.put("codigoPostal",this.codigoPostal);
        return aspirtanteTransformado;
    }


}
