package com.hoax.foodfyp;




import android.util.Log;

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


import javax.net.ssl.SSLException;


public class ClarifaiTest {
    private static final String TAG = "ClarifaiTest";
    void clard(String errr) throws SSLException {





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
               .withCallCredentials(new ClarifaiCallCredentials("xxxxxx"));
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        Log.d(TAG, "AFTER V2Grpc.V2BlockingStub stub ");
        //image send and id // Image.newBuilder().setUrl(str)
        MultiOutputResponse response = stub.postModelOutputs(
                PostModelOutputsRequest.newBuilder()
                        .setModelId("xxxxx")
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



        for (Concept c : response.getOutputs(0).getData().getConceptsList()) {

            System.out.println(String.format("%12s: %,.2f", c.getName(), c.getValue()));
           // System.out.println(String.format("%12s: ", c.getName()));


        }


    }


}
