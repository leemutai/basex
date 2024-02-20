package com.leemutaisapplication.app.modules.searchscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leemutaisapplication.app.R
import com.leemutaisapplication.app.databinding.RowListlinkedinBinding
import com.leemutaisapplication.app.modules.searchscreen.`data`.model.ListlinkedinRowModel
import kotlin.Int
import kotlin.collections.List

class ListlinkedinAdapter(
  var list: List<ListlinkedinRowModel>
) : RecyclerView.Adapter<ListlinkedinAdapter.RowListlinkedinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlinkedinVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlinkedin,parent,false)
    return RowListlinkedinVH(view)
  }

  override fun onBindViewHolder(holder: RowListlinkedinVH, position: Int) {
    val listlinkedinRowModel = ListlinkedinRowModel()
    // TODO uncomment following line after integration with data source
    // val listlinkedinRowModel = list[position]
    holder.binding.listlinkedinRowModel = listlinkedinRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlinkedinRowModel>) {
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
      item: ListlinkedinRowModel
    ) {
    }
  }

  inner class RowListlinkedinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlinkedinBinding = RowListlinkedinBinding.bind(itemView)
  }
}
