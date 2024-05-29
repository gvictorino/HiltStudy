package com.victorino.hiltstudy.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.victorino.hiltstudy.data.Cat
import com.victorino.hiltstudy.databinding.ItemCatBinding

class CatAdapter : ListAdapter<CatVO, CatAdapter.CatViewHolder>(CatDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val binding = ItemCatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class CatViewHolder(private val binding: ItemCatBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(cat: CatVO) {
            binding.catName.text = cat.name
            binding.catOrigin.text = cat.origin
            binding.catLength.text = cat.length
            binding.catImage.loadImageWithTopRoundedCorners(cat.image)

        }
    }

    class CatDiffCallback : DiffUtil.ItemCallback<CatVO>() {
        override fun areItemsTheSame(oldItem: CatVO, newItem: CatVO): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: CatVO, newItem: CatVO): Boolean {
            return oldItem == newItem
        }
    }
}

fun ImageView.loadImageWithTopRoundedCorners(
    imageUrl: String?,
    topLeftCornerRadius: Float = 0f,
    topRightCornerRadius: Float = 0f,
) {
    load(imageUrl) {
        transformations(RoundedCornersTransformation(topLeftCornerRadius, topRightCornerRadius))
    }
}
