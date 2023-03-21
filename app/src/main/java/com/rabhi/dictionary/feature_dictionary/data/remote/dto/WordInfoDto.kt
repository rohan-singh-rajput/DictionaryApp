package com.rabhi.dictionary.feature_dictionary.data.remote.dto

import com.rabhi.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val license: License,
    val meaning: List<MeaningDto>,
    val phoneticDto: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfo():WordInfo{
        return WordInfo(
            license = license,
            meaningDto = meaning.map { it.toMeaning() },
            word = word,
            sourceUrls = sourceUrls
        )
    }
}