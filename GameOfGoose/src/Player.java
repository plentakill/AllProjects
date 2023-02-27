class Player {
    private int position;
    private String name;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void move(int spaces) {
        if (spaces < 2 || spaces > 12) {
            throw new IllegalArgumentException("Invalid roll. Dice can only roll between 2 and 12.");
        }
        position += spaces;
        if (position == 6) {
            position = 12;
        } else if (position == 19) {
            position = 19;
        } else if (position == 42) {
            position = 39;
        } else if (position == 58) {
            position = 0;
        } else if (position == 26 && spaces == 9) {
            position += spaces;
        } else if (position == 53 && spaces == 7) {
            position += spaces;
        }
    }
}