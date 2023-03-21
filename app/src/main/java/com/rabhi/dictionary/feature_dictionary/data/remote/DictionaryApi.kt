package com.rabhi.dictionary.feature_dictionary.data.remote

import com.rabhi.dictionary.feature_dictionary.data.remote.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {
    @GET("api.dictionaryapi.dev/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path(value="word") word:String
    ) : List<WordInfoDto>
}