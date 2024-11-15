public class Main {
    public static void main(String[] args) {
        Protocol facebook = new FacebookAdapter(new FacebookProtocol());
        Protocol twitter = new TwitterAdapter(new TwitterProtocol());
        Protocol instagram = new InstagramAdapter((new InstagramProtocol()));

        facebook.login();
        facebook.logout();

        twitter.login();
        twitter.logout();

        instagram.login();
        instagram.logout();
    }
}

