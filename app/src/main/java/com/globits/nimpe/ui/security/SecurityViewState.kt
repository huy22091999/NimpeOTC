package com.globits.nimpe.ui.security

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.Loading
import com.airbnb.mvrx.MvRxState
import com.airbnb.mvrx.Uninitialized
import com.globits.nimpe.data.model.TokenResponse

data class SecurityViewState (
    var asyncLogin: Async<TokenResponse> = Uninitialized
    ):MvRxState{
        fun isLoading()= asyncLogin is Loading
    }