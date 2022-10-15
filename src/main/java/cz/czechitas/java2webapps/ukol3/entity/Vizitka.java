package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {

    private String jmeno;

    private String firma;

    private String ulice;

    private String obecPsc;

    private String celaAdresa;

    private String email;

    private String telefon;

    private String web;

    public Vizitka() {

    }

    public Vizitka(String jmeno, String firma, String ulice, String obecPsc, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPsc = obecPsc;
        this.celaAdresa = ulice +", "+obecPsc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public String getUlice() {
        return ulice;
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public String getCelaAdresa() {
        return celaAdresa;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getWeb() {
        return web;
    }
}
