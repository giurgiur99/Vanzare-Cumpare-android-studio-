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

public class NintethFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ninteth, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        final NavController navController = Navigation.findNavController(view);

        EditText manufacturer = view.findViewById(R.id.manufacturerTextBox);
        EditText model = view.findViewById(R.id.modelTextBox);
        EditText identificationNr = view.findViewById(R.id.identificatioNrTextBox);
        EditText capacity = view.findViewById(R.id.capacityTextBox);
        EditText licensePlate = view.findViewById(R.id.licensePlateTextBox);


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

                Car car = new Car();
                assert getArguments() != null;
                NintethFragmentArgs args = NintethFragmentArgs.fromBundle(getArguments());
                User buyer = args.getBuyer();
                User seller = args.getSeller();

                System.out.println(seller.toString() + "\n" + buyer.toString());

                        car.setManufacture(manufacturer.getText().toString());
                car.setModel(model.getText().toString());
                car.setIdentificationNumber(identificationNr.getText().toString());
                car.setCapacity(capacity.getText().toString());
                car.setLicensePlate(licensePlate.getText().toString());

                NintethFragmentDirections.ActionNintethFragmentToTenthFragment action = NintethFragmentDirections.actionNintethFragmentToTenthFragment(car, buyer, seller);
                navController.navigate(action);

            }
        });

    }
}