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


public class TenthFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tenth, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        final NavController navController = Navigation.findNavController(view);

        TenthFragmentArgs args = TenthFragmentArgs.fromBundle(getArguments());
        Car car = args.getCar();
        User seller = args.getSeller();
        User buyer = args.getBuyer();

       // User seller = args.get

        EditText nrCarte = view.findViewById(R.id.nrCarteTextBox);
        EditText manufYear = view.findViewById(R.id.manufYearTextBox);
        EditText euroCo2 = view.findViewById(R.id.euroTextBox);
        EditText priceNr = view.findViewById(R.id.priceNrTextBox);
        EditText priceLetters = view.findViewById(R.id.priceLettersTextBox);

        view.findViewById(R.id.previousBtn10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(TenthFragment.this)
                        .navigate(R.id.action_tenthFragment_to_nintethFragment);
            }
        });

        view.findViewById(R.id.nextBtn10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                assert car != null;
                car.setNrCarte(nrCarte.getText().toString());
                car.setManufactureYear(manufYear.getText().toString());
                car.setEuroCo2(euroCo2.getText().toString());
                car.setPriceNr(priceNr.getText().toString());
                car.setPriceLetters(priceLetters.getText().toString());
                System.out.println(seller.toString() + "\n" + buyer.toString());

                TenthFragmentDirections.ActionTenthFragmentToOverFragment action = TenthFragmentDirections.actionTenthFragmentToOverFragment(car, seller, buyer);
                navController.navigate(action);
            }
        });

    }
}