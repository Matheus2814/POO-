package beans;

//@author Matheus Machado

public class Aluno extends Pessoa{
    
    private String RA;
    private String curso;
    private String semestre;

    public Aluno(String RA, String curso, String semestre, String RG, String nome, String email) {
        super(RG, nome, email);
        this.RA = RA;
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Aluno{" + "RG: " + RG + ", nome: " + nome + ", email: " + email +
                ", RA: " + RA + ", curso: " + curso + ", semestre: " + semestre + '}';
    }
    
}
