public class Bedroom {

    String name;
    Wall w1;
    Wall w2;
    Wall w3;
    Wall w4;

    Ceiling ceil;

    Bed bed;
    Lamp lamp;

    public Bedroom(String name, Wall w1, Wall w2, Wall w3, Wall w4, Ceiling ceiling, Bed bd, Lamp lm){
        this.name = name;
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w4 = w4;//


        this.ceil = ceiling;

        this.lamp = lm;
        this.bed = bd;
    }

    public String getName(){
        return name;
    }

    public Wall getW1(){
        return w1;
    }

    public void makeBed(){
        System.out.println("Bedroom class --> calling makeBed() method");

        //call make() method you declared in the Bedroom class
        this.make();

        //call make() method you created in the Bed class
        bed.make();
    }

    public void make(){
        System.out.println("From Bedroom class - make() method");
    }


    public String toString(){

        //bedroom has four walls in north, west, south,east, and the ceiling has height of ___ and ____ color
        //and the bedroom has a lamp. The lamp has ___ color, and it life span is ___ ly,
        String result = "Bedroom has four Walls in Direction of [ " + w1 + ", " + w2 + ", " + w3 + ", " + w4 + "]\nThe Ceiling has height of " + ceil.getHeight() + " and " + ceil.getColorOfPaint() + " color";


        return result;
    }


}

