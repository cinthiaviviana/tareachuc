package com.vivianacosgalla.android.criminallntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by viviana on 01/12/2017.
 */

public class Crime {
    UUID mID;
    String mTitle;
    Date mDate;
    boolean mSolved;

    public UUID getmID() {
        return mID;
    }

    public void setmID(UUID mID) {
        this.mID = mID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();

    }
}
