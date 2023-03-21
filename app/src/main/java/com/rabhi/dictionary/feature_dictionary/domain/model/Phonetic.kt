package com.rabhi.dictionary.feature_dictionary.domain.model

import com.rabhi.dictionary.feature_dictionary.data.remote.dto.License

data class Phonetic(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
)
