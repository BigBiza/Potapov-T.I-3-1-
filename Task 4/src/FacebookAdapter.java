public class FacebookAdapter implements Protocol{
    FacebookProtocol facebookProtocol;
    public FacebookAdapter(FacebookProtocol facebookProtocol) {
        this.facebookProtocol = facebookProtocol;
    }
    @Override
    public void login() {
        facebookProtocol.loginFacebook();
    }

    @Override
    public void logout() {
        facebookProtocol.logoutFacebook();
    }
}
