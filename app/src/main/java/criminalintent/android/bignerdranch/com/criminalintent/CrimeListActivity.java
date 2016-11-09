package criminalintent.android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by emily on 07/11/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
