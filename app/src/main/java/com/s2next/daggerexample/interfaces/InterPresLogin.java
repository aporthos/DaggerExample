package com.s2next.daggerexample.interfaces;

/**
 * Created by amadeusportes on 05/12/17.
 */

public interface InterPresLogin {
    void presValidateSession(String mUser, String mPassword);
    void presTokenRegister(String user);
}
