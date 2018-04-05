package com.scottquch.retrofitmvvmdemo.repos

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.scottquch.retrofitmvvmdemo.Repository
import com.scottquch.retrofitmvvmdemo.models.RepoModel

class UserReposViewModel : ViewModel() {

    private var userRepos: MutableLiveData<List<RepoModel>> = Repository.getInstance().usersRepo


    fun getUserReposObservable(): MutableLiveData<List<RepoModel>> {
        return userRepos
    }

    /**
     * Makes a request to the repository to begin a new search with the new user
     */
    fun searchForUserRepos(searchedUser: String) {
        userRepos = Repository.getInstance().requestUserRepos(searchedUser)
    }

    override fun onCleared() {
        super.onCleared()
    }
}