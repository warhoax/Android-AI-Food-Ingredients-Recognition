package com.hoax.foodfyp.ui

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hoax.foodfyp.model.Upload
import com.hoax.foodfyp.repo.UploadRepository
import com.hoax.foodfyp.utils.AsyncState
import com.hoax.foodfyp.utils.Fail
import com.hoax.foodfyp.utils.Loading
import com.hoax.foodfyp.utils.Success
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

class MainViewModel(private val uploadRepository: UploadRepository): ViewModel() {
    val imageUri = MutableLiveData<Uri>()
    val uploadData = MutableLiveData<AsyncState<Upload>>()

    fun selectedImageUri(uri: Uri) {
        imageUri.value = uri
    }

    fun uploadImage() {
        val coroutineExceptionHandler = CoroutineExceptionHandler { _, exception ->
            uploadData.postValue(Fail(exception))
        }
        viewModelScope.launch(coroutineExceptionHandler) {
            val uri = imageUri.value ?: return@launch

            uploadData.postValue(Loading)
            uploadRepository.uploadFile(uri).fold(
                {
                    uploadData.postValue(Success(it))
                },
                {
                    uploadData.postValue(Fail(it))
                }
            )
        }
    }

}