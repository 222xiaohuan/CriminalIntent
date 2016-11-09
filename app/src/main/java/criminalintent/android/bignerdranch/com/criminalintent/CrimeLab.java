package criminalintent.android.bignerdranch.com.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by emily on 07/11/2016.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private ArrayList<Crime> mCrimes;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<>();

        for(int i=0; i<30; i++){
            Crime c = new Crime();
            c.setTitle("Crime # "+ i);
            c.setSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }

    public static CrimeLab get(Context c){
        if(sCrimeLab==null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime c:mCrimes){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
