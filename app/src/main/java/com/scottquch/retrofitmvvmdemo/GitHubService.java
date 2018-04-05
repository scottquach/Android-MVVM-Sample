package com.scottquch.retrofitmvvmdemo;

import com.scottquch.retrofitmvvmdemo.models.RepoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    String GITHUB_HTTP_API_URL = "https://api.github.com";

    @GET("users/{user}/repos")
    Call<List<RepoModel>> listRepos(@Path("user") String user);
}
