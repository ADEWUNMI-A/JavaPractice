package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {


    @Test
void nativeConstructorTest(){
        Human human = new Human();
        Native samuel = new Native(human);
        samuel.setFirstName("Saheed");
        assertEquals("Saheed", samuel.getFirstName());

    }
}
