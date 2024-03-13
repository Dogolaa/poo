package episodio1;

import java.security.spec.RSAOtherPrimeInfo;

public class testeHospede {

    public static void main(String[] args) {

       Hospede rodrigo = new Hospede();
       rodrigo.setNome("Rodrigo");
       rodrigo.setSobrenome("Pagliares");

        System.out.println("Nome ...: " + rodrigo.getNome() );
        System.out.println("Sobrenome ...: " + rodrigo.getSobrenome() );

        Hospede mariana = new Hospede();
        mariana.setNome("Mariana");
        mariana.setSobrenome("Pereira");

        System.out.println("Nome ...: " + mariana.getNome() );
        System.out.println("Sobrenome ...: " + mariana.getSobrenome() );

    }

}
