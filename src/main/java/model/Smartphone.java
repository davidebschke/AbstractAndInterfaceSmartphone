package model;

import java.util.Arrays;

public class Smartphone extends BusinessContact implements Gps, Radio {

    String model;
    String manufacturar;
    String[] contacts;

    public Smartphone() {
    }

    public Smartphone(String model, String manufacturar, String[] contacts) {
        this.model = model;
        this.manufacturar = manufacturar;
        this.contacts = contacts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturar() {
        return manufacturar;
    }

    public void setManufacturar(String manufacturar) {
        this.manufacturar = manufacturar;
    }

    public String[] getContacts() {
        return contacts;
    }

    public void setContacts(String[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String getPosition() {
        String standort = "Köln";
        return standort;
    }

    @Override
    public boolean startRadio() {
        String startRadioMessage = "Radio Started";
        return true;
    }

    @Override
    public boolean stopRadio() {
        String stopRadioMessage = "Radio Stopped";
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturar='" + manufacturar + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                "Business Contacts" + companyName + '}';
    }


    public void addContact(String contact) {



    }

    public String getContact(int index) {


        return contacts[index];
    }


}
