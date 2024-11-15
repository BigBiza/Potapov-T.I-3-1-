import java.util.Random;
class TestScenarioGenerator {
    private TestScenario baseScenario;
    private Random random = new Random();
    public TestScenarioGenerator(TestScenario baseScenario) {
        this.baseScenario = baseScenario;
    }
    public TestScenario generateScenario() {
        TestScenario scenario = baseScenario.clone();
        if (random.nextBoolean()) {
            scenario.addStep("Дополнительный шаг");
        } else if (scenario.getSteps().size() > 1) {
            scenario.removeStep(random.nextInt(scenario.getSteps().size()));
        }
        return scenario;
    }
}
