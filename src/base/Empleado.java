package base;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {

    private int cedula;
    private String nombre;
    private String apellido;
    private char genero;
    private LocalDate fechaNac; // Cambio: Se inicializa en el constructor
    private String email;
    private double salario;
    private double porcComision;

    public Empleado(int cedula, String nombre, String apellido, char genero, LocalDate fechaNac,
            String email, double salario, double porcComision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNac = fechaNac; // Se inicializa aquí
        this.email = email;
        this.salario = salario;
        this.porcComision = porcComision;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPorcComision() {
        return porcComision;
    }

    public void setPorcComision(double porcComision) {
        this.porcComision = porcComision;
    }

    public String getCedulaFormateada() {

        String cedulaStr = String.valueOf(cedula);
        return cedulaStr.substring(0, 3) + "-" + cedulaStr.substring(3);
    }

    public String getGeneroTexto() {

        return genero == 'M' ? "Mujer" : "Hombre";
    }

    public String getFechaNacFormateada() {
        if (fechaNac != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return fechaNac.format(formatter);
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return "Empleado{"
                + "cedula='" + getCedulaFormateada() + '\''
                + ", nombre='" + nombre + '\''
                + ", apellido='" + apellido + '\''
                + ", genero=" + getGeneroTexto()
                + ", fechaNac=" + getFechaNacFormateada()
                + ", email='" + email + '\''
                + ", salario=" + salario
                + ", porcComision=" + porcComision
                + '}';
    }
}
