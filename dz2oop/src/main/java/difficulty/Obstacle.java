package difficulty;

import participants.Entity;

public class Obstacle  extends Mill{
    public Obstacle(int obstruction) {
        super(obstruction);
    }

    @Override
    public int getObstruction() {
        return super.getObstruction();
    }


    @Override
    public boolean doIt(int obstruction, Entity e) {
        if(obstruction>e.getMaxJumpHeight()){
            System.out.println(e.getName()+ " Не смог перепрыгнуть стену высотой " + obstruction + "м");
            return false;
        }
        System.out.println(e.getName()+ " Успешно перепрыгнул стену");
        return true;
    }
}
