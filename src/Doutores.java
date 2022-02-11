public class Doutores {
    String nome;
    String horario;
    String dia;

    public Doutores (String nome, String horario, String dia){
        this.nome = nome;
        this.horario = horario;
        this.dia = dia;


    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    public String getDia(){
        return dia;
    }
    public void setDia(String dia){
        this.dia = dia;
    }


    public String getDados(){
        return "Nome: "+this.getNome()+"\nHorário: "+this.getHorario()+"\nDia: "+this.getDia();
    }
}
