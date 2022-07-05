package model;

public class Friend extends Contact {
    String telefoneNumber;

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telefoneNumber='" + telefoneNumber + '\'' +
                ", contactName='" + contactName + '\'' +
                '}';
    }
}
