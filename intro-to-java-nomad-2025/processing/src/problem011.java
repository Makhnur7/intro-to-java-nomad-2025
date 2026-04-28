import processing.core.PApplet;

public class problem011 extends PApplet{
    int x = 0;
    int y = 0;
    int width;
    int height;


    @Override
    public void settings(){
        size(900, 900);
    }

    @Override
    public void setup(){
        background(0,0,0);
//        width = 900 / 3;
//        height = 900 / 3;
    }

    @Override
    public void draw(){
        square(300, 300, 300);
    }

    public static void main(String[] args) {
        PApplet.main("problem011");
    }
}
