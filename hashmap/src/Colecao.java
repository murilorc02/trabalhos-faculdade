import java.util.ArrayList;
import java.util.HashMap;

public class Colecao {
    
    HashMap<Marca, ArrayList<Veiculo>> colecao = new HashMap<Marca, ArrayList<Veiculo>>();

    public Colecao() {
        this.colecao.put(Marca.Volkswagen, new ArrayList<Veiculo>());
        this.colecao.get(Marca.Volkswagen).add(new Veiculo("Polo", 2010));
        this.colecao.get(Marca.Volkswagen).add(new Veiculo("Voyage", 2013));
        this.colecao.get(Marca.Volkswagen).add(new Veiculo("Gol CL", 1995));
        this.colecao.get(Marca.Volkswagen).add(new Veiculo("Jetta", 2012));
        this.colecao.get(Marca.Volkswagen).add(new Veiculo("Gol G3", 2008));

        this.colecao.put(Marca.Ford, new ArrayList<Veiculo>());
        this.colecao.get(Marca.Ford).add(new Veiculo("Fiesta", 2009));
        this.colecao.get(Marca.Ford).add(new Veiculo("Focus", 2012));
        this.colecao.get(Marca.Ford).add(new Veiculo("Ka", 2013));
        this.colecao.get(Marca.Ford).add(new Veiculo("Ka", 2005));
        this.colecao.get(Marca.Ford).add(new Veiculo("Mustang", 2014));

        this.colecao.put(Marca.Chevrolet, new ArrayList<Veiculo>());
        this.colecao.get(Marca.Chevrolet).add(new Veiculo("Impala", 1967));
        this.colecao.get(Marca.Chevrolet).add(new Veiculo("Camaro", 2010));
        this.colecao.get(Marca.Chevrolet).add(new Veiculo("Camaro", 2020));
        this.colecao.get(Marca.Chevrolet).add(new Veiculo("Onix", 2012));
        this.colecao.get(Marca.Chevrolet).add(new Veiculo("Onix Joy", 2020));

        this.colecao.put(Marca.Nissan, new ArrayList<Veiculo>());
        this.colecao.get(Marca.Nissan).add(new Veiculo("Silvia S15", 1964));
        this.colecao.get(Marca.Nissan).add(new Veiculo("350z", 2005));
        this.colecao.get(Marca.Nissan).add(new Veiculo("Sentra", 1982));
        this.colecao.get(Marca.Nissan).add(new Veiculo("Sentra", 2004));
        this.colecao.get(Marca.Nissan).add(new Veiculo("March", 2011));
    }

    public void addVeiculoMarca(String nomeV, int ano, Marca marca){
        try {
            this.colecao.get(marca).add(new Veiculo(nomeV, ano));
            System.out.println("Veiculo adicionado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro inesperado");
        }
    }

    public void filtro (Marca marca, String modelo) {
        for (int i = 0; i < colecao.get(marca).size(); i++) {
            if (colecao.get(marca).get(i).getModelo().toUpperCase().contains(modelo.toUpperCase())) {
                System.out.println(marca + " " + colecao.get(marca).get(i));
            }
        }
    }

    public void mostrarTodos(){
        colecao.forEach((m, v) ->{
            System.out.println(m + " " + v);
        });
    }
}