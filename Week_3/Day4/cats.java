package Week_3.Day4;

public class cats extends animals {
    String name = "NA";
    String voice = "NA";
    String color = "NA";

    public cats() {
    }

    public cats(
            String name,
            String voice,
            String color,
            int legs,
            boolean tail,
            int food) {
        this.name = name;
        this.voice = voice;
        this.color = color;
        this.legs = legs;
        this.tail = tail;
        this.food_habit = food;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.voice);
        System.out.println(this.color);
        System.out.println(this.legs);
        System.out.println(this.tail);
        System.out.println(this.f.habit[this.food_habit]);

       
    }
}
