package com.example.vanzare_cumpararealpha;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class NintethFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ninteth, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        view.findViewById(R.id.previousBtn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NintethFragment.this)
                        .navigate(R.id.action_nintethFragment_to_eigthFragment);
            }
        });

        view.findViewById(R.id.nextBtn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                NavHostFragment.findNavController(NintethFragment.this)
                        .navigate(R.id.action_nintethFragment_to_tenthFragment);
            }
        });

    }
}