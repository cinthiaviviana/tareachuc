package com.vivianacosgalla.android.criminallntent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by viviana on 04/12/2017.
 */

public class CrimeLab {
private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);


        }
        return sCrimeLab;

    }
    private CrimeLab(Context context){
        mCrimes =new ArrayList<>();
        for (int i=1; i<=100; ++i){
            Crime crime = new Crime();
            crime.setmTitle("Crime #" + i);
            crime.setmSolved(1%2==0);
            mCrimes.add(crime);
        }
    }
    public List<Crime>getCrimes(){return mCrimes;}
    public Crime getCrime (UUID id){
        for (Crime crime : mCrimes){
            if (crime.getmID().equals(id)){
                return crime;
            }
        }
        return null;

    }

}
