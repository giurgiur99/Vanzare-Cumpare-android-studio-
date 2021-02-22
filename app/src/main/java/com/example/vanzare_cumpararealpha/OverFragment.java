package com.example.vanzare_cumpararealpha;

import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class OverFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_over, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {


        view.findViewById(R.id.agreeBtn).setOnClickListener(new View.OnClickListener() {


            OverFragmentArgs args = OverFragmentArgs.fromBundle(getArguments());
            User seller = args.getSeller();
            User buyer = args.getBuyer();
            Car car = args.getCar();
            public void onClick(View view1) {

                System.out.println(seller.toString() + "\n" + buyer.toString() + "\n" + car.toString());
            }
        });

    }

}