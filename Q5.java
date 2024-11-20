public class Q5 {
    public static void main(String[] args) {
        // Vérifier qu'un paramètre a été donné
        if (args.length != 1) {
            System.out.println("Veuillez spécifier le nombre d'étoiles.");
            return;
        }

        // Nombre d'étoiles donné en argument
        int n = Integer.parseInt(args[0]);

        // Afficher un triangle inversé d'`x` (au lieu de `*`)
        for (int i = n; i >= 1; i--) {  // Inverser l'affichage en commençant par la ligne la plus longue
            for (int j = 1; j <= i; j++) {
                System.out.print("x");  // Remplacer `*` par `x`
            }
            System.out.println();
        }
    }
}
