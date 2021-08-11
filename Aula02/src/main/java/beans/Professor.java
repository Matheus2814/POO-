package beans;

//@author Matheus Machado

public class Professor extends Pessoa{
    
    private String matricula;
    private String titulo;
    private String area;

    public Professor(String matricula, String titulo, String area, String RG, String nome, String email) {
        super(RG, nome, email);
        this.matricula = matricula;
        this.titulo = titulo;
        this.area = area;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Professor{" + "RG: " + RG + ", nome: " + nome + ", email: " + email + 
                ", matricula: " + matricula + ", titulo: " + titulo + ", area: " + area + '}';
    }
    
    
    
    
}
