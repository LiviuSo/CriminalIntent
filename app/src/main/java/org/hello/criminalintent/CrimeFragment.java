package org.hello.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by lsoco_user on 12/22/2015.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}