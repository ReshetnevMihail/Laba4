package Teats;

import Main.Library;
import org.junit.Assert;

public class LibraryTest {

    @org.junit.Test
    public void main() {
        Library obj = new Library();
        String actualEmpName = obj.getstr();
        Assert.assertNull(actualEmpName);
    }
}