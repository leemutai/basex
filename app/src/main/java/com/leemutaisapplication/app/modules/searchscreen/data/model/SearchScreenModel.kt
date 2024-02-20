package com.leemutaisapplication.app.modules.searchscreen.`data`.model

import com.leemutaisapplication.app.R
import com.leemutaisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_results)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_show_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommendation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recommendation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchbarValue: String? = null
)
