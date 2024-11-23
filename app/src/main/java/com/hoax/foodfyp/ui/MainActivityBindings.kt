package com.hoax.foodfyp.ui


import android.net.Uri
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.google.android.material.progressindicator.ProgressIndicator
import com.hoax.foodfyp.model.Upload
import com.hoax.foodfyp.utils.AsyncState
import com.hoax.foodfyp.utils.Loading
import com.hoax.foodfyp.utils.Success

private const val TAG = "Bindings"
/**
 * Custom bindings for the [MainActivity] view
 */


@BindingAdapter("uploadUri")
fun setUploadUri(button: Button, uri: Uri?){
    button.isEnabled = uri != null
}

@BindingAdapter("uriImage")
fun setUriImage(imageView: ImageView, uri: Uri?){
    imageView.setImageURI(uri)
}

@BindingAdapter("completedUploadLink")
fun setCompletedUploadLink(textView: TextView, upload: AsyncState<Upload>?){
    textView.text = (upload as? Success<Upload>)?.value?.link

    //add tost here
val a = (upload as? Success<Upload>)?.value?.link

    Log.i(TAG, "fun setCompletedUploadLink ")
    if (a != null) {
        Log.i(TAG, a)
        Log.i(TAG, a)
        Log.i(TAG, a)
        Log.i(TAG, a)
        Log.i(TAG, a)
        Log.i(TAG, a)
        Log.i(TAG, a)

        val s= MainActivity()
        s.mylink(a)
       // val intent = Intent(this@MainActivityBindings,MainActivityResult::class.java);

    }

}

/**
 * Shows a progressIndicator or hides it based on some data's [AsyncState]
 */
@BindingAdapter("progressVisibility")
fun setProgressVisibility(progressIndicator: ProgressIndicator, state: AsyncState<Any?>?){
    if(state == Loading){
        progressIndicator.visibility = View.VISIBLE
    }else{
        progressIndicator.visibility = View.INVISIBLE
    }
}

/**
 * Shows a button or hides it based on some data's [AsyncState]
 */
@BindingAdapter("buttonVisibility")
fun setButtonVisibility(button: Button, state: AsyncState<Any?>?){
    if(state == Loading){
        button.visibility = View.INVISIBLE
    }else{
        button.visibility = View.VISIBLE
    }
}




