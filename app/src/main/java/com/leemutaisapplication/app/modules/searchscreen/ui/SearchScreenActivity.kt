package com.leemutaisapplication.app.modules.searchscreen.ui

import android.view.View
import androidx.activity.viewModels
import com.leemutaisapplication.app.R
import com.leemutaisapplication.app.appcomponents.base.BaseActivity
import com.leemutaisapplication.app.databinding.ActivitySearchScreenBinding
import com.leemutaisapplication.app.modules.searchscreen.`data`.model.ListfavoriteRowModel
import com.leemutaisapplication.app.modules.searchscreen.`data`.model.ListlinkedinRowModel
import com.leemutaisapplication.app.modules.searchscreen.`data`.viewmodel.SearchScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchScreenActivity :
    BaseActivity<ActivitySearchScreenBinding>(R.layout.activity_search_screen) {
  private val viewModel: SearchScreenVM by viewModels<SearchScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfavoriteAdapter =
    ListfavoriteAdapter(viewModel.listfavoriteList.value?:mutableListOf())
    binding.recyclerListfavorite.adapter = listfavoriteAdapter
    listfavoriteAdapter.setOnItemClickListener(
    object : ListfavoriteAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfavoriteRowModel) {
        onClickRecyclerListfavorite(view, position, item)
      }
    }
    )
    viewModel.listfavoriteList.observe(this) {
      listfavoriteAdapter.updateData(it)
    }
    val listlinkedinAdapter =
    ListlinkedinAdapter(viewModel.listlinkedinList.value?:mutableListOf())
    binding.recyclerListlinkedin.adapter = listlinkedinAdapter
    listlinkedinAdapter.setOnItemClickListener(
    object : ListlinkedinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlinkedinRowModel) {
        onClickRecyclerListlinkedin(view, position, item)
      }
    }
    )
    viewModel.listlinkedinList.observe(this) {
      listlinkedinAdapter.updateData(it)
    }
    binding.searchScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListfavorite(
    view: View,
    position: Int,
    item: ListfavoriteRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListlinkedin(
    view: View,
    position: Int,
    item: ListlinkedinRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_SCREEN_ACTIVITY"

  }
}
