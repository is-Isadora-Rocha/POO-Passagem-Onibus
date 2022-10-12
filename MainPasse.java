package passagemOnibus;

public class MainPasse {
    public static void main(String[] args) {
        PasseOnibus p1 = new PasseOnibus();
        p1.setDono("Roberto");
        p1.tipoConta("Meia");

        p1.depositar(150.00);
        p1.passagem();
        p1.pagarPassagem();

        p1.estadoAtual();
    }
}
