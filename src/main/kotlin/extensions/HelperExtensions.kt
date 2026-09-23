package extensions


inline fun <A, B> Iterable<A>.transform(operation: (A) -> B): List<B> {
    val result = mutableListOf<B>()

    for (product in this) {
        result.add(operation(product))
    }

    return result
}


inline fun <A> Iterable<A>.filter(isSuitable: (A) -> Boolean): List<A> {

    val result = mutableListOf<A>()
    for (person in this) {
        if (isSuitable(person)) {
            result.add(person)
        }
    }
    return result
}

inline fun <A> Iterable<A>.myForeach(operation: (A) -> Unit) {
    for (item in this) {
        operation(item)
    }
}

inline fun <R, T> R.myLet(block: (R) -> T): T {
    return block(this)
}

inline fun <R> R.myAlso(block: (R) -> Unit):R {
    block(this)
    return this
}

inline fun <R> R.myApply(block: R.() -> Unit):R{
    block(this)
    return this
}

inline fun <R,T> myWith(element: R,block : R.() -> T): T {
    return element.block()
}