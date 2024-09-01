package Models;

import Factory.SalgadoIngredientesFactory;

public abstract class Salgado {
    protected String massa;
    protected String molho;
    protected String recheio;
    protected SalgadoIngredientesFactory ingredientes;

    public Salgado(SalgadoIngredientesFactory ingredientes) {
        this.ingredientes = ingredientes;
        this.massa = ingredientes.criarMassa();
        this.molho = ingredientes.criarMolho();
        this.recheio = ingredientes.criarRecheio();
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public SalgadoIngredientesFactory getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(SalgadoIngredientesFactory ingredientes) {
        this.ingredientes = ingredientes;
    }
}
