package com.hoax.foodfyp.ui

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hoax.foodfyp.BuildConfig
import com.hoax.foodfyp.R
import com.hoax.foodfyp.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.hoax.foodfyp.MainActivityResult
import com.hoax.foodfyp.MainActivitylist
import org.koin.androidx.viewmodel.ext.android.viewModel
import permissions.dispatcher.PermissionRequest
import permissions.dispatcher.ktx.constructPermissionsRequest

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModel()

    /**
     * A permission request for storage to access the users camera roll.
     * https://github.com/permissions-dispatcher/PermissionsDispatcher/tree/master/ktx
     */
    private val storageRequest = constructPermissionsRequest(
        Manifest.permission.READ_EXTERNAL_STORAGE,
        onShowRationale = ::onShowStoragePermissionRationale,
        onPermissionDenied = ::onStoragePermissionDenied,
        onNeverAskAgain = ::onStoragePermissionNeverAskAgain

    ) {

        val intent = Intent().apply {
            type = "image/*"
            action = Intent.ACTION_OPEN_DOCUMENT
            addCategory(Intent.CATEGORY_OPENABLE)
        }
        startActivityForResult(Intent.createChooser(intent, "Select Image"), REQUEST_IMAGE)

        Log.i(TAG, "Selecting Image ")
        Log.i(TAG, "Selecting Image ")
        Log.i(TAG, "Selecting Image ")
        Log.i(TAG, "Selecting Image ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            viewModel = this@MainActivity.viewModel
            lifecycleOwner = this@MainActivity



            next.setOnClickListener{

            val i = Intent(this@MainActivity, MainActivitylist::class.java)
                startActivity(i)
            }



        }
        setContentView(binding.root)

        setupView()

      //  val text = "Welcome boi!"
       // val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, "Welcome boi!", Toast.LENGTH_SHORT)
        toast.show()
    }

    private fun setupView() {
        binding.chooseImageButton.setOnClickListener {
            storageRequest.launch()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {

            val uri = data?.data ?: return

            when (requestCode) {
                REQUEST_IMAGE -> {

                    val takeFlags = data.flags.and(Intent.FLAG_GRANT_READ_URI_PERMISSION).or(Intent.FLAG_GRANT_WRITE_URI_PERMISSION)

                    try {
                        contentResolver.takePersistableUriPermission(uri, takeFlags)
                        viewModel.selectedImageUri(uri)
                        Log.i(TAG, " Image selected")
                        Log.i(TAG, " Image selected")
                        Log.i(TAG, " Image selected")
                        Log.i(TAG, " Image selected")
                    }
                    catch (e: SecurityException){
                        MaterialAlertDialogBuilder(this)
                            .setTitle(R.string.error)
                            .setMessage(e.localizedMessage)
                            .create()
                            .show()
                    }

                }

            }
        }
        val toasts = Toast.makeText(applicationContext, "Pic added!", Toast.LENGTH_SHORT)
        toasts.show()

    }

    private fun onShowStoragePermissionRationale(request: PermissionRequest) {
        request.proceed()
    }

    private fun onStoragePermissionDenied() {
        showPermissionErrorSnackbar()
    }

    private fun onStoragePermissionNeverAskAgain() {
       showPermissionErrorSnackbar()
    }

    private fun showPermissionErrorSnackbar(){
        Snackbar.make(binding.root, R.string.permission_denied, Snackbar.LENGTH_LONG).setAction(R.string.settings){
            startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:" + BuildConfig.APPLICATION_ID)))
        }.show()
    }

    companion object{
        private const val REQUEST_IMAGE = 2021
    }



    fun mylink(asss: String){
        Log.i(TAG, "Selecting Image ")
        Log.i(TAG, " Link Came IN MAINACTIVITY.KT fun myling sss")
        Log.i(TAG, " Link Came IN MAINACTIVITY.KT fun myling sss")
        Log.i(TAG, " Link Came IN MAINACTIVITY.KT fun myling sss")
        Log.i(TAG, " Link Came IN MAINACTIVITY.KT fun myling sss")
        Log.i(TAG, " Link Came IN MAINACTIVITY.KT fun myling sss")
        val a=asss
        Log.i(TAG, a)
        Log.i(TAG, a)
        Log.i(TAG, a)
        Log.i(TAG, a)
        Log.i(TAG, a)

        val dd= MainActivityResult()
        //val m:String?
        dd.link(a)
    }



}