package strategy.social;

public class ZGeneration extends User{

    public ZGeneration(final String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
