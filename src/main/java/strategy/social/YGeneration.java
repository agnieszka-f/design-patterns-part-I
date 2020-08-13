package strategy.social;

public class YGeneration extends User{

    public YGeneration(final String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
