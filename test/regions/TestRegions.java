package regions;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.DashboardPage;
import pages.LoginPage;
import pages.RegionsPage;

public class TestRegions {
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static RegionsPage regionsPage;
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        regionsPage = dashboardPage.goToRegions();
    }
    
    @After
    public void tearDown() {
    }


     @Test
     public void hello() {
//         regionsPage.
     }
}
