package com.anhkhoido.conversiak.response.observations

import com.anhkhoido.conversiak.response.Terms
import com.anhkhoido.conversiak.response.seriesDetail.SeriesDetail

class ObservationResponse(terms: Terms,
                          seriesDetail: SeriesDetail,
                          observations : List<Observation>) {
    var terms : Terms = terms
    var seriesDetail : SeriesDetail = seriesDetail
    var observations : List<Observation> = observations
}