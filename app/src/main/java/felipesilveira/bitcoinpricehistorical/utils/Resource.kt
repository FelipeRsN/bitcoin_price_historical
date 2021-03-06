package felipesilveira.bitcoinpricehistorical.utils

class Resource<T> private constructor(val status: Status, val data: T?) {

    enum class Status {
        SUCCESS, ERROR, LOADING
    }

    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data)
        }
        fun <T> error(exception: Exception?): Resource<T> {
            return Resource(Status.ERROR, null)
        }
        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data)
        }
    }
}