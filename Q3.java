public class Q3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez fournir un seul argument : le nombre d'étoiles.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("L'argument fourni n'est pas un nombre valide.");
        }
    }
}
