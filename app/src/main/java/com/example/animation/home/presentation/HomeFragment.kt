package com.example.animation.home.presentation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.animation.R
import com.example.animation.home.presentation.adapter.HomeAdapter
import com.example.animation.home.presentation.model.HomeUiModel
import kotlinx.android.synthetic.main.home_fragment.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private val viewModel by viewModel<HomeViewModel>()

    private val adapter by lazy {
        HomeAdapter(
            onItemClick = {}
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vItems.run {
            adapter = this@HomeFragment.adapter
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.uiModel.observe(viewLifecycleOwner, ::setUi)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
    }

    private fun setUi(model: HomeUiModel) {
        adapter.items = model.list
    }
}
