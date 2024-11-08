class DirectXRenderer extends Renderer {
    public DirectXRenderer(Graphics graphics) {
        super(graphics);
    }
    @Override
    public void connect() {
        System.out.println("Для чего-то используется DirectX");
        graphics.draw();
    }
}
