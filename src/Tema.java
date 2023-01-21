import java.util.Arrays;

public class Tema {
    private String nomeB;
    private Double valorAluguelB;
    private String corToalhaB;
    private String nomeN;
    private Double valorAluguelN;
    private String corToalhaN;
    private String nomeP;
    private Double valorAluguelP;
    private String corToalhaP;
    private String nomeH;
    private Double valorAluguelH;
    private String corToalhaH;
    private String nomePR;
    private Double valorAluguelPR;
    private String corToalhaPR;
    ItemTema itens = new ItemTema();

    public void diaDasBruxas(){
        nomeB = "Dia das Bruxas";
        valorAluguelB = 168.00;
        corToalhaB = "Roxo";
    }

    public void natal(){
        nomeN = "Natal";
        valorAluguelN = 180.00;
        corToalhaN = "Vermelho";
        itens.getNatalItens();
        
    }

    public void pascoa(){
        nomeP = "Pascoa";
        valorAluguelP = 120.00;
        corToalhaP = "Branco";
        itens.getPascoaItens();
    }

    public void superHerois(){
        nomeH = "Super Herois";
        valorAluguelH = 140.00;
        corToalhaH = "Vermelho e Azul";
        itens.getSuperHeroisItens();
    }

    public void princesa(){
        nomePR = "Princesas";
        valorAluguelPR = 180.00;
        corToalhaPR = "Azul com gliter";
        itens.getPrincesaItens();
    }

    public String toStringDiaDasBruxas(){
        return "Nome: " +  this.nomeB + "   " + " valor do Aluguel: "+ this.valorAluguelB + "   " + "Cor da toalha: " + this.corToalhaB + "   " + "Itens que o acompanha: " + Arrays.toString(itens.getDiaDasBruxasItens());
    }
    public String toStringNatal(){
        return "Nome: " +  this.nomeN + "   " + " valor do Aluguel: "+ this.valorAluguelN + "   " + "Cor da toalha: " + this.corToalhaN + "   " + "Itens que o acompanha: " + Arrays.toString(itens.getNatalItens());
    }
    public String toStringPascoa(){
        return "Nome: " +  this.nomeP + "   " + " valor do Aluguel: "+ this.valorAluguelP + "   " + "Cor da toalha: " + this.corToalhaP + "   " + "Itens que o acompanha: " + Arrays.toString(itens.getPascoaItens());
    }
    public String toStringherois(){
        return "Nome: " +  this.nomeH + "   " + " valor do Aluguel: "+ this.valorAluguelH + "   " + "Cor da toalha: " + this.corToalhaH + "   " + "Itens que o acompanha: " + Arrays.toString(itens.getSuperHeroisItens());
    }
    public String toStringPrincesa(){
        return "Nome: " +  this.nomePR + "   " + " valor do Aluguel: "+ this.valorAluguelPR + "   " + "Cor da toalha: " + this.corToalhaPR + "   " + "Itens que o acompanha: " + Arrays.toString(itens.getPrincesaItens());
    }
}
