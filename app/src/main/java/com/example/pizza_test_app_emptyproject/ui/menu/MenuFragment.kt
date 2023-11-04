package com.example.pizza_test_app_emptyproject.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizza_test_app_emptyproject.ui.banner.BannerAdapter
import com.example.pizza_test_app_emptyproject.databinding.FragmentMenuBinding
import com.example.pizza_test_app_emptyproject.ui.category.CategoryAdapter

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val adapterBanner = BannerAdapter()
    private val adapterCategory = CategoryAdapter()
    private val binding get() = _binding!!

    private val vm: MenuViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initCatedory()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun init() = with(binding) {
        rcView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        rcView.adapter = adapterBanner
    }
    private fun initCatedory() = with(binding){
        rcViewCategory.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        rcViewCategory.adapter = adapterCategory
    }
}