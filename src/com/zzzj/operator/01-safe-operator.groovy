import com.zzzj.model.Person

static void main(String[] args) {
    Person person = Person.find { it.name == "zzzj" }
    // null
    println person?.name

    String name = person?.name ?: "1233"

    // 1233
    println name
}