package strategy.social;

public abstract class User {
    protected  SocialPublisher socialPublisher;
    private final String name;

    public User(final String name) {
        this.name = name;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getName() {
        return name;
    }
}
