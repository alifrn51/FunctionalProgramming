package test


fun main() {
    val contacts = mutableMapOf<String, String>(
        "Ali" to "+98-111-000-0000",
        "Saeedeh" to "+98-222-000-0000"
    )

    print("Enter name: ")
    val name= readln()
    print("Phone number: ")
    val phoneNumber = readln()

    contacts[name] = phoneNumber

    showContact(contacts )

}

private fun showContact(contacts: Map<String, String>){
    while (true){
        print("Enter name or 0 to exit: ")
        val name = readln()
        if (name == "0") break

        println(contacts[name] ?: "Not found")
    }
}
