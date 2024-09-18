public class Lamp {

    //properties

    private String colorOfBulb;
    private double lifeSpan;

    //constructors  with only takes all attributes (no no-arg constructor)
    public Lamp(String cb, double lSpan){
        this.colorOfBulb = cb;
        this.lifeSpan = lSpan;
    }

    //getters
    public String getColorOfBulb(){
        return colorOfBulb;
    }

    public double getLifeSpan(){
        return lifeSpan;
    }

    public void turnOn(){
        System.out.println("Turn on the lamp");
    }

    public void turnOff(){
        System.out.println("Turn off the lamp");
    }
    //toString()

    public String toString(){
        return "Color: " + colorOfBulb + ", Life Span: " + lifeSpan;
    }
}

