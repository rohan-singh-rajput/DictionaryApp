package com.rabhi.dictionary.feature_dictionary.data.remote.dto

import android.provider.ContactsContract.CommonDataKinds.Phone
import com.rabhi.dictionary.feature_dictionary.domain.model.Phonetic

data class PhoneticDto(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
) {
    fun toPhonetic():Phonetic {
        return Phonetic(
            audio = audio,
            license = license,
            sourceUrl = sourceUrl,
            text = text,
        )
    }
}