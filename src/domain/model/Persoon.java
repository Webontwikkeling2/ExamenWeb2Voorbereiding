package domain.model;

import domain.DomainException;

public class Persoon {
    private String naam, voornaam;
    private final String id;

    public Persoon(String id, String naam, String voornaam) {
        setNaam(naam);
        setVoornaam(voornaam);
        if (id == null || id.trim().isEmpty() || id.trim().length() < 3)
            throw new DomainException("Geen geldig id");
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam == null || naam.trim().isEmpty())
            throw new DomainException("Geen geldige naam");
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        if (voornaam == null || voornaam.trim().isEmpty())
            throw new DomainException("Geen geldige voornaam");
        this.voornaam = voornaam;
    }

    public String getId() {
        return id;
    }
}
