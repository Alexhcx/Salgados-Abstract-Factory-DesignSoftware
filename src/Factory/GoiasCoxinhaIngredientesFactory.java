package Factory;

public class GoiasCoxinhaIngredientesFactory extends SalgadoIngredientesFactory {
    @Override
    public String criarMassa() {
        return "Fina";
    }

    @Override
    public String criarMolho() {
        return "Pequi";
    }

    @Override
    public String criarRecheio() {
        return "Frango";
    }
}
