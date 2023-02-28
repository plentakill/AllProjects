public class Player {

    public Player(String name){
        this.name = name;
        this.position = 0;
    }
    private int position;

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    private String name;

    public void move(int spaces){
        if (spaces < 2 || spaces > 12){
            throw new IllegalArgumentException("Invalid roll. Dice can only roll between 2 and 12");
        }
        position += spaces;

        if (position == 6){
            position = 12;
        } else if (position == 19) {
            position = 19;
        } else if (position == 42) {
            position = 39;
        } else if (position == 58){
            position = 0;
        }
    }
}
