package difficulty;

import participants.Entity;

public class Track extends Mill{
    public Track(int obstruction) {
        super(obstruction);
    }

    @Override
    public int getObstruction() {
        return super.getObstruction();
    }


    @Override
    public boolean doIt(int obstruction, Entity e) {
        if(obstruction>e.getMaxRunValue()){
            System.out.println(e.getName()+ " Не смог пробежать дистанцию " + obstruction + "м");
            return false;
        }
        System.out.println(e.getName()+ " Успешно достиг финиша");
        return true;
    }
}
