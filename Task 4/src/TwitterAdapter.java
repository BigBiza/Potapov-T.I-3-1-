public class TwitterAdapter implements Protocol {
    TwitterProtocol twitterProtocol;

    public TwitterAdapter(TwitterProtocol twitterProtocol) {
        this.twitterProtocol = twitterProtocol;
    }

    @Override
    public void login() {
        twitterProtocol.loginTwitter();
    }

    @Override
    public void logout() {
        twitterProtocol.logoutTwitter();
    }
}
