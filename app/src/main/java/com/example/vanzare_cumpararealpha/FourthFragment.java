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
public class FourthFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        final NavController navController = Navigation.findNavController(view);

        FourthFragmentArgs args = FourthFragmentArgs.fromBundle(getArguments());
        User seller = args.getSeller();

        EditText sellerSeries = view.findViewById(R.id.seriesTextBox);
        EditText sellerSeriesNr= view.findViewById(R.id.seriesNrTextBox);
        EditText sellerCnp = view.findViewById(R.id.cnpTextBox);
        EditText sellerPhone = view.findViewById(R.id.phoneTextBox);


        view.findViewById(R.id.previousBtn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FourthFragment.this)
                        .navigate(R.id.action_fourthFragment_to_thirdFragment);
            }
        });

        view.findViewById(R.id.nextBtn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                seller.setSeries(sellerSeries.getText().toString());
                seller.setSeriesNr(sellerSeriesNr.getText().toString());
                seller.setCnp(sellerCnp.getText().toString());
                seller.setPhone(sellerPhone.getText().toString());

                FourthFragmentDirections.ActionFourthFragmentToSellerFragment action = FourthFragmentDirections.actionFourthFragmentToSellerFragment(seller);
                navController.navigate(action);
            }
        });

    }
}