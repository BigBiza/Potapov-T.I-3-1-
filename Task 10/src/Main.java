public class Main {
    public static void main(String[] args) {
        ProjectFacade projectFacade = new ProjectFacade(
                "Разработка чего-то крутого",
                "Создание модуля чтобы было круто",
                "Завтра",
                "Что угодно"
        );

        projectFacade.displayProjectDetails();
    }
}
