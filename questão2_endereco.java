public class Endereco {

    String rua, complemento, bairro, cidade, uf, numero, cep;

    public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String uf, String cep){

        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
         }

    public String getEndereco(){
        return  "RUA: "+this.endereco.Rua+"\nNUMERO: "+this.endereco.Numero+"\nCOMPLEMENTO: "+this.endereco.complemento+"\nBAIRRO: "+this.endereco.bairro+"\nCIDADE: "+this.endereco.cidade+"\nUF: "+this.endereco.uf+"\nCEP: "+this.endereco.cep;
    }
}

    }
}
