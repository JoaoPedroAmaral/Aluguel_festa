import java.util.Scanner;

public class principal {
    
    
	public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        Tema tema = new Tema();

        try (Scanner entrada = new Scanner(System.in)) {
            String opcao;
            System.out.println("Iniciando cadastro, me informe seus dados");
            System.out.println("Me informe seu nome, telefone e data de criação de conta");
            System.out.println("ex:\n" +
            "Paulo\n" +
            "(61)98888-888\n" +
            "14/06/2013");
            aluguel.armazenarPessoa(entrada.next(), entrada.next(), entrada.next());
            System.out.println("agora seu logradouro, numero, complemento, cep, uf, cidade e bairro");
            System.out.println("ex:\n" +
            "avenida\n" +
            "858\n" +
            "condominio aleatorio\n" +
            "6500000\n" +
            "DF\n" +
            "ceu azul\n" +
            "bairro nobre");
            aluguel.armazenarEndereco(entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.next());
                 System.out.println("Selecione um tema:\n"
            			+ "1 - Dia das Bruxas\n"
            			+ "2 - Natal\n"
            			+ "3 - Pascoa\n"
            			+ "4 - Super Herois\n"
            			+ "5 - Princesa");
                opcao = entrada.next();
            while (Integer.parseInt(opcao)>5 || Integer.parseInt(opcao)<1) {
                System.out.println("Selevione um valor valido!\n"
                + "1 - Dia das Bruxas\n"
                + "2 - Natal\n"
                + "3 - Pascoa\n"
                + "4 - Super Herois\n"
                + "5 - Princesa");
                opcao = entrada.next();
            }
            switch(opcao){
                case "1":
                    System.out.println("agora a data da festa e o horario de entrada e saida por favor: ");
                    System.out.println("ex:\n" +
                "04/06/2003\n" +
                "18:00\n" +
                "17:00");
                    aluguel.valorAluguel(entrada.next(),entrada.next(),entrada.next());
                    System.out.println("Junto com o tema Dia das Bruxas que vem com: ");
                    tema.diaDasBruxas();
                    System.out.println(tema.toStringDiaDasBruxas());
                    break;
                case "2":
                    System.out.println("agora a data da festa e o horario de entrada e saida por favor: ");
                    System.out.println("ex:\n" +
                "04/06/2003\n" +
                "18:00\n" +
                "17:00");
                    aluguel.valorAluguel(entrada.next(),entrada.next(),entrada.next());
                    System.out.println("Junto com o tema Natal que vem com: ");
                    tema.natal();
                    System.out.println(tema.toStringNatal());
                    break;
                case "3":
                    System.out.println("agora a data da festa e o horario de entrada e saida por favor: ");
                    System.out.println("ex:\n" +
                "04/06/2003\n" +
                "18:00\n" +
                "17:00");
                    aluguel.valorAluguel(entrada.next(),entrada.next(),entrada.next());
                    System.out.println("Junto com o tema Pascoa que vem com: ");
                    tema.pascoa();
                    System.out.println(tema.toStringPascoa());
                    break;
                case "4":
                    System.out.println("agora a data da festa e o horario de entrada e saida por favor: ");
                    System.out.println("ex:\n" +
                "04/06/2003\n" +
                "18:00\n" +
                "17:00");
                    aluguel.valorAluguel(entrada.next(),entrada.next(),entrada.next());
                    System.out.println("Junto com o tema Super Herois que vem com: ");
                    tema.superHerois();
                    System.out.println(tema.toStringherois());
                    break;
                case "5":
                    System.out.println("agora a data da festa e o horario de entrada e saida por favor: ");
                    System.out.println("ex:\n" +
                "04/06/2003\n" +
                "18:00\n" +
                "17:00");
                    aluguel.valorAluguel(entrada.next(),entrada.next(),entrada.next());
                    System.out.println("Junto com o tema Princesas que vem com: ");
                    tema.princesa();
                    System.out.println(tema.toStringPrincesa());
                    break;
            }
            
        }        
    }

}
