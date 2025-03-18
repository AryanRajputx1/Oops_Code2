package properties.inheritance;

public class boxweight extends box  {
    double weight;
    public boxweight(){
        this.weight=-1;
    }

    public boxweight(double l, double h, double w, double weight) {
        super(l, h, w);// what is this ? call the parenlt class constructor
        // used to initialize the values of the parent clas
        this.weight = weight;
    }
}
