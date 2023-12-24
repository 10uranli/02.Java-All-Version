package java16.unit_2;

public class Dask extends Insurance{


    public Dask(String name, String type) {
        super(name, type);
    }

    int getPremiumForDask(){
        return 10;
    }
}
