package participants;

import difficulty.Mill;

public abstract class Entity {
    String name;
    int maxRunValue;
    int maxJumpHeight;

    public Entity(String name, int maxRunValue, int maxJumpHeight) {
        this.name = name;
        this.maxRunValue = maxRunValue;
        this.maxJumpHeight = maxJumpHeight;
    }

    public int getMaxRunValue() {
        return maxRunValue;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public String getName() {
        return name;
    }


}
