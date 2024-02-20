package com.leemutaisapplication.app.modules.searchscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leemutaisapplication.app.R
import com.leemutaisapplication.app.databinding.RowListfavoriteBinding
import com.leemutaisapplication.app.modules.searchscreen.`data`.model.ListfavoriteRowModel
import kotlin.Int
import kotlin.collections.List

class ListfavoriteAdapter(
  var list: List<ListfavoriteRowModel>
) : RecyclerView.Adapter<ListfavoriteAdapter.RowListfavoriteVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfavoriteVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfavorite,parent,false)
    return RowListfavoriteVH(view)
  }

  override fun onBindViewHolder(holder: RowListfavoriteVH, position: Int) {
    val listfavoriteRowModel = ListfavoriteRowModel()
    // TODO uncomment following line after integration with data source
    // val listfavoriteRowModel = list[position]
    holder.binding.listfavoriteRowModel = listfavoriteRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfavoriteRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListfavoriteRowModel
    ) {
    }
  }

  inner class RowListfavoriteVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfavoriteBinding = RowListfavoriteBinding.bind(itemView)
  }
}
