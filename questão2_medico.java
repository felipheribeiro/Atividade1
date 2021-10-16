public class Medico {

    int codigo; String nome, sexo, especialidade; endereco;

    public Medico(int cod, String nome, String sexo, String especialidade, String endereco){

        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
       }

    public String getEndereco(){
        return  "RUA: "+this.endereco.Rua+"\nNUMERO: "+this.endereco.Numero+"\nCOMPLEMENTO: "+this.endereco.complemento+"\nBAIRRO: "+this.endereco.bairro+"\nCIDADE: "+this.endereco.cidade+"\nUF: "+this.endereco.uf+"\nCEP: "+this.endereco.cep;
        
    }
}
