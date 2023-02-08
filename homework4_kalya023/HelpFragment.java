package com.example.myapplicationnavigation.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplicationnavigation.R;

public class HelpFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HelpViewModel helpViewModel = new ViewModelProvider(this).get(HelpViewModel.class);

        View root = inflater.inflate(R.layout.fragment_help, container, false);

        final TextView textView = root.findViewById(R.id.text_gallery);
        helpViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}