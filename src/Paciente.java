public class Paciente {
    String nome;
    String endereco;
    String telefone;
    String email;
    String datanasc;
    String sexo;

    public Paciente () {
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setDatanasc(String data){
        this.datanasc = data;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getEmail(){
        return this.email;
    }
    public String getDatanasc(){
        return this.datanasc;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getSexo(){
        return this.sexo;
    }

}
