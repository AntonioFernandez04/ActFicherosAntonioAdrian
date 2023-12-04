import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorFicheros implements Serializable {
    public void guardarLibrosBinario(List<Libro> libros, String
            filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new
                FileOutputStream(filename))) {
            oos.writeObject(libros);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void leerLibrosBinario(String filename) {
// Implementar la lectura de ficheros binarios

        try {
            ObjectInputStream ois =new ObjectInputStream(new FileInputStream(filename));
            ArrayList<Libro> libros= (ArrayList<Libro>) ois.readObject();
            ois.close();
            for (Libro libro: libros){
                System.out.println("id: " +libro.getId());
                System.out.println("Titulo: " +libro.getTitulo());
                System.out.println("Autor: " +libro.getAutor());
                System.out.println("Anio de Publicacion: " +libro.getAnioPublicacion());
                System.out.println("Genero : " +libro.getGenero());

            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
// Métodos para manejar otros tipos de ficheros

    public static void crearLibro(String filename) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libros.bin"));
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el ID del libro:");
            int id= sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca el Título del libro:");
            String titulo= sc.nextLine();

            System.out.println("Introduzca el Autor del libro:");
            String autor=sc.nextLine();

            System.out.println("Introduzca el Anio de publicacion del libro:");
            int aniopublicacion = sc.nextInt();
            sc.nextLine();

            System.out.println("Introduzca el Género del libro:");
            String genero= sc.nextLine();

            Libro libro= new Libro(id,titulo,autor,aniopublicacion,genero);
            oos.writeObject(libro);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}