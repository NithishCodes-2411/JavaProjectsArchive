import java.util.ArrayList;

public class Skier extends SkiHill {

    private String name;
    private int skierLevel;

    Skier(String name, int skierLevel) {
        super(name);
        this.skierLevel = skierLevel;

    }

    public String getName() {
        return this.name;
    }

    public int getSkierLevel() {
        return this.skierLevel;
    }


    public boolean canSki(SkiRun s) {
        return s.getDifficultyLevel() <= skierLevel;
    }
}
