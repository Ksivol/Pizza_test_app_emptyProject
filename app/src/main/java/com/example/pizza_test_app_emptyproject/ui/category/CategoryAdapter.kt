package com.example.pizza_test_app_emptyproject.ui.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizza_test_app_emptyproject.R
import com.example.pizza_test_app_emptyproject.databinding.CategoryItemBinding

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {
    private val categoryList = mutableListOf(
        Category("Пицца"),
        Category("Комбо"),
        Category("Десерты"),
        Category("Напитки")
    )

    class CategoryHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = CategoryItemBinding.bind(item)
        fun bind(category: Category) = with(binding) {
            tvCategory.text = category.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind(categoryList[position])
    }


}