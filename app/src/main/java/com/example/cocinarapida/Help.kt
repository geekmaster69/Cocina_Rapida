package com.example.cocinarapida

import android.content.res.Resources
import java.io.Serializable

data class Help(val helpTitle: String = Resources.getSystem().getString(R.string.no_help_suggestion),
                val imgHelper: Int = R.drawable.ic_help_null,
                var helpText: String = Resources.getSystem().getString(R.string.no_help_suggestion_description)  ): Serializable
