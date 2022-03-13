package com.anhkhoido.conversiak.response.observations

import com.fasterxml.jackson.annotation.JsonProperty

class Observation(d : String, fxCadUsdObservation: FxCadUsdObservation) {
    var d : String = d

    @JsonProperty(value = "FXCADUSD")
    var fxCadUsdObservation : FxCadUsdObservation = fxCadUsdObservation
}