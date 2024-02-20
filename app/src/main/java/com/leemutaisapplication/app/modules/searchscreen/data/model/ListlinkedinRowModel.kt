package com.leemutaisapplication.app.modules.searchscreen.`data`.model

import com.leemutaisapplication.app.R
import com.leemutaisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlinkedinRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMumbai: String? = MyApp.getInstance().resources.getString(R.string.lbl_mumbai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHouseName: String? = MyApp.getInstance().resources.getString(R.string.lbl_house_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt45OUTOFFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5_out_of_5)

)
