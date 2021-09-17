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
public class SixthFragment extends Fragment {


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sixth,container,false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        final NavController navController = Navigation.findNavController(view);

        SixthFragmentArgs args = SixthFragmentArgs.fromBundle(getArguments());
        User buyer = args.getBuyer();
        User seller = args.getSeller();

        EditText buyerStreet = view.findViewById(R.id.buyerStreetTextBox);
        EditText buyerStreetNr= view.findViewById(R.id.buyerNrTextBox);
        EditText buyerBl = view.findViewById(R.id.buyerBlTextBox);
        EditText buyerSc = view.findViewById(R.id.buyerScTextBox);
        EditText buyerAp = view.findViewById(R.id.buyerApartTextBox);


        view.findViewById(R.id.previousBtn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SixthFragmentDirections.ActionSixthFragmentToFifthFragment5 action = SixthFragmentDirections.actionSixthFragmentToFifthFragment5(buyer, seller);
                navController.navigate(action);
            }
        });

        view.findViewById(R.id.nextBtn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                buyer.setStreet(buyerStreet.getText().toString());
                buyer.setStreetNr(buyerStreetNr.getText().toString());
                buyer.setBl(buyerBl.getText().toString());
                buyer.setAp(buyerAp.getText().toString());

                SixthFragmentDirections.ActionSixthFragmentToSeventhFragment action = SixthFragmentDirections.actionSixthFragmentToSeventhFragment(buyer, seller);
                navController.navigate(action);
            }
        });

    }
}