package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers

class RecipeDetail: AppCompatActivity() {

    //private lateinit var recipeDetailList: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_detail)

//        val favButton = findViewById<Button>(R.id.favoriteButton)
//        favButton.setOnClickListener {
//                val intent = Intent(this@RecipeDetail, RecipeDetail::class.java)
//                startActivity (intent)}
    }

}

    //recipeDetailList = mutableListOf()

    //getrecipeDetailList()

   //}

//private fun getrecipeDetailList() {
//
//    val client = AsyncHttpClient()
//
//    client["https://api.spoonacular.com/recipes/complexSearch?apiKey=d9e6aa65b5df4e978b183ede18e3f384", object :
//        JsonHttpResponseHandler() {
//        //https://api.spoonacular.com/recipes/complexSearch?apiKey=d9e6aa65b5df4e978b183ede18e3f384&query=chicken
//        override fun onSuccess(
//            statusCode: Int,
//            headers: Headers,
//            json: JSON?
//        ) {
//            val response = json?.jsonObject
//            if (response != null) {
//                val resultsArray = response.getJSONArray("results")
////            }
////            Log.d("DEBUG ARRAY", json.jsonArray.toString())
////            Log.d("DEBUG OBJECT", json.jsonObject.toString())
////            //Log.d("Recipe Success", "response successful$json")
//
//                for (i in 0 until resultsArray.length()) {
//                    //recipeList.add(recipeImageArray.getJSONObject(i).getString("image"))
//                    //recipeName.add(recipeImageArray.getJSONObject("results").getString("name"))
//
//                    val recipeObject = resultsArray.getJSONObject(i)
//
//                    // Get the image URL from the object using the "url" key
//
//                    // Get the recipe name from the object using the "name" key
//                    //val recipeNameValue = recipeObject.getString("name")
//                    val recipeNameValue = recipeObject.getString("title")
//                    val recipeDetail = recipeObject.getString("")
//
//                    // Now you can use imageUrl and recipeNameValue as needed
//                    recipeName.add(recipeNameValue)
//
//                        )
//                    )
//                }
//
//            }
      // }
