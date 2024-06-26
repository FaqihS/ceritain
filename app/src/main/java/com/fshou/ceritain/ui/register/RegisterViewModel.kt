package com.fshou.ceritain.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.fshou.ceritain.data.AppRepository
import com.fshou.ceritain.data.Result
import com.fshou.ceritain.data.remote.response.BaseResponse


class RegisterViewModel (private val appRepository: AppRepository): ViewModel() {

    fun register(name: String,email:String,password:String): LiveData<Result<BaseResponse>> = appRepository.register(name,email,password)


}