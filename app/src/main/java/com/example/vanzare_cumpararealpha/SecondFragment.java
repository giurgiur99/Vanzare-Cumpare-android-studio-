package com.example.vanzare_cumpararealpha;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {



        EditText sellerName = view.findViewById(R.id.nameTextBox);
        EditText sellerCounty = view.findViewById(R.id.countyTextBox);
        EditText sellerPostalCode = view.findViewById(R.id.postalCodeTextBox);
        EditText sellerCity = view.findViewById(R.id.cityTextBox);
        EditText sellerSector  = view.findViewById(R.id.sectorTextBox);

        SecondFragmentArgs args = SecondFragmentArgs.fromBundle(getArguments());
        User seller = args.getSeller();

        final NavController navController = Navigation.findNavController(view);

        view.findViewById(R.id.nextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

               // User seller = new User();
                seller.setName(sellerName.getText().toString());
                seller.setCounty(sellerCounty.getText().toString());
                seller.setPostalCode(sellerPostalCode.getText().toString());
                seller.setCity(sellerCity.getText().toString());
                seller.setSector(sellerSector.getText().toString());

                SecondFragmentDirections.ActionSecondFragmentToThirdFragment action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(seller);
                navController.navigate(action);

                //NavHostFragment.findNavController(SecondFragment.this)
                        //.navigate(R.id.action_SecondFragment_to_thirdFragment);
            }
        });

    }

}