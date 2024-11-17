package ru.netology.nework.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.netology.nework.R
import ru.netology.nework.databinding.FragmentEventsBinding
import ru.netology.nework.databinding.FragmentUsersBinding


class UsersFragment : Fragment() {

    private var _binding: FragmentUsersBinding? = null
    private val binding: FragmentUsersBinding
        get() = _binding ?: throw RuntimeException("UsersFragment == null")

            override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUsersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun launchPostsFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, PostsFragment.newInstancePost())
            .addToBackStack(null)
            .commit()
    }

    private fun launchEventsFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, EventsFragment.newInstanceEvent())
            .addToBackStack(null)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        fun newInstanceUser() : UsersFragment {
            return UsersFragment()
        }
    }
}