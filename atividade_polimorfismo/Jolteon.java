public class Jolteon extends Eevee {

    public Jolteon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Trovoada - Thunder-Shock";
    }

    @Override
    public String defesa() {
        return "Carga - Wild Charge";
    }

    @Override
    public String especial() {
        return "Raio - Thunder";
    }
}
