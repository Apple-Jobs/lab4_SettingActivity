package com.example.fragmentpreference;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by 林延萍 on 2019/4/11.
 */

public class SettingActivity extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefernces);
    }
}