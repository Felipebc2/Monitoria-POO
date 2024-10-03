public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(1, "Varanda Verde", 4, "Casa 10", "Jardim Botanico",
                "Brasilia", "DF", "Brasil");
        Passageiro passageiro = new Passageiro(1, "Felipe", "Filipinmatadordeporco@gmail.com", "6199691134",
                "08/06/2005", "Felas", "cuzin123", "104657890", "06874184741", endereco);
        Motorista motorista = new Motorista(1, "Jonas", "jonas@gmail.com", "6198745471", "19/02/1998",
                "JonasUser", "Jonas123", "MOT123", "123456789-87");

        System.out.println("Passageiro: "  + passageiro.getNome());
        passageiro.solicitarViagem();
        System.out.println("\nEndereço: ");
        passageiro.getEndereco().mostrarEndereco();

        System.out.println("\nMotorista: " + motorista.getNome());
        motorista.dirigir();
    }
}