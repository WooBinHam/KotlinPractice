package Chapter6

fun main() {
    //    supportActionBar?.let {
//        with(it) {
//            setDisplayHomeAsUpEnabled(true)
//            setHomeAsUpIndicator(R.drawable.ic_clear_white)
//        }
//    }
//
//    supportActionBar?.run {
//        setDisplayHomeAsUpEnabled(true)
//        setHomeAsUpIndicator(R.drawable.ic_clear_white)
//    }
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "default")
    val result = with(user) {
        skills = "Kotlin"
        email = "kildong@example.com"
    }
    println(user)
    println("result: $result")
}