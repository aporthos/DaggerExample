package com.s2next.daggerexample.interfaces;

/**
 * Created by portes on 05/12/17.
 */

public interface ContractLogin {
    interface Presenter {
        void presValidateSession(String mUser, String mPassword);
    }
    interface View {
        void vwSessionInitialized();
        void vwDataNotFound();
    }
    interface Interactor {
        void intValidateSession(String mUser, String mPassword, OnLoginListener mOnLoginListener);
    }
}
