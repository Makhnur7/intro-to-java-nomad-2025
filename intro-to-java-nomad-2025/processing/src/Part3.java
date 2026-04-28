import processing.core.PApplet;

public class Part3 extends PApplet{
    int x = 0;
    int y = 0;
    int Cwidth;
    int Cheight;

    @Override
    public void settings(){
        size(900, 900);
    }

    @Override
    public void setup(){
        background(70, 70, 70);
        Cheight = 900 / 3;
        Cwidth = 900 / 3;
    }

    @Override
    public void draw(){
        for (int i = 0; i < 3; i++){
            int x1 = Cwidth + ( i * 100);
            int y1 = Cheight;
            square(x1, y1, 100);
        }

    }

    public static void main(String[] args) {
        PApplet.main("Part3");
    }
}
