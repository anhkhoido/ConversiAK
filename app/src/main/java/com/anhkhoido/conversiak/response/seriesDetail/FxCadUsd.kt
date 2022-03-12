package com.anhkhoido.conversiak.response.seriesDetail

import com.anhkhoido.conversiak.response.Dimension

abstract class FxCadUsd(label : String, description : String, dimension: Dimension) {
    var label : String = label
    var description : String = description
    var dimension : Dimension = dimension
}