package com.example.vanzare_cumpararealpha;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.os.Bundle;

import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;



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

               // final String src = "src/main/res/contract.pdf";

                System.out.println(seller.toString() + "\n" + buyer.toString() + "\n" + car.toString());

                try {
                    InputStream file = getContext().getAssets().open("contractTest.pdf");
                    String fileOutLocation = "src/main/assets";
                    System.out.println("                " + fileOutLocation);
                    //System.out.println(file.read());
                    AddingText.inPdf(file);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("               " + Environment.getExternalStorageDirectory().getAbsolutePath());
            }
        });

    }

}