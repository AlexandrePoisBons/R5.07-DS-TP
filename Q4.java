public class Q4 
{
    public static void main(String[] args) 
    {
        if (args.length != 1) 
        {
            System.out.println("Veuillez fournir un seul argument : le nombre de lignes.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("L'argument fourni n'est pas un nombre valide.");
        }
    }
}
