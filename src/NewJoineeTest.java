import org.junit.Assert;

public class NewJoineeTest {

    @org.junit.Test
    public void printEmployeeList() {
     NewJoinee x1 = new NewJoinee();
        int count = x1.PrintEmployeeList().size();
        Assert.assertEquals(5,count);
    }
}