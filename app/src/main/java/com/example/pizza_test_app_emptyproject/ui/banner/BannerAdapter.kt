package com.example.pizza_test_app.ui.banner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizza_test_app_emptyproject.R
import com.example.pizza_test_app_emptyproject.databinding.BannerItemBinding

class BannerAdapter : RecyclerView.Adapter<BannerAdapter.BannerHolder>() {
    val bannerList = mutableListOf(Banner(R.drawable.banner1), Banner(R.drawable.banner2))

    class BannerHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = BannerItemBinding.bind(item)
        fun bind(banner: Banner) = with(binding) {
            im.setImageResource(banner.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.banner_item, parent, false)
        return BannerHolder(view)
    }

    override fun getItemCount(): Int {
        return bannerList.size
    }

    override fun onBindViewHolder(holder: BannerHolder, position: Int) {
        holder.bind(bannerList[position])
    }
}