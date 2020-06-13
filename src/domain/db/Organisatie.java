package domain.db;

import domain.DomainException;
import domain.model.Persoon;

import java.util.ArrayList;
import java.util.List;

public class Organisatie {
    private List<Persoon> leden;

    public Organisatie() {
        leden = new ArrayList<>();
        Persoon frank = new Persoon("frank@f.be", "Fransen", "Frank");
        Persoon gerda = new Persoon("gerda@g.be", "Geraerts", "Gerda");
        Persoon henk = new Persoon("henk@h.be", "Hansen", "Henk");
        Persoon joris = new Persoon("joris@j.be", "Jeurissen", "Joris");
        Persoon kirsten = new Persoon("kirsten@k.be", "Kristaans", "Kirsten");
        this.voegToe(frank);
        this.voegToe(gerda);
        this.voegToe(henk);
        this.voegToe(joris);
        this.voegToe(kirsten);
    }

    public void voegToe(Persoon persoon) {
        if (persoon == null)
            throw new DomainException("Persoon die je wil toevoegen bestaat niet");
        leden.add(persoon);
    }

    /**
     * Geef persoon met gegeven id
     *
     * @throws DomainException indien id niet overeenkomt met geregistreerd persoon
     */
    public Persoon geefPersoon(String id) {
        for (Persoon p : leden) {
            if (p.getId().equals(id))
                return p;
        }
        throw new DomainException("Persoon met id " + id + " is niet geregistreerd");
    }

    public List<Persoon> geefLeden() {
        return leden;
    }
}
