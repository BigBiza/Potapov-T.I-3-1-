class OpenGLRenderer extends Renderer {
    public OpenGLRenderer(Graphics graphics) {
        super(graphics);
    }
    @Override
    public void connect() {
        System.out.println("Для чего-то используется OpenGL");
        graphics.draw();
    }
}
