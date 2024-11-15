public class InstagramAdapter implements Protocol {
    InstagramProtocol instagramProtocol;

    public InstagramAdapter(InstagramProtocol instagramProtocol) {
        this.instagramProtocol = instagramProtocol;
    }

    @Override
    public void login() {
        instagramProtocol.loginInstagram();
    }

    @Override
    public void logout() {
        instagramProtocol.logoutInstagram();
    }
}
