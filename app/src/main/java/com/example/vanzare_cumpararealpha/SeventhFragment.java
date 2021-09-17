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

public class SeventhFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seventh,container,false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        final NavController navController = Navigation.findNavController(view);

        SeventhFragmentArgs args = SeventhFragmentArgs.fromBundle(getArguments());
        User buyer = args.getBuyer();
        User seller = args.getSeller();

        EditText buyerSeries = view.findViewById(R.id.buyerSeriesTextBox);
        EditText buyerSeriesNr= view.findViewById(R.id.buyerSeriesNrTextBox);
        EditText buyerCnp = view.findViewById(R.id.buyerCnpTextBox);
        EditText buyerPhone = view.findViewById(R.id.buyerPhoneTextBox);

        System.out.println(buyer.toString());

        view.findViewById(R.id.previousBtn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               SeventhFragmentDirections.ActionSeventhFragmentToSixthFragment action = SeventhFragmentDirections.actionSeventhFragmentToSixthFragment(buyer, seller);
            }
        });

        view.findViewById(R.id.nextBtn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                buyer.setSeries(buyerSeries.getText().toString());
                buyer.setSeriesNr(buyerSeriesNr.getText().toString());
                buyer.setCnp(buyerCnp.getText().toString());
                buyer.setPhone(buyerPhone.getText().toString());

                SeventhFragmentDirections.ActionSeventhFragmentToEigthFragment action = SeventhFragmentDirections.actionSeventhFragmentToEigthFragment(buyer, seller);
                navController.navigate(action);
            }
        });

    }

}