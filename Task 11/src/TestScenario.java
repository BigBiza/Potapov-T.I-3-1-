import java.util.ArrayList;
import java.util.List;
class TestScenario implements Cloneable {
    private String name;
    private List<String> steps = new ArrayList<>();

    public TestScenario(String name) {
        this.name = name;
    }

    public void addStep(String step) {
        steps.add(step);
    }

    public void removeStep(int index) {
        steps.remove(index);
    }

    public String getName() {
        return name;
    }

    public List<String> getSteps() {
        return steps;
    }

    @Override
    public TestScenario clone() {
        try {
            TestScenario clone = (TestScenario) super.clone();
            clone.steps = new ArrayList<>(steps);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
