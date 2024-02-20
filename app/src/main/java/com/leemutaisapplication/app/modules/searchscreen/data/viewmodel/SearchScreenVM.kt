package com.leemutaisapplication.app.modules.searchscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leemutaisapplication.app.modules.searchscreen.`data`.model.ListfavoriteRowModel
import com.leemutaisapplication.app.modules.searchscreen.`data`.model.ListlinkedinRowModel
import com.leemutaisapplication.app.modules.searchscreen.`data`.model.SearchScreenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchScreenVM : ViewModel(), KoinComponent {
  val searchScreenModel: MutableLiveData<SearchScreenModel> = MutableLiveData(SearchScreenModel())

  var navArguments: Bundle? = null

  val listfavoriteList: MutableLiveData<MutableList<ListfavoriteRowModel>> =
      MutableLiveData(mutableListOf())

  val listlinkedinList: MutableLiveData<MutableList<ListlinkedinRowModel>> =
      MutableLiveData(mutableListOf())
}
