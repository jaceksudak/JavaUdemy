package jaceksudak.udemy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacek on 2017-03-28.
 */
public class Player implements ISavable {
    private String name;
    private int hitPoints;
    private int level;

    public Player(String name, int hitPoints, int level) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, ""+this.hitPoints);
        values.add(2, ""+this.level);

        return values;
    }

    @Override
    public void load(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0 ) {
            this.name = savedValues.get(0) ;
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.level = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", level=" + level +
                '}';
    }
}


