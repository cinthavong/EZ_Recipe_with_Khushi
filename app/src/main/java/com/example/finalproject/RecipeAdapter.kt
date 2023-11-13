package com.example.finalproject

//import android.content.Intent
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
//import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecipeAdapter(private val recipeList: MutableList<String>, private val recipeName: MutableList<String>) :
        RecyclerView.Adapter <RecipeAdapter.RecipeViewHolder>() {

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recipeImage: ImageView
        val recipeName: TextView
        val recipeButton: Button

        init {
            recipeImage = view.findViewById(R.id.recipe_Image)
            recipeName = view.findViewById(R.id.recipe_Name)
            recipeButton = view.findViewById(R.id.recipe_Button)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recipe_item, parent,false)
        return RecipeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return recipeList.size + recipeName.size

    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        Glide.with(holder.itemView)
            .load(recipeList[position])
            .centerCrop()
            .into(holder.recipeImage)

        holder.recipeName.text = recipeName[position]
//
        holder.recipeButton.setOnClickListener{
            val intent = Intent(holder.itemView.context, RecipeDetail::class.java)
            holder.itemView.context.startActivity(intent)

            //val buttonClick = findViewById<Button>(R.id.recipe_Button)
            //buttonClick.setOnClickListener {
//                val intent = Intent(this@RecipeDetail, RecipeDetail::class.java)
//                startActivity (intent)}
        //}

        //holder.recipe_button.setOnClickListener{
        //    holder.recipe_button.background=drawable@/fav
        //}

        holder.recipeImage.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Recipe at $position clicked",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}}
