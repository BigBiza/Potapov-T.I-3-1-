public abstract class Task {
    public final void manageTask() {
        initialize();
        execute();
        complete();
    }

    protected abstract void initialize();

    protected abstract void execute();

    protected abstract void complete();
}
