package difficulty;

import participants.Entity;

public abstract class Mill {
    int obstruction;

    public int getObstruction() {
        return obstruction;
    }



    public Mill(int obstruction) {
        this.obstruction = obstruction;
    }

    public abstract   boolean doIt(int obstruction, Entity e);
}
