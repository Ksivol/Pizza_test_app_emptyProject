package com.example.pizza_test_app_emptyproject.ui.product

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pizza_test_app_emptyproject.R
import com.example.pizza_test_app_emptyproject.databinding.ProductItemBinding

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    val productList = mutableListOf(
        Product(
            R.drawable.ic_ham_and_mushrooms,
            "Ветчина и грибы",
            "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус"
        ),
        Product(
            R.drawable.ic_bavarian_sausages,
            "Баварские колбаски",
            "Баварские колбаски, ветчина,пикантная пепперони, острая чоризо,томатный соус"
        ),
        Product(
            R.drawable.ic_tender_salmon,
            "Нежный лосось",
            "Лосось, томаты, оливки,соус песто,помидорки черри"
        )
    )

    class ProductHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = ProductItemBinding.bind(item)

        fun bind(product: Product) = with(binding) {
            imPizza.setImageResource(product.imageId)
            tvTitle.text = product.title
            tvSpecification.text = product.specification

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bind(productList[position])
    }

}