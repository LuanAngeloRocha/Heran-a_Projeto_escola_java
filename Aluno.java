public class Aluno extends Pessoa{

    private String cursos;
    private double notas;

    public void setCursos(String cursos){
        this.cursos = cursos;
    
    }
    public String getCursos(){
        return this.cursos;
    
    }
    public void setNotas(Double notas){
        this.notas= notas;
    
    }
    public double getNotasString(){
        return this.notas;


    
    }
    public double calculaMedia(){
        return this.notas;
    }
    public boolean verificaaprovado(){
        boolean condicao;

        if(this.notas<6){
            condicao = false;
        }else{
            condicao = true;

        }
        return condicao;
    }
}