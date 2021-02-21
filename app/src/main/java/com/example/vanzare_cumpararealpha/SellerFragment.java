package com.example.vanzare_cumpararealpha;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SellerFragment extends Fragment  {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seller, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {



        view.findViewById(R.id.nextBtnSeller).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                NavHostFragment.findNavController(SellerFragment.this)
                        .navigate(R.id.action_sellerFragment_to_fifthFragment5);
            }
        });

    }

}