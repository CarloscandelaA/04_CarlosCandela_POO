public class ClasePersona {
    // Atributos
    private String nombre;
    private int edad;
    private double altura;

    public ClasePersona() {

    }

    public ClasePersona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Metodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    public void saludar(String saludo) {
        System.out.println(saludo + ", soy " + nombre);
    }

    public void saludar(String saludo, String persona) {
        System.out.println(saludo + ", " + persona + ", soy " + nombre);
    }

    public int calcularEdadEnDias() {
        return edad * 365;
    }

    public double convertirAlturaAMetros() {
        return altura / 100;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Metodos con parametros y argumentos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    // Objetos
    public static void main(String[] args) {
        ClasePersona persona1 = new ClasePersona("Juan", 25, 175.5);
        ClasePersona persona2 = new ClasePersona();

        persona2.setNombre("Carlos");
        persona2.setEdad(30);

        persona1.saludar();
        persona2.saludar("Buenos días");
        
        System.out.println("Edad en días: " + persona1.calcularEdadEnDias());
        System.out.println("Altura en metros: " + persona2.convertirAlturaAMetros());
        System.out.println("¿Es mayor de edad? " + persona1.esMayorDeEdad());
    }
}
