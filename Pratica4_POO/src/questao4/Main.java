package questao4;

public class Main {
    public static void main(String[] args) {
        FabricanteA celularFabricanteA = new FabricanteA(true, true, true, true, true, true, true, true, true, false, true,  6800.00);


        FabricanteB celularFabricanteB = new FabricanteB(true, true, true, true, true, true, true, true, false, true, true,  5200.00);


        celularFabricanteA.imprimirDados();

        celularFabricanteB.imprimirDados();

    }
}
