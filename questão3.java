public class Lutador {

    int energia, forca; String nome; static int golpe; 

    public Lutador(int nome, int energia, String forca) {

        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }
    public void aplicarGolpe(Lutador nmr1){
        golpe = this.forca;
        nmr1.reduzirEnergia();
    }
    public void reduzirEnergia(){
       this.energia = golpe;
    }
}
