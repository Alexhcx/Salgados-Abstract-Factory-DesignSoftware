package Factory;

public class CearaEmpadaIngredientesFactory extends SalgadoIngredientesFactory{

    @Override
    public String criarMassa() {
        return "Crepioca";
    }

    @Override
    public String criarMolho() {
        return "Camarão";
    }

    @Override
    public String criarRecheio() {
        return "Calabresa";
    }
}
