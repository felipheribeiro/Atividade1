public class Post {

    String texto, link; int numeroCurtidas, numeroCompartilhamentos;

    public Post(String texto, String link){

        this.texto = texto;
        this.link = link;
    }

    public void Curtir(){

        this.numeroCurtidas = 1;
    }

    public void Compartilhar(){

        this.numeroCompartilhamentos = 1;
    }
}
