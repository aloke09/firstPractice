import Regex.FName_Valid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FName_ValidTest
{
    @Test
    public void testValidName() {
        FName_Valid validator = new FName_Valid();
        assertTrue(validator.validMethod("John"));
//        assertEquals("John","John");
//        assertTrue(validator.validMethod("John"), "Name starting with uppercase followed by lowercase should be valid");
    }
    @Test
    public  void testValidLname()
    {
        FName_Valid objL=new FName_Valid();
        assertTrue(objL.validMethodL("Lastname"));
    }
    @Test
    public  void testValidEmail()
    {
        FName_Valid objE=new FName_Valid();
        assertTrue(objE.validEmail("abc@gmail.com"));
    }
    @Test
    public void testPhno()
    {
        FName_Valid objp=new FName_Valid();
        assertTrue(objp.validPhNo("+917811111111"));
    }

    @Test
    public void testPWD()
    {
        FName_Valid objPWD=new FName_Valid();
        assertTrue(objPWD.validPWD("asDF2#$89"));
    }
}
