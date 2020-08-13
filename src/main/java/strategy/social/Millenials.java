package strategy.social;

public class Millenials extends User{

    public Millenials(final String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
