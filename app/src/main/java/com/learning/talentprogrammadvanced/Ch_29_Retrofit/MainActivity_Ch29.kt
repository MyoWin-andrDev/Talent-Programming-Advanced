package com.learning.talentprogrammadvanced.Ch_29_Retrofit

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.adapter.PostAdapter
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.model.PostItem
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.network.APIService
import com.learning.talentprogrammadvanced.Ch_29_Retrofit.network.RetrofitInstance
import com.learning.talentprogrammadvanced.databinding.ActivityMainCh29Binding
import kotlinx.coroutines.launch
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
        }
        lifecycleScope.launch {
            functionA()
            functionB()
            functionC()
            fetchData()
            functionD()
            functionE()
        }
    }

    fun functionA(){
        Log.d("FunA","Function A")
    }
    fun functionB(){
        Log.d("FunB","Function B")
    }
    fun functionC(){
        Log.d("FunC","Function C")
    }
    fun functionD(){
        Log.d("FunD","Function D")
    }
    fun functionE(){
        Log.d("FunE","Function E")
    }
    
    suspend fun fetchData(){
        val apiService = RetrofitInstance.getInstance().create(APIService::class.java)
        val postResponse = apiService.getPosts()
        try{
            if(postResponse.isSuccessful && postResponse.body() != null){
                binding.rvPost.adapter = PostAdapter(postResponse.body()!!)
                Log.d("FunFetch", "This is Network Call when response!")
            }
        }catch (e : Exception){
            Toast.makeText(this@MainActivity_Ch29, "${e.message}", Toast.LENGTH_SHORT).show()
        }
//        post.enqueue(object : Callback<List<PostItem>>{
//            override fun onResponse(
//                call: Call<List<PostItem>?>,
//                response: Response<List<PostItem>?>
//            ) {
//                if(response.isSuccessful && response.body() != null){
//                    val postModelList = response.body()!!
//                    binding.rvPost.adapter  = PostAdapter(postModelList)
//                    Log.d("FunFetch", "This is Network Call when response!")
//                }
//            }
//
//            override fun onFailure(
//                call: Call<List<PostItem>?>,
//                t: Throwable
//            ) {
//                Log.e("Failure", t.message.toString())
//            }
//
//        })
    }
}