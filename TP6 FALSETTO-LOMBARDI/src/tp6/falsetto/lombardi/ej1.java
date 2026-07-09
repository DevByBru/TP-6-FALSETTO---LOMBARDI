package tp6.falsetto.lombardi;

public class ej1 {
    public static void main(String[] args) {
       
    }
}


class mascota {
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private int codigo;

    public mascota() {
    }

    public mascota(String nombre, String raza, int edad, double peso, int codigo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void imprimirdatos() {
        System.out.println(this.codigo);
        System.out.println(this.nombre);
        System.out.println(this.raza);
        System.out.println(this.edad);
        System.out.println(this.peso);
    }
}