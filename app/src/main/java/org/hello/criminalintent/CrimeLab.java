package org.hello.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by lsoco_user on 12/24/2015.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

        // generate crimes
//        for(int i=0; i<100; i++) {
//            Crime crime = new Crime();
//            crime.setTitle("Crime # " + i);
//            crime.setSolved(i%2 == 0);
//            mCrimes.add(crime);
//        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for(Crime crime : mCrimes) {
            if(crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

    // chalenge: Efficient RecycleView reloading
    public static int getIndex(Crime crime) {
        UUID searchedId = crime.getId();
        return getIndex(searchedId);
    }

    public static int getIndex(UUID searchedId) {
        List<Crime> crimes = sCrimeLab.getCrimes();
        for(int index = 0; index < crimes.size(); index++) {
            if(searchedId.equals(crimes.get(index).getId()))
                return index;
        }
        // not found
        return -1;
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }
} // CrimeLab