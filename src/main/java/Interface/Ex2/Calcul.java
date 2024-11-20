package Interface.Ex2;

// Interface avec une méthode par défaut
interface Calcul {
    int additionner(int a, int b);

    default int soustraire(int a, int b) {
        return a - b;
    }
}
