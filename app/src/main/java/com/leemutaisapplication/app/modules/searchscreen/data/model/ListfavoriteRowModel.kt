package com.leemutaisapplication.app.modules.searchscreen.`data`.model

import com.leemutaisapplication.app.R
import com.leemutaisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListfavoriteRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_abcsd_apartment)

)
