public class Luta {

    public static void main(String[] args){

        Lutador Ryu = new lutador(100, 10, "Ryu");
        Lutador Bison = new Lutador(100, 12, "Bison");

        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);
        Ryu.aplicarGolpe(Bison);

        System.out.println("Energia de "Bison": "Bison.energia);

        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);
        Bison.aplicarGolpe(Ryu);

        System.out.println("Energia de "Ryu": "Ryu.energia);
    }
}
