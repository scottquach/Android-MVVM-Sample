package com.scottquch.retrofitmvvmdemo

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import com.scottquch.retrofitmvvmdemo.models.RepoModel
import com.scottquch.retrofitmvvmdemo.repos.UserReposViewModel
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito.isNotNull
import org.mockito.Mockito.verify

class MainUnitTest {

    @Mock
    lateinit var observer: Observer<List<RepoModel>>

    @Test
    fun testLoadingVisibility() {

    }
}