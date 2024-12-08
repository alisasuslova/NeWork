package ru.netology.nework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.netology.nework.R
import ru.netology.nework.databinding.FragmentPostsBinding

class PostsFragment : Fragment() {

    private var _binding: FragmentPostsBinding? = null
    private val binding: FragmentPostsBinding
        get() = _binding ?: throw RuntimeException("PostsFragment == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPostsBinding.inflate(inflater, container, false)



        binding.listPosts.apply {
            findNavController().navigate(
                R.id.action_postsFragment_to_newPost)

        }










        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    /*private fun launchEventsFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, EventsFragment.newInstanceEvent())
            .addToBackStack(null)
            .commit()
    }

    private fun launchUsersFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, UsersFragment.newInstanceUser())
            .addToBackStack(null)
            .commit()
    }*/


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        val TAG: String = PostsFragment::class.java.simpleName
        fun newInstancePost() = PostsFragment()

    }
}