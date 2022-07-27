package com.example.classwork4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classwork4.databinding.XoViewBinding

class XoAdapter(
    private val clickOpen: (XoModel) -> Unit

) : RecyclerView.Adapter<XoAdapter.PicViewHolder>() {
    private var list: List<> = listOf()
    fun subList(newList: List<>) {
        this.list = newList
    }

    class PicViewHolder(private val binding: XoViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(modelPic: XoModel, clickOpen: (XoModel) -> Unit) {
            with(binding) {
                ivOne.setImageResource(modelPic.image)
                ivOne.setOnClickListener { clickOpen(modelPic) }
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicViewHolder {
        val binding = PicViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PicViewHolder, position: Int) {
        val picture = list[position]
        holder.bind(picture, clickOpen)
    }

    override fun getItemCount() = list.size


}