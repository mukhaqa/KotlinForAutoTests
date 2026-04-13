fun main() {
    /*print("Введите имя: " );
    val name= readLine();
    println("Ваше имя: $name") //Вывод с помощью строки ввода

    val d = (11>5) and (15>1); //оператор AND вывдит true или false
    println(d);

    val c = (4 < 5) or (9 > 10); //оператор OR вывдит true если одно = true
    println(c);


    val a = 10;
    val b = 20;
    println("Ответ: ${a+b}") */

    val errorCode = 404

    when (errorCode) {
        200 -> println("✅ Успешно")
        400 -> println("❌ Ошибка клиента")
        401 -> println("❌ Не авторизован")
        403 -> println("❌ Доступ запрещен")
        404 -> println("❌ Не найдено")
        500 -> println("❌ Ошибка сервера")
        else -> println("⚠️ Неизвестная ошибка")
    }

}

