package geco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Manu on 22/11/2016 :).
 */
public class LoginGeneratorTest {
    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        LoginService loginS = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});

        LoginGenerator loginG = new LoginGenerator(loginS);

        String nom1 = loginG.generateLoginForNomAndPrenom("Durand","Paul");
        assertEquals(nom1,"PDUR");
        String nom2 = loginG.generateLoginForNomAndPrenom("Rolling","Jean");
        assertEquals(nom2,"JROL1");
        String nom3 = loginG.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertEquals(nom3,"PDUR1");
        String nom4 = loginG.generateLoginForNomAndPrenom("Ralling","Jean");
        assertEquals(nom4,"JRAL2");
        String nom5 = loginG.generateLoginForNomAndPrenom("Du","Paul");
        assertEquals(nom5,"PDU");

    }

}