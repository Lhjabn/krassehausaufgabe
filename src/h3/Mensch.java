package h3;

public class Mensch {
    public String name;
    public int gebJahr;
    public int alter;

    public void setName(String name) {
        this.name = name;
    }
    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }
    public void setAlter() {
        alter = 2025-gebJahr;
    }
    public String getName() {
        System.out.println(name);
        return name;
    }
    public int getGebJahr() {
        System.out.println(gebJahr);
        return gebJahr;
    }
    public int getAlter() {
        System.out.println(alter);
        return alter;
    }

}

