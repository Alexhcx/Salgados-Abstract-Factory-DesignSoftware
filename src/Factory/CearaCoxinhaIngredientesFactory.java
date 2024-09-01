package Factory;

public class CearaCoxinhaIngredientesFactory extends SalgadoIngredientesFactory {

    @Override
    public String criarMassa() {
        return "Grossa";
    }

    @Override
    public String criarMolho() {
        return "Pimenta";
    }

    @Override
    public String criarRecheio() {
        return "Carne Seca";
    }

}
