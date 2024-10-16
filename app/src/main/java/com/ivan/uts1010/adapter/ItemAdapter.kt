package com.ivan.uts1010.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ivan.uts1010.R
import com.ivan.uts1010.model.ItemModel

class ItemAdapter(
    private val itemOrder: List<ItemModel>) :
    RecyclerView.Adapter<ItemAdapter.BukuAdapterHolder>() {

    //view holder yang digunakan unutk menyimpan referensi layout item
    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view){
        val imgMenu: ImageView = itemView.findViewById(R.id.imgMenu)
        val txtNamaMenu: TextView = itemView.findViewById(R.id.tvNamaMenu)
        val txtTanggal: TextView = itemView.findViewById(R.id.tvTanggal)
        val txtharga: TextView = itemView.findViewById(R.id.tvharga)
        val txtItems: TextView = itemView.findViewById(R.id.tvItems)
    }

    //pengaturan data item pada setiap list dari recycle view
    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {
        val currentItem = itemOrder[position]
        holder.imgMenu.setImageResource(currentItem.imageMenu)
        holder.txtNamaMenu.setText(currentItem.namaMenu)
        holder.txtTanggal.setText(currentItem.Tanggal)
        holder.txtharga.setText(currentItem.Harga)
        holder.txtItems.setText(currentItem.totalItem)
    }

    //membuat layout list item sebagai item dari recycle view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuAdapterHolder {

        // Inflate layout item_destination.xml (pastikan file XML ini ada)
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return BukuAdapterHolder(nView)
    }

    //mengembalikan panjang nilai dari data
    override fun getItemCount(): Int{
        return itemOrder.size
    }

}