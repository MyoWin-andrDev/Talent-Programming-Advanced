package com.learning.talentprogrammadvanced.Ch_29_Retrofit.model

import com.google.gson.annotations.SerializedName

data class PostModel(

	@SerializedName("PostModel")
	val postList: List<PostItem?>? = null
)

data class PostItem(

	@SerializedName("id")
	val id: Int? = null,

	@SerializedName("title")
	val title: String? = null,

	@SerializedName("body")
	val body: String? = null,

	@SerializedName("userId")
	val userId: Int? = null
)
