package InitializationLab2;

public class ColorfulThing {


    public enum Color {
        Black, Purple, Orange, Yellow, Amber
    }

    private Color color;

    public ColorfulThing(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}






