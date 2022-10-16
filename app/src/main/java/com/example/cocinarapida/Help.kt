package com.example.cocinarapida

import java.io.Serializable

data class Help(val helpTitle: String = "",val imgHelper: Int = R.drawable.espatula, var helpText: String = ""  ): Serializable
