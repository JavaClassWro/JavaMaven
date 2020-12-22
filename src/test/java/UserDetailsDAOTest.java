import it.academy.dao.UserDetailsDAO;
import it.academy.dao.UserDetailsDAOIml;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class UserDetailsDAOTest {
    @Test
    public void shouldGetUserDetails() {
        // given
        String userName = "John";
        UserDetailsDAO udDAO = new UserDetailsDAOIml();
        String expectedDetails = "john@gmail.com";
        // when
        String details = udDAO.getDetails(userName);
        // then
        assertTrue(expectedDetails.equalsIgnoreCase(details));
    }

    @Test
    public void shouldGetOtherDetails() {
        // given
        String userName = "Bob";
        UserDetailsDAO udDAO = new UserDetailsDAOIml();
        String expectedDetails = "bob@gmail.com";
        // when
        String details = udDAO.getDetails(userName);
        // then
        assertTrue(expectedDetails.equalsIgnoreCase(details));
    }
}
