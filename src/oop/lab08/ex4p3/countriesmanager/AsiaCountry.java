package oop.lab08.ex4p3.countriesmanager;

public class AsiaCountry extends Country {
    private int population;
    private double area;
    private double gdp;

    public AsiaCountry(String code,
                       String name,
                       int population,
                       double area,
                       double gdp, String continent) {
        super(code, name);
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGdp() {
        return gdp;
    }

    @Override
    public String getContinent() {
        return null;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}
