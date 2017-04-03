
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by yangxiaoshuo on 2017/3/27.
 */
@DisplayName("testinfo")
public class test {

    private TInfo tinfo;

    @BeforeAll
    public static void init(){
        System.out.println("Start testing");
    }

    @BeforeEach
    public void create(){
        this.tinfo = new TInfo();
    }

    @AfterEach
    public void destroy(){
        this.tinfo = null;
    }

    @Test
    @DisplayName("Test 1 + 2 = 3")
    public void testAdd(){
        assertEquals(3,this.tinfo.add(1,2));
    }

    @Disabled
    @Test
    @DisplayName("disabled test")
    public void ignoredTest()
    {
        System.out.println("this test is disabled");
    }
}
