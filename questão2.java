public Medico {

    public static void main(String[] args) {

        Endereco ende = new ende("Rua Aloísio de Castro'Ao lado da praça'", "613", "Centro", "Monte Santo", "BA", "48800000");

        Medico med = new med(01, "Celso Andrade Moraes", "Masculino", "Cirurgião", ende);

        System.out.println("Codigo: " + med01.codigo);
        System.out.println("Nome: " + med01.nome);
        System.out.println("Sexo: " + med01.sexo);
        System.out.println("Especialidade: " + med1.especialidade);
        System.out.println("\nEndereco:\n"+med1.getEndereco());

        ende.numero = "295";
        ende.cep = "48800000";
        ende.rua = "Rua Das Flores";
        ende.complemento = "Ao lado da Igreja";
        ende.bairro = "Centro";
        ende.cidade = "Monte Santo";
        ende.uf = "BA";

        med02.codigo = 02;
        med02.nome = "Evanice de Souza Silva";
        med02.sexo = "Feminino";
        med02.especialidade = "Cardiologista";
        med02.endereco = "Rua das Flores";

        System.out.println("Codigo: " + med02.codigo);
        System.out.println("Nome: " + med02.nome);
        System.out.println("Sexo: " + med02.sexo);
        System.out.println("Especialidade: " + med02.especialidade);
        System.out.println("\nEndereco:\n"+med02.getEndereco());
    }
}
