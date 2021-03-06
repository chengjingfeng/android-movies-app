package com.popularmovies.vpaliy.popularmoviesapp.di.module

import com.popularmovies.vpaliy.data.mapper.Mapper
import com.popularmovies.vpaliy.domain.entity.TVShow
import com.popularmovies.vpaliy.domain.interactor.GetPage
import com.popularmovies.vpaliy.popularmoviesapp.di.scope.ViewScope
import com.popularmovies.vpaliy.popularmoviesapp.ui.home.HomeContract
import com.popularmovies.vpaliy.popularmoviesapp.ui.home.HomePresenter
import com.popularmovies.vpaliy.popularmoviesapp.ui.model.MediaModel
import dagger.Module
import dagger.Provides

@Module
class TVModule {
  @ViewScope
  @Provides
  fun presenter(interactor: GetPage<TVShow>, mapper: Mapper<MediaModel, TVShow>)
      : HomeContract.Presenter
      = HomePresenter(interactor, mapper)
}