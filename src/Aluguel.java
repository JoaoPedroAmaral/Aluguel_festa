import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    Tema tema = new Tema();
    Double valorAluguel;
    private List<Cliente> agendaCliente = new ArrayList<Cliente>();
    private List<Endereco> enderecoCliente = new ArrayList<Endereco>();
    private Date dataFesta;
    private Time horarioInicio;
    private Time horarioFim;


    public void armazenarPessoa(String nome, String telefone, String dataCriacao){
        agendaCliente.add(new Cliente(nome, telefone, dataCriacao));
    }

    public void armazenarEndereco(String logradouro, String numero, String complemento, String cep, String uf, String cidade, String bairro){
        enderecoCliente.add(new Endereco(logradouro, numero, complemento, cep, uf, cidade, bairro));
    }


    public void valorAluguel(String dataFesta, String horarioInicio, String horarioFim){
        enderecoCliente.forEach(valor -> {
            int tamanho = agendaCliente.get(0).getDataCriacao().length();
            System.out.println(horarioFim.substring(0, 2));
            switch(horarioInicio.substring(0, 2)){
                case "15":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 84.99;
                    break;
                    case "RJ":
                        valorAluguel = 70.99;
                    break;
                    case "SP":
                        valorAluguel = 70.99;
                    break;
                    case "SC":
                        valorAluguel = 65.99;
                    break;
                    case "PR":
                        valorAluguel = 65.99;
                        break;
                    default:
                        valorAluguel = 68.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;

                case "14":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 84.99;
                    break;
                    case "RJ":
                        valorAluguel = 70.99;
                    break;
                    case "SP":
                        valorAluguel = 70.99;
                    break;
                    case "SC":
                        valorAluguel = 65.99;
                    break;
                    case "PR":
                        valorAluguel = 65.99;
                        break;
                    default:
                        valorAluguel = 68.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;

                case "19":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 104.99;
                    break;
                    case "RJ":
                        valorAluguel = 90.99;
                        tema.diaDasBruxas();
                    break;
                    case "SP":
                        valorAluguel = 90.99;
                    break;
                    case "SC":
                        valorAluguel = 85.99;
                    break;
                    case "PR":
                        valorAluguel = 85.99;
                        break;
                    default:
                        valorAluguel = 88.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;
                case "20":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 104.99;
                    break;
                    case "RJ":
                        valorAluguel = 90.99;
                        tema.diaDasBruxas();
                    break;
                    case "SP":
                        valorAluguel = 90.99;
                    break;
                    case "SC":
                        valorAluguel = 85.99;
                    break;
                    case "PR":
                        valorAluguel = 85.99;
                        break;
                    default:
                        valorAluguel = 88.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;
                case "21":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 104.99;
                    break;
                    case "RJ":
                        valorAluguel = 90.99;
                        tema.diaDasBruxas();
                    break;
                    case "SP":
                        valorAluguel = 90.99;
                    break;
                    case "SC":
                        valorAluguel = 85.99;
                    break;
                    case "PR":
                        valorAluguel = 85.99;
                        break;
                    default:
                        valorAluguel = 88.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;
                case "22":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 104.99;
                    break;
                    case "RJ":
                        valorAluguel = 90.99;
                        tema.diaDasBruxas();
                    break;
                    case "SP":
                        valorAluguel = 90.99;
                    break;
                    case "SC":
                        valorAluguel = 85.99;
                    break;
                    case "PR":
                        valorAluguel = 85.99;
                        break;
                    default:
                        valorAluguel = 88.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;
                case "23":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 104.99;
                    break;
                    case "RJ":
                        valorAluguel = 90.99;
                        tema.diaDasBruxas();
                    break;
                    case "SP":
                        valorAluguel = 90.99;
                    break;
                    case "SC":
                        valorAluguel = 85.99;
                    break;
                    case "PR":
                        valorAluguel = 85.99;
                        break;
                    default:
                        valorAluguel = 88.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;
                case "00":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 104.99;
                    break;
                    case "RJ":
                        valorAluguel = 90.99;
                        tema.diaDasBruxas();
                    break;
                    case "SP":
                        valorAluguel = 90.99;
                    break;
                    case "SC":
                        valorAluguel = 85.99;
                    break;
                    case "PR":
                        valorAluguel = 85.99;
                        break;
                    default:
                        valorAluguel = 88.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;
                case "01":
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 104.99;
                    break;
                    case "RJ":
                        valorAluguel = 90.99;
                        tema.diaDasBruxas();
                    break;
                    case "SP":
                        valorAluguel = 90.99;
                    break;
                    case "SC":
                        valorAluguel = 85.99;
                    break;
                    case "PR":
                        valorAluguel = 85.99;
                        break;
                    default:
                        valorAluguel = 88.99;
                    break;
                }
    
                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break; 
                default:
                switch(valor.getUf().toString()){
                    case "DF":
                        valorAluguel = 92.99;
                    break;
                    case "RJ":
                        valorAluguel = 80.99;
                    break;
                    case "SP":
                        valorAluguel = 75.99;
                    break;
                    case "SC":
                        valorAluguel = 65.99;
                    break;
                    case "PR":
                        valorAluguel = 55.99;
                        break;
                    default:
                        valorAluguel = 78.99;
                    break;
                }

                switch(agendaCliente.get(0).getDataCriacao().substring(tamanho-4, tamanho)){
                    case "2014":
                        System.out.printf("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-30));
                        break;
                    case "2015":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-25));
                        break;
                    case "2016":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    case "2017":
                        System.out.println("O valor do aluguel ficou: R$" + valorAluguel + " porem você ganhou uma promoção!! agora está por: R$" + (valorAluguel-20));
                        break;
                    default:
                    System.out.println("O valor do aluguel ficou: R$" + valorAluguel);
                    break;
                }
                break;

            }
            

        });

    }


}


