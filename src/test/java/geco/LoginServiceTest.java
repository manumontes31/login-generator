package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Manu on 21/11/2016 :).
 */
public class LoginServiceTest {
    @Test
    public void loginExists() throws Exception {
        String[] s = {"liste"};
        LoginService l = new LoginService(s);

        assertEquals(l.loginExists("liste"), true);
    }

    @Test
    public void addLogin() throws Exception {
        String[] s = {"liste"};
        LoginService l = new LoginService(s);
        l.addLogin("machin");

        assertEquals(l.loginExists("machin"), true);
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        String[] s = {"yesone"};
        String pref = "yes";

        LoginService l = new LoginService(s);
        l.addLogin("truc");

        assertEquals(l.findAllLoginsStartingWith(pref).get(0),"yesone");
    }

    @Test
    public void findAllLogins() throws Exception {
        String[] s = {"one"};

        LoginService l = new LoginService(s);

        List<String> liste = l.findAllLogins();

        assertEquals(liste.get(0),"one");
    }

}