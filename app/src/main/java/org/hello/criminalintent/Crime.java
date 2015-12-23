package org.hello.criminalintent;

import java.util.UUID;

/**
 * Created by lsoco_user on 12/22/2015.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        // generate a unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

} // end class Crime
