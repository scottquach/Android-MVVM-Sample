package com.scottquch.retrofitmvvmdemo.repos


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.scottquch.retrofitmvvmdemo.R
import com.scottquch.retrofitmvvmdemo.models.RepoModel
import kotlinx.android.synthetic.main.fragment_user_repos_list_fragment.*
import timber.log.Timber

class UserReposListFragment : Fragment() {

    private lateinit var viewModel: UserReposViewModel
    private val adapter by lazy {
        RepoAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_repos_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(UserReposViewModel::class.java)

        recycler_repo_list.apply {
            layoutManager = LinearLayoutManager(this@UserReposListFragment.context)
            adapter = this@UserReposListFragment.adapter
        }

        viewModel.getUserReposObservable().observe(this, Observer<List<RepoModel>> {
            Timber.d("Changed data was ${it.toString()}")
            hideLoading()
            adapter.setRepoData(it)
        })

        fab_search.setOnClickListener {
            showSearchInputDialog()
        }
    }

    /**
     * Shows a text input alert dialog for the user to enter the name of a GitHub profile to
     * search for that profiles reposiories
     */
    private fun showSearchInputDialog() {
        val inputText = EditText(context).apply {
            inputType = InputType.TYPE_CLASS_TEXT
        }

        AlertDialog.Builder(context)
                .setTitle(getString(R.string.dialog_user_search_title))
                .setCancelable(true)
                .setView(inputText)
                .setPositiveButton(getString(R.string.search)) { dialog, which ->
                    viewModel.searchForUserRepos(inputText.text.toString())
                    showLoading()
                    dialog.dismiss()
                }
                .setNegativeButton(getString(R.string.cancel), { dialog, which ->
                    dialog.dismiss()
                })
                .create()
                .show()
    }

    /**
     * Shows the loading progress view
     */
    fun showLoading() {
        progress_repo_loading?.visibility = View.VISIBLE
    }

    /**
     * Hides the loading progress view
     */
    fun hideLoading() {
        progress_repo_loading?.visibility = View.GONE
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment UserReposListFragment.
         */
        @JvmStatic
        fun newInstance() =
                UserReposListFragment().apply {
                    arguments = Bundle().apply {

                    }
                }
    }
}
