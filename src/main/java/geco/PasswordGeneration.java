package geco;

import org.apache.commons.lang.RandomStringUtils;

/**
 * Created by Manu on 22/11/2016.
 */
public class PasswordGeneration {

    /**
     * Construis un mdp sur 8 caractères avec A-Za-z0-9 + les caractères spéciaux
     * @return String le mot de passe aléatoire
     */
    public static String getRandomPassword(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        String pwd = RandomStringUtils.random(8, characters);
        System.out.println( pwd );
        return pwd;
    }

    public static void main(String [] args){
        String s1 = "";
        s1 = getRandomPassword();
    }
}
