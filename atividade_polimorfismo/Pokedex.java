public class Pokedex {
    public static void main(String[] args) {
        Eevee eevee = new Eevee("Normal", 30, 55, 6.5);
        Jolteon jolteon = new Jolteon("Elétrico", 40, 65, 7.0);
        Flareon flareon = new Flareon("Fogo", 35, 65, 7.5);

        System.out.println("Eu sou Eevee");
        eevee.imprimir();
        System.out.println("Ataque: " + eevee.ataque());
        System.out.println("Defesa: " + eevee.defesa());
        System.out.println("Especial: " + eevee.especial());

        System.out.println("\nEu sou Jolteon");
        jolteon.imprimir();
        System.out.println("Ataque: " + jolteon.ataque());
        System.out.println("Defesa: " + jolteon.defesa());
        System.out.println("Especial: " + jolteon.especial());

        System.out.println("\nEu sou Flareon");
        flareon.imprimir();
        System.out.println("Ataque: " + flareon.ataque());
        System.out.println("Defesa: " + flareon.defesa());
        System.out.println("Especial: " + flareon.especial());
    }
}
