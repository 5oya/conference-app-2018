package io.github.droidkaigi.confsched2018.model

data class Speaker(
        var name: String,
        var imageUrl: String,
        var twitterUrl: String?,
        var githubUrl: String?,
        var blogUrl: String?,
        var companyUrl: String?
)