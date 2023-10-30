package exception;

public class ZooFullException extends Exception {
    public ZooFullException() {
        super("Le zoo est plein, impossible d'ajouter plus d'animaux.");
    }

    public ZooFullException(String message) {
        super(message);
    }

}

