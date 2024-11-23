package com.hoax.foodfyp;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

//import com.hoax.foodfyp.spinner.KeyPairBoolData;
//import com.hoax.foodfyp.spinner.*;
import com.androidbuts.multispinnerfilter.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivitylist extends AppCompatActivity {
    private static final String TAG = "list";
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylist);

        final List<String> list = Arrays.asList(getResources().getStringArray(R.array.food_array));

        final List<KeyPairBoolData> listArray0 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(false);
            listArray0.add(h);
        }

        final List<KeyPairBoolData> listArray1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            KeyPairBoolData h = new KeyPairBoolData();
            h.setId(i + 1);
            h.setName(list.get(i));
            h.setSelected(i < 5);
            listArray1.add(h);
        }

        //  CheckBox colorSeparationCheckBox = findViewById(R.id.colorSeparationCheckBox);
        //CheckBox searchEditTextCheckBox = findViewById(R.id.searchEditTextCheckBox);





        // Removed second parameter, position. Its not required now..
        // If you want to pass preselected items, you can do it while making listArray,
        // pass true in setSelected of any item that you want to preselect
        // LOGICALLY, PASS Only One Item As SELECTED...

// create a spinner
        MultiSpinnerSearch multiSelectSpinnerWithSearch = findViewById(R.id.multipleItemSelectionSpinner);


        // Pass true If you want searchView above the list. Otherwise false. default = true.
        multiSelectSpinnerWithSearch.setSearchEnabled(true);

        multiSelectSpinnerWithSearch.setHintText("Select Any");

        //A text that will display in clear text button
        multiSelectSpinnerWithSearch.setClearText("Clear");

        // A text that will display in search hint.
        multiSelectSpinnerWithSearch.setSearchHint("Select your allergies");

        // Set text that will display when search result not found...
        multiSelectSpinnerWithSearch.setEmptyTitle("No Data Found!");

        // If you will set the limit, this button will not display automatically.
        multiSelectSpinnerWithSearch.setShowSelectAllButton(true);




        // Removed second parameter, position. Its not required now..
        // If you want to pass preselected items, you can do it while making listArray,
        // pass true in setSelected of any item that you want to preselect
        multiSelectSpinnerWithSearch.setItems(listArray1, items -> {
            //The followings are selected items.
            for (int i = 0; i < items.size(); i++) {
                // Log.i(TAG, i + " : " + items.get(i).getName() + " : " + items.get(i).isSelected());
                Log.i(TAG, i + " : " + items.get(i).getName() + " : " + "dummmmiiiii");
                Log.i(TAG, i + " : " + items.get(i).getName() + " : " + "dummmmiiiii");
                Log.i(TAG, i + " : " + items.get(i).getName() + " : " + "dummmmiiiii");
                Log.i(TAG, i + " : " + items.get(i).getName() + " : " + "dummmmiiiii");
                Log.i(TAG, i + " : " + items.get(i).getName() + " : " + "dummmmiiiii");
            }
        });

        button = (Button) findViewById(R.id.btnNextScreen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

public void openActivity2(){
        Intent intent=new Intent(this, MainActivityResult.class);
        startActivity(intent);

}

}