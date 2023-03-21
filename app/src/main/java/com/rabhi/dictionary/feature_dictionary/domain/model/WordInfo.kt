package com.rabhi.dictionary.feature_dictionary.domain.model

import com.rabhi.dictionary.feature_dictionary.data.remote.dto.License
import com.rabhi.dictionary.feature_dictionary.data.remote.dto.MeaningDto

data class WordInfo(
    val license: License,
    val meaningDto: List<Meaning>,
    val sourceUrls: List<String>,
    val word: String
)
