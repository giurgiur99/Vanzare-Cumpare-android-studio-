package com.example.vanzare_cumpararealpha;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;


public class FifthFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth,container,false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        final NavController navController = Navigation.findNavController(view);

        EditText buyerName = view.findViewById(R.id.buyerNameTextBox);
        EditText buyerCounty = view.findViewById(R.id.buyerCountyTextBox);
        EditText buyerPostalCode = view.findViewById(R.id.buyerPostalCodeTextBox);
        EditText buyerCity = view.findViewById(R.id.buyerCityTextBox);
        EditText buyerSector  = view.findViewById(R.id.buyerSectorTextBox);

        view.findViewById(R.id.nextBtn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                FifthFragmentArgs args = FifthFragmentArgs.fromBundle(getArguments());
                User seller = args.getSeller();
                User buyer = args.getBuyer();
                buyer.setName(buyerName.getText().toString());
                buyer.setCounty(buyerCounty.getText().toString());
                buyer.setPostalCode(buyerPostalCode.getText().toString());
                buyer.setCity(buyerCity.getText().toString());
                buyer.setSector(buyerSector.getText().toString());

                FifthFragmentDirections.ActionFifthFragment5ToSixthFragment action = FifthFragmentDirections.actionFifthFragment5ToSixthFragment(buyer, seller);
                navController.navigate(action);
            }
        });

    }

}