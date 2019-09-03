# Movies

Android app that shows movies information from the [Open Movie Database API](http://www.omdbapi.com/).

## Technologies

* MVP pattern is implemented.

* Room from Android Architecture Components is used for the local cache. A flowable is used as the source of data, so changes on the database update the list.

* Retrofit 2 for accessing the Open Movie Database API. The API key must be configured on its `build.gradle` build config field. You can get a free one on http://www.omdbapi.com/apikey.aspx
