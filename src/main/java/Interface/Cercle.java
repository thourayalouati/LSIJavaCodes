package Interface;

// Implémentation de l'interface
class Cercle implements Forme, Forme1 {
    @Override
    public void dessiner() {
        System.out.println("Je suis un cercle");
    }
}