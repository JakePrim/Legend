package com.prim.music_app.ui.discory;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prim.music_app.R;

/**
 * @author prim
 * @version 1.0.0
 * @desc
 * @time 2019-08-30 - 06:38
 */
public class DiscoryFragment extends Fragment {
    public static Fragment newInstance() {
        return new DiscoryFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_discory_layout, container, false);
        return inflate;
    }
}
