package com.scottquch.retrofitmvvmdemo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.scottquch.retrofitmvvmdemo.models.RepoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;

public class Repository {

    GitHubService githubService;

    private static Repository instance;
    private final MutableLiveData<List<RepoModel>> usersRepo = new MutableLiveData();

    public Repository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GitHubService.GITHUB_HTTP_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        this.githubService = retrofit.create(GitHubService.class);
        instance = this;
    }

    public MutableLiveData<List<RepoModel>> requestUserRepos(String user) {
        githubService.listRepos(user).enqueue(new Callback<List<RepoModel>>() {
            @Override
            public void onResponse(Call<List<RepoModel>> call, Response<List<RepoModel>> response) {
                Timber.d("response body was " + response.body());
                 usersRepo.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<RepoModel>> call, Throwable t) {
                Timber.e(t, "Error getting user repos");
            }
        });

        return usersRepo;
    }

    public MutableLiveData<List<RepoModel>> getUsersRepo() {
        return usersRepo;
    }

    public synchronized static Repository getInstance() {
        if (instance == null) {
            return new Repository();
        }
        return instance;
    }

}
