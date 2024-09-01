package AbstractFactory;

import Factory.*;
import Models.Coxinha;
import Models.Empada;
import Models.Salgado;

public class SalgadosFactory {
    private SalgadoIngredientesFactory ingredientes;
    private Salgado salgadinho;

    public void assarSalgado(String tipo, String regiao) {
        if (tipo.equalsIgnoreCase("coxinha")) {
            ingredientes = getIngredientesCoxinha(regiao);
            salgadinho = new Coxinha(ingredientes);
        } else if (tipo.equalsIgnoreCase("empada")) {
            ingredientes = getIngredientesEmpada(regiao);
            salgadinho = new Empada(ingredientes);
        } else {
            throw new IllegalArgumentException("Tipo de salgado desconhecido: " + tipo);
        }
    }

    public SalgadoIngredientesFactory getIngredientesCoxinha(String regiao) {
        if (regiao.equalsIgnoreCase("Goias")) {
            return new GoiasCoxinhaIngredientesFactory();
        } else if (regiao.equalsIgnoreCase("Ceara")) {
            return new CearaCoxinhaIngredientesFactory();
        } else {
            throw new IllegalArgumentException("Região desconhecida: " + regiao);
        }
    }

    public SalgadoIngredientesFactory getIngredientesEmpada(String regiao) {
        if (regiao.equalsIgnoreCase("Goias")) {
            return new GoiasEmpadaIngredientesFactory();
        } else if (regiao.equalsIgnoreCase("Ceara")) {
            return new CearaEmpadaIngredientesFactory();
        } else {
            throw new IllegalArgumentException("Região desconhecida: " + regiao);
        }
    }

    public Salgado getSalgadinho() {
        return salgadinho;
    }

    @Override
    public String toString() {
        if (salgadinho != null) {
            return "Massa: " + salgadinho.getMassa() + "\n" +
                    "Molho: " + salgadinho.getMolho() + "\n" +
                    "Recheio: " + salgadinho.getRecheio();
        } else {
            return "Nenhum salgado foi preparado.";
        }
    }
}
