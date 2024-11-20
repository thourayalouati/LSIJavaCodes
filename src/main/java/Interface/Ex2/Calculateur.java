package Interface.Ex2;

// Implémentation de l'interface
class Calculateur implements Calcul {
    @Override
    public int additionner(int a, int b) {
        return a + b;
    }
}