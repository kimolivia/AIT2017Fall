package hu.ait.android.dynamicfragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Peter on 2017. 12. 07..
 */

public class FragmentImport extends Fragment {

    public static final String TAG = "FragmentImport";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_import, container, false);

        return viewRoot;
    }
}
