package com.example.vanzare_cumpararealpha;

import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class ThirdFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        final NavController navController = Navigation.findNavController(view);

        EditText sellerStreet = view.findViewById(R.id.streetTextBox);
        EditText sellerStreetNr= view.findViewById(R.id.streetNrTextBox);
        EditText sellerBl = view.findViewById(R.id.blTextBox);
        EditText sellerSc = view.findViewById(R.id.scTextBox);
        EditText sellerAp = view.findViewById(R.id.apTextBox);

        ThirdFragmentArgs args = ThirdFragmentArgs.fromBundle(getArguments());
        User seller = args.getSeller();
        //Log.i("TEST + ",seller.toString());

        view.findViewById(R.id.previousBtn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ThirdFragment.this)
                        .navigate(R.id.action_thirdFragment_to_SecondFragment);
            }
        });

        view.findViewById(R.id.nextBtn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                seller.setStreet(sellerStreet.getText().toString());
                seller.setStreetNr(sellerStreetNr.getText().toString());
                seller.setBl(sellerBl.getText().toString());
                seller.setAp(sellerAp.getText().toString());


                ThirdFragmentDirections.ActionThirdFragmentToFourthFragment action = ThirdFragmentDirections.actionThirdFragmentToFourthFragment(seller);
                navController.navigate(action);
            }
        });

    }


}