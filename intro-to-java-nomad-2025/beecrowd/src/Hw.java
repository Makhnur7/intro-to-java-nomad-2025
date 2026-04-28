public class Hw {
    private String name;
    private int age;
    private String color;
    public Hw(String name1, int age1, String color1){
        name = name1;
        age = age1;
        color = color1;
    }

    @Override
    public String toString() {
            return "name='" + name + "', age=" + age + ", color='" + color ;
        }

    public static void main(String[] args) {
        Hw cat = new Hw("Cat", 13, "black");
        System.out.println(cat);
    }
}
