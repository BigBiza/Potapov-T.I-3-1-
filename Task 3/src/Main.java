public class Main {

    public static void main(String[] args) {
        DirectXRenderer dxContext = new DirectXRenderer(new Something());
        OpenGLRenderer glContext = new OpenGLRenderer(new Something());
        MetalRenderer metalContext = new MetalRenderer(new Something());

        dxContext.connect();
        glContext.connect();
        metalContext.connect();
    }
}

