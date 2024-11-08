class MetalRenderer extends Renderer {
    public MetalRenderer(Graphics graphics) {
        super(graphics);
    }
    @Override
    public void connect() {
        System.out.println("Для чего-то используется OpenGL");
        graphics.draw();
    }
}
