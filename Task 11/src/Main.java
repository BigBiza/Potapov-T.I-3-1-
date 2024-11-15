public class Main {
    public static void main(String[] args) {
        TestScenario baseScenario = new TestScenario("Базовый сценарий");
        baseScenario.addStep("Запустить приложение");
        baseScenario.addStep("Ввести логин и пароль");
        baseScenario.addStep("Войти в систему");

        TestScenarioGenerator generator = new TestScenarioGenerator(baseScenario);

        TestScenario scenario1 = generator.generateScenario();

        TestScenario scenario2 = generator.generateScenario();

        System.out.println("Сценарий 1: " + scenario1.getName());
        for (String step : scenario1.getSteps()) {
            System.out.println("- " + step);
        }

        System.out.println("\nСценарий 2: " + scenario2.getName());
        for (String step : scenario2.getSteps()) {
            System.out.println("- " + step);
        }
    }
}

