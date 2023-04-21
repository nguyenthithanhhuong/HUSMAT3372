package oop.lab08.ex4p3.countriesmanager;

import java.util.LinkedList;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int min_population = newArray[i].getPopulation();
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                int temp_population = newArray[i].getPopulation();
                if (temp_population < min_population) {
                    min_population = temp_population;
                    min_idx = i;
                }
            }
            Country temp_country = newArray[i];
            newArray[i] = newArray[min_idx];
            newArray[min_idx] = temp_country;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int max_population = newArray[i].getPopulation();
            int max_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                int temp_population = newArray[i].getPopulation();
                if (temp_population > max_population) {
                    max_population = temp_population;
                    max_idx = i;
                }
            }
            Country temp_country = newArray[i];
            newArray[i] = newArray[max_idx];
            newArray[max_idx] = temp_country;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getArea() < newArray[i].getArea()) {
                    Country temp_country = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp_country;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of decreasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getArea() > newArray[i].getArea()) {
                    Country temp_country = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp_country;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country country = newArray[i];
            double gdp = country.getGdp();
            int temp_idx = i - 1;
            while (temp_idx >= 0 && newArray[temp_idx].getGdp() > gdp) {
                newArray[temp_idx + 1] = newArray[i];
                temp_idx--;
            }
            newArray[temp_idx + 1] = country;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     *
     * @return array of decreasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country country = newArray[i];
            double gdp = country.getGdp();
            int temp_idx = i - 1;
            while (temp_idx >= 0 && newArray[temp_idx].getGdp() < gdp) {
                newArray[temp_idx + 1] = newArray[i];
                temp_idx--;
            }
            newArray[temp_idx + 1] = country;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        List<AfricaCountry> africaCountryList = new LinkedList<AfricaCountry>();
        for (Country country: countries) {
            if (country != null && country.getContinent() == "Africa") {
                africaCountryList.add((AfricaCountry) country);
            }
        }
        AfricaCountry[] africaCountries = new AfricaCountry[africaCountryList.size()];
        for (int i = 0; i < africaCountries.length; i++) {
            africaCountries[i] = africaCountryList.get(i);
        }

        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        List<AsiaCountry> asiaCountryList = new LinkedList<AsiaCountry>();
        for (Country country: countries) {
            if (country != null && country.getContinent() == "Asia") {
                asiaCountryList.add((AsiaCountry) country);
            }
        }
        AsiaCountry[] asiaCountries = new AsiaCountry[asiaCountryList.size()];
        for (int i = 0; i < asiaCountries.length; i++) {
            asiaCountries[i] = asiaCountryList.get(i);
        }

        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        List<EuropeCountry> europeCountryList = new LinkedList<EuropeCountry>();
        for (Country country: countries) {
            if (country != null && country.getContinent() == "Europe") {
                europeCountryList.add((EuropeCountry) country);
            }
        }
        EuropeCountry[] europeCountries = new EuropeCountry[europeCountryList.size()];
        for (int index = 0; index < europeCountries.length; index++) {
            europeCountries[index] = europeCountryList.get(index);
        }

        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        List<NorthAmericaCountry> northAmericaCountryList = new LinkedList<NorthAmericaCountry>();
        for (Country country: countries) {
            if (country != null && country.getContinent() == "North America") {
                northAmericaCountryList.add((NorthAmericaCountry) country);
            }
        }

        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[northAmericaCountryList.size()];
        for (int i = 0; i < northAmericaCountries.length; i++) {
            northAmericaCountries[i] = northAmericaCountryList.get(i);
        }

        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        List<OceaniaCountry> oceaniaCountryList = new LinkedList<OceaniaCountry>();
        for (Country country: countries) {
            if (country != null && country.getContinent() == "Oceania") {
                oceaniaCountryList.add((OceaniaCountry) country);
            }
        }

        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[oceaniaCountryList.size()];
        for (int i = 0; i < oceaniaCountries.length; i++) {
            oceaniaCountries[i] = oceaniaCountryList.get(i);
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        List<SouthAmericaCountry> southAmericaCountryList = new LinkedList<SouthAmericaCountry>();
        for (Country country: countries) {
            if (country != null && country.getContinent() == "South America") {
                southAmericaCountryList.add((SouthAmericaCountry) country);
            }
        }

        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[southAmericaCountryList.size()];
        for (int i = 0; i < southAmericaCountries.length; i++) {
            southAmericaCountries[i] = southAmericaCountryList.get(i);
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] mostPopulous = new Country[howMany];
        Country[] sortCountries = sortByDecreasingPopulation();
        if (howMany > 0) {
            for (int i = 0; i < howMany; i++) {
                mostPopulous[i] = sortCountries[i];
            }
        }
        return mostPopulous;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] leastPopulous = new Country[howMany];
        Country[] sortCountries = sortByIncreasingPopulation();
        if (howMany > 0) {
            for (int i = 0; i < howMany; i++) {
                leastPopulous[i] = sortCountries[i];
            }
        }
        return leastPopulous;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] largestArea = new Country[howMany];
        Country[] sortCountries = sortByDecreasingArea();
        if (howMany > 0) {
            for (int i = 0; i < howMany; i++) {
                largestArea[i] = sortCountries[i];
            }
        }
        return largestArea;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] smallestArea = new Country[howMany];
        Country[] sortCountries = sortByIncreasingArea();
        if (howMany > 0) {
            for (int i = 0; i < howMany; i++) {
                smallestArea[i] = sortCountries[i];
            }
        }
        return smallestArea;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] highestGdp = new Country[howMany];
        Country[] sortCountries = sortByDecreasingArea();
        if (howMany > 0) {
            for (int i = 0; i < howMany; i++) {
                highestGdp[i] = sortCountries[i];
            }
        }
        return highestGdp;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] lowestGdp = new Country[howMany];
        Country[] sortCountries = sortByIncreasingArea();
        if (howMany > 0) {
            for (int i = 0; i < howMany; i++) {
                lowestGdp[i] = sortCountries[i];
            }
        }
        return lowestGdp;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}