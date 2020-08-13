package strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){

        //Given
        User user1 = new Millenials("Adam");
        User user2 = new YGeneration("Ola");
        User user3 = new ZGeneration("Ania");
        //When
        String result1 = user1.sharePost();
        String result2 = user2.sharePost();
        String result3 = user3.sharePost();
        //Then
        Assert.assertEquals("Facebook",result1);
        Assert.assertEquals("Twitter",result2);
        Assert.assertEquals("Snapchat",result3);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user1 = new Millenials("Adam");
        User user2 = new YGeneration("Ola");

        //When
        user1.setSocialPublisher(new SnapchatPublisher());
        user2.setSocialPublisher(new FacebookPublisher());
        String result1 = user1.sharePost();
        String result2 = user2.sharePost();
        //Then
        Assert.assertEquals("Snapchat",result1);
        Assert.assertEquals("Facebook",result2);
    }
}
