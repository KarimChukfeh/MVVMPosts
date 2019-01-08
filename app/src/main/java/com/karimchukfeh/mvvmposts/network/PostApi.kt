package com.karimchukfeh.mvvmposts.network

import com.karimchukfeh.mvvmposts.model.Post
import retrofit2.http.GET
import io.reactivex.Observable

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}