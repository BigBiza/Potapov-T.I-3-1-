public abstract class Renderer {
    public Graphics graphics;
    public Renderer(Graphics graphics){
        this.graphics = graphics;
    }
    public abstract void connect();
}
