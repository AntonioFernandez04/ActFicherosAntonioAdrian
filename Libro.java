import java.io.*;
import java.util.Scanner;

public class Libro extends GestorFicheros {
    private static final long serialVersionUID = 1820040950097978031L; // Puedes definir tu propio valor

    private int id;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
// Constructor, getters y setters

    public Libro(int id, String titulo, String autor, int anioPublicacion, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
    }

    public Libro() {
        id = 0;
        titulo = "";
        autor = "";
        anioPublicacion = 0000;
        genero = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }





}