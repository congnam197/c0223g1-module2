package ss16_io_text_file.bai_tap.doc_file.csv;

public class Coutries {
    private int id;
    private String abbreviation;
    private String nameCountry;

    public Coutries() {
    }

    public Coutries(int id, String abbreviation, String nameCountry) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.nameCountry = nameCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return
                "id= " + id + ", abbreviation = " + abbreviation + ", nameCountry = " + nameCountry;
    }
}
