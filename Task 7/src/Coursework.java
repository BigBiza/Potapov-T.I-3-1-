public class Coursework extends TaskCreator{
    @Override
    void setDescription() {
        task.setDescription("Сделать курсовую работу");
    }

    @Override
    void setPriority() {
        task.setPriority("Еще выше чем домашка по программированию");
    }

    @Override
    void setDate() {
        task.setDate("Вообще до конца сессии, но мне бы хоть когда-нибудь сделать...");
    }
}
