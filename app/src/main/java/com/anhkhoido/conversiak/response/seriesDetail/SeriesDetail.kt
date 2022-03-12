package com.anhkhoido.conversiak.response.seriesDetail

import com.fasterxml.jackson.annotation.JsonProperty

class SeriesDetail(fxCadUsd: FxCadUsd) {

    @JsonProperty(value = "FXCADUSD")
    var fxCadUsd : FxCadUsd = fxCadUsd
}