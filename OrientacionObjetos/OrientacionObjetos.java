public class OrientacionObjetos {
    public static void main(String[] args){
        Autor autor= new Autor();
        autor.setNombre("Pedrito");
        autor.setApellido("Sola");
        autor.setEdad(75);
    }

    Libro libro = new Libro();
    libro.setAutor(autor);
    libro.setTitulo("Persepolis");
    libro.setNumeroPaginas(368);
}

System.out.println("Libro:" + libro.getTitulo());
System.out.println("Autor:"+libro.getAutor().getNombre()+""+libro.getAutor().getApellido());
