public class Main {
    public static void main(String[] args) {
        int nbEntiers = 0, factorielle = 1;
        int ancien;
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Donnez en paramètre la base de la factorielle.");
            }
            nbEntiers = Integer.parseInt(args[0]);
            if (nbEntiers < 0) {
                throw new negatifException();
            }
            for (int i = 2; i <= nbEntiers; i++) {
                factorielle *= i;
            }
            System.out.println("voila la factorielle des " + nbEntiers + " premiers entiers : " + factorielle);
        } catch (negatifException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof negatifException) {
                System.out.println("La factorielle d'un nombre négatif n'est pas définie.");
            } else {
                System.out.println("Donnez en paramètre la base de la factorielle.");
            }
        } catch (NumberFormatException e) {
            System.out.println("La base de la factorielle doit être un entier.");
        }
    }
}
