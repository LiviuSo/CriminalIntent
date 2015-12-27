package org.hello.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by lsoco_user on 12/24/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

} // CrimeListActivity
