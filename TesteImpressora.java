public class TesteImpressora {
    public static void main(String[] args) {
        Impressora imp = new Impressora();
        imp.exibir(1.0);
        imp.exibir(1.2, 2.3);
        imp.exibir(1.2, "Switch");
        imp.exibir("Switch", 1.2);
        imp.exibir("Aprenda", "a fazer", "um switch");
        imp.exibir(1, 2, "Ola dnv");
        


    }
}
