package com.example.finalproject

//import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers

class MainActivity : AppCompatActivity() {
    private lateinit var recipeList: MutableList<String>
    private lateinit var recipeName: MutableList<String>
    private lateinit var recyclerViewRecipes: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerViewRecipes = findViewById(R.id.recipeRecyclerView)
        recipeList = mutableListOf()
        recipeName = mutableListOf()

        getRecipeImageList()

        //}
    }

    //public fun testButton() {
    //    Log.d("test", "test")
    //}
        private fun getRecipeImageList() {

        val client = AsyncHttpClient()

        client["https://api.spoonacular.com/recipes/complexSearch?apiKey=d9e6aa65b5df4e978b183ede18e3f384", object :
            JsonHttpResponseHandler() {
            //https://api.spoonacular.com/recipes/complexSearch?apiKey=d9e6aa65b5df4e978b183ede18e3f384&query=chicken
            override fun onSuccess(
            statusCode: Int,
            headers: Headers,
            json: JSON?
            ) {
            val response = json?.jsonObject
            if (response != null) {
                val resultsArray = response.getJSONArray("results")


                for (i in 0 until resultsArray.length()) {
                    //recipeList.add(recipeImageArray.getJSONObject(i).getString("image"))
                    //recipeName.add(recipeImageArray.getJSONObject("results").getString("name"))

                    val recipeObject = resultsArray.getJSONObject(i)

                    // Get the image URL from the object using the "url" key

                    val imageUrl = recipeObject.getString("image")

                    // Get the recipe name from the object using the "name" key
                    //val recipeNameValue = recipeObject.getString("name")
                    val recipeNameValue = recipeObject.getString("title")

                    // Now you can use imageUrl and recipeNameValue as needed
                    recipeList.add(imageUrl)
                    recipeName.add(recipeNameValue)


                    val recipeAdapter = RecipeAdapter(recipeList, recipeName)
                    recyclerViewRecipes.adapter = recipeAdapter
                    recyclerViewRecipes.layoutManager = LinearLayoutManager(this@MainActivity)
                    recyclerViewRecipes.addItemDecoration(
                        DividerItemDecoration(
                            this@MainActivity,
                            LinearLayoutManager.VERTICAL
                        )
                    )
                }

            }
        }
            override fun onFailure(
                statusCode: Int,
                headers: Headers,
                errorResponse: String,
                throwable: Throwable?
            ) {
                Log.d("Recipe Error", errorResponse)
            }
        }]

    }
}

