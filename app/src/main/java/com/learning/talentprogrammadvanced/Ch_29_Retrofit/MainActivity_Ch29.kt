package com.learning.talentprogrammadvanced.Ch_29_Retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.adapter.PostAdapter
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.model.PostItem
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.network.APIService
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.network.RetrofitInstance
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh29Binding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity_Ch29 : AppCompatActivity() {
    private lateinit var binding : ActivityMainCh29Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCh29Binding.inflate(layoutInflater)
        binding.apply {
            setContentView(root)

            val apiService = RetrofitInstance.getInstance().create(APIService::class.java)
            val post = apiService.getPosts()
            post.enqueue(object : Callback<List<PostItem>>{
                override fun onResponse(
                    call: Call<List<PostItem>?>,
                    response: Response<List<PostItem>?>
                ) {
                    if(response.isSuccessful && response.body() != null){
                        val postModelList = response.body()!!
                        rvPost.adapter  = PostAdapter(postModelList)
                    }
                }

                override fun onFailure(
                    call: Call<List<PostItem>?>,
                    t: Throwable
                ) {
                    Log.e("Failure", t.message.toString())
                }

            })
        }
    }
}