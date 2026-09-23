package profile

import org.example.profile.ProfileRepository

fun main() {
    showEmail()
}

private fun filterCollection(){

    ProfileRepository.profiles
        .sortedBy { it.firstName }
        .forEach { println(it) }
}
private fun showEmail(){

    print("Enter Id: ")
    val id = readln().toInt()

    ProfileRepository.profiles
        .find { it.id == id }?.let { println("Email: ${it.email}") } ?: println("User not found")


}
