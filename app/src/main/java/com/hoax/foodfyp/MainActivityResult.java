package com.hoax.foodfyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import com.clarifai.channel.ClarifaiChannel;
import com.clarifai.credentials.ClarifaiCallCredentials;
import com.clarifai.grpc.api.Concept;
import com.clarifai.grpc.api.Data;
import com.clarifai.grpc.api.Image;
import com.clarifai.grpc.api.Input;
import com.clarifai.grpc.api.MultiOutputResponse;
import com.clarifai.grpc.api.PostModelOutputsRequest;
import com.clarifai.grpc.api.V2Grpc;
import com.clarifai.grpc.api.status.StatusCode;

import java.util.*;

import javax.net.ssl.SSLException;


public class MainActivityResult extends AppCompatActivity {
    private static final String TAG = "MyActivityResult";
    private static  String imagelinkkk="aaa";
    TextView finaltxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result);
        Log.d(TAG, "RESULT ACTIVITY");
        Log.d(TAG, "RESULT ACTIVITY");
        Log.d(TAG, "RESULT ACTIVITY");
        Log.d(TAG, "RESULT ACTIVITY");
        Log.d(TAG, "RESULT ACTIVITY");
        Log.i(TAG, imagelinkkk);
        Log.i(TAG, imagelinkkk);
        Log.i(TAG, imagelinkkk);
        Log.i(TAG, imagelinkkk);
        Log.i(TAG, imagelinkkk);
        Log.i(TAG, imagelinkkk);
        Log.i(TAG, imagelinkkk);
//clarifai start
        Log.d(TAG, "CLARIFAI START");
        Log.d(TAG, "CLARIFAI START");
        Log.d(TAG, "CLARIFAI START");
        Log.d(TAG, "CLARIFAI START");
        Log.d(TAG, "CLARIFAI START");
        Scanner sc= new Scanner(System.in);
        Log.d(TAG, "CLARIFAI START after new Scanner");
        //System.out.print("Enter image url: ");
        String str;//= sc.nextLine();


        while(sc.hasNextLine()){
            str=sc.nextLine();
            Log.d(TAG, "CLARIFAI START inside while(sc.hasNextLine())");
            //...
        }

        String k="xxxxxxx";

        Log.d(TAG, "CLARIFAI START after sc.nextLine();");
//model connection
         // V2Grpc.V2BlockingStub stub = V2Grpc.newBlockingStub(ClarifaiChannel.INSTANCE.getGrpcChannel())
            // .withCallCredentials(new ClarifaiCallCredentials(k));
        Log.d(TAG, "CLARIFAI START after V2Grpc.V2BlockingStub stub");
        //image send and id // Image.newBuilder().setUrl(str)
        // MultiOutputResponse response = stub.postModelOutputs(PostModelOutputsRequest.newBuilder().setModelId("bd367be194cf45149e75f01d59f77ba7").addInputs(Input.newBuilder().setData(Data.newBuilder().setImage(Image.newBuilder().setUrl("str")))).build());
        Log.d(TAG, "CLARIFAI START after MultiOutputResponse response");



        Log.d(TAG, "CLARIFAI END");
        Log.d(TAG, "CLARIFAI END");
        Log.d(TAG, "CLARIFAI END");
        Log.d(TAG, "CLARIFAI END");
        Log.d(TAG, "CLARIFAI END");
        Log.d(TAG, "CLARIFAI END");
//clarifai end
       /* ClarifaiTest t=new ClarifaiTest();
        try {
            t.clard(imagelinkkk);
        } catch (SSLException e) {
            e.printStackTrace();
        }*/
//linkkkkkkkkk
        try {
            tesst(imagelinkkk);
        } catch (SSLException e) {
            e.printStackTrace();
        }


        Log.d(TAG, "MainActivityResult ENDED");
        Log.d(TAG, "MainActivityResult ENDED");
        Log.d(TAG, "MainActivityResult ENDED");
        Log.d(TAG, "MainActivityResult ENDED");
        Log.d(TAG, "MainActivityResult ENDED");
        Log.d(TAG, "MainActivityResult ENDED");
    }


    public void link(String m) {
        Log.i(TAG, " Link Came IN MAINACTIVITYresult.java public void link");
        Log.i(TAG, " Link Came IN MAINACTIVITYresult.java public void link");
        Log.i(TAG, m);
        Log.i(TAG, m);
        Log.i(TAG, m);
        Log.i(TAG, m);
        Log.i(TAG, m);
        Log.i(TAG, m);
        Log.i(TAG, m);
        Log.i(TAG, m);
        Log.i(TAG, " Link Came IN MAINACTIVITYresult.java public void link");
        Log.i(TAG, " Link Came IN MAINACTIVITYresult.java public void link");
        Log.i(TAG, " Link Came IN MAINACTIVITYresult.java public void link");
        imagelinkkk=m;

       /* Intent intent = new Intent(this, ClarifaiTest.class);
        intent.putExtra("message", m);
        startActivity(intent);*/

    }







   public void tesst(String errr) throws SSLException {





        Log.d(TAG, "INSIDE CLARD ");
        Log.d(TAG, "INSIDE CLARD ");
        Log.d(TAG, "INSIDE CLARD ");
        Log.d(TAG, "INSIDE CLARD ");
        Log.d(TAG, "INSIDE CLARD ");
        Log.d(TAG, "INSIDE CLARD ");

        //bd367be194cf45149e75f01d59f77ba7
//k 203024c4f32e47df80115ca3f77800d2
//model connection
        V2Grpc.V2BlockingStub stub = V2Grpc.newBlockingStub(ClarifaiChannel.INSTANCE.getInsecureGrpcChannel())
                .withCallCredentials(new ClarifaiCallCredentials("xxxxxxxxxx"));
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        //image send and id // Image.newBuilder().setUrl(str)
        MultiOutputResponse response = stub.postModelOutputs(
                PostModelOutputsRequest.newBuilder()
                        .setModelId("xxxxxxxxxx")
                        .addInputs(
                                Input.newBuilder().setData(
                                        Data.newBuilder().setImage(
                                                Image.newBuilder().setUrl(errr)
                                        )
                                )
                        )
                        .build()
        );
        //response code
        Log.d(TAG, "Before If of response code");
        Log.d(TAG, "Before If of response code");
        Log.d(TAG, "Before If of response code");
        Log.d(TAG, "Before If of response code");
        if (response.getStatus().getCode() != StatusCode.SUCCESS) {
            Log.d(TAG, "Status Failed");
            Log.d(TAG, "Status Failed");
            Log.d(TAG, "Status Failed");
            Log.d(TAG, "Status Failed");
            throw new RuntimeException("Request failed, status: " + response.getStatus());
            // String res = response.getStatus();
        }

        Log.d(TAG, "AFTER If of response code");
        Log.d(TAG, "AFTER If of response code");
        Log.d(TAG, "AFTER If of response code");
        Log.d(TAG, "AFTER If of response code");
        Log.d(TAG, "AFTER If of response code");


        //status code for debug

       finaltxt=(TextView)findViewById(R.id.restultxt);

        for (Concept c : response.getOutputs(0).getData().getConceptsList()) {

            System.out.println(String.format("%12s: %,.2f", c.getName(), c.getValue()));
            // System.out.println(String.format("%12s: ", c.getName()));
//finaltxt.setText(String.format("%12s: %,.2f", c.getName(), c.getValue()));

        }


    }




}


