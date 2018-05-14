package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Auta  {
       private String marka;
    private String nazwa_auta;
    private double v_max;
    private double cena;

    public Auta(String marka, String nazwa_auta, double v_max, double cena) {
        this.marka = marka;
        this.nazwa_auta = nazwa_auta;
        this.v_max = v_max;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getNazwa_samochodu() {
        return nazwa_auta;
    }

    public double getV_max() {
        return v_max;
    }

    public double getCena() {
        return cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setNazwa_samochodu(String nazwa_auta) {
        this.nazwa_auta = nazwa_auta;
    }

    public void setV_max(double v_max) {
        this.v_max = v_max;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
     @Override
    public String toString() {
        return  "Marka: " + marka + ", Nazwa: " + nazwa_auta + ", Predkoscmax: " + v_max + ", Cena: " + cena ;
    }
    
}