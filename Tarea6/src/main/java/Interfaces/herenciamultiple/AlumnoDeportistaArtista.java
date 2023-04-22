package Interfaces.herenciamultiple;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private int idActExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numerCuenta, String carrera, double promedio, int idActExtra, String deporte, String arte) {
        super(nombre, edad, numerCuenta, carrera, promedio);
        this.idActExtra = idActExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActExtra() {
        return idActExtra;
    }

    public void setIdActExtra(int idActExtra) {
        this.idActExtra = idActExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "idActExtra=" + idActExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int enseyar(String disciplina) {
        System.out.println("El alumno está ensayando " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + " está presentando su obra");
        return false;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " está entrenando el deporte " + deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " está en competencia del deporte " + deporte);
        return true;
    }
}
