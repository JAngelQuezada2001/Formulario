package formulario_2;

public class Alumno {
    String  Nombre;
    String  carrera;
    int     grupo;
    String  semestre;
    double  promedio;

    public Alumno() {
    }

    public Alumno(String Nombre, String carrera, int grupo, String semestre, double promedio) {
        this.Nombre = Nombre;
        this.carrera = carrera;
        this.grupo = grupo;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "alumnos{" + "Nombre=" + Nombre + ", carrera=" + carrera + ", grupo=" + grupo + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
}
