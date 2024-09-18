public class Ceiling {


    private double height;
    private String colorOfPaint;


    public Ceiling(double ht, String cp){
        this.height = ht;
        this.colorOfPaint = cp;
    }

    public double getHeight() {
        return height;
    }

    public String getColorOfPaint() {
        return colorOfPaint;
    }

    public String toString(){
        return height + ", and Color of Paint: " + colorOfPaint;
    }
}
