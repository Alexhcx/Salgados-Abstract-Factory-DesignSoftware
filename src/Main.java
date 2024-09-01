import AbstractFactory.SalgadosFactory;

//Alexandre dos Santos Nazareth
//Matricula: 2022.2.0120.0005-4


public class Main {
    public static void main(String[] args) {
        SalgadosFactory fabricaSalgados = new SalgadosFactory();

        fabricaSalgados.assarSalgado("coxinha","goias");
        System.out.println("Coxinha do Goias");
        System.out.println(fabricaSalgados);

        fabricaSalgados.assarSalgado("coxinha","ceara");
        System.out.println("\nCoxinha do Ceara");
        System.out.println(fabricaSalgados);

        fabricaSalgados.assarSalgado("empada","goias");
        System.out.println("\nEmpada do Goias");
        System.out.println(fabricaSalgados);

        fabricaSalgados.assarSalgado("Empada","ceara");
        System.out.println("\nCoxinha do Ceara");
        System.out.println(fabricaSalgados);

    }
}