/**
 * An IPv4 address is valid if it consists of four numeric segments, separated by dots (.), where:

- Each segment must be a number between 0 and 255, inclusive.
- Leading zeros in any segment (e.g., "01" or "001") are not allowed, except for the digit "0" itself.
- The address must contain exactly three dots and no extra characters.
- The function should return a Boolean value only—true if the input is a valid IPv4 address, and false otherwise.
*/

fun main() {
// Each segment must be a number between 0 and 255, inclusive.
    check(name= "(192.168.0.256) when out of range segment then return false",
        result=isValidIPv4("192.168.0.256"),
        correctResult = false)
    check(name= "(1929.0.0.25) when out of range segment then return false",
        result=isValidIPv4("1929.0.0.25"),
        correctResult = false)
    check(name= "(192.168.-1.24) when out of range segment then return false",
        result=isValidIPv4("192.168.-1.24"),
        correctResult = false)
    check(name= "(a.168.0.24) when invalid segment then return false",
        result=isValidIPv4("a.168.0.24"),
        correctResult = false)
    check(name= "(192.168.0.21.4) when more than 4 segment then return false",
        result=isValidIPv4("192.168.0.21.4"),
        correctResult = false)
    check(name= "(192.168.1) when less than 4 segment then return false",
        result=isValidIPv4("192.168.1"),
        correctResult = false)
    check(name= "() when empty IPv4 then return false",
        result=isValidIPv4(""),
        correctResult = false)
    check(name= "(192.168..1) when empty segment then return false",
        result=isValidIPv4(""),
        correctResult = false)

//    Leading zeros in any segment (e.g., "01" or "001") are not allowed, except for the digit "0" itself.
    check(name= "(192.168.01.0) when there is leading zero then return false",
        result=isValidIPv4("192.168.01.0"),
        correctResult = false)
    check(name= "(192.168.0.006) when out of range value then return false",
        result=isValidIPv4("192.168.0.006"),
        correctResult = false)

//    The address must contain exactly three dots and no extra characters.
    check(name= "(.192.168.0.255) when start with dot then return false",
        result=isValidIPv4(".192.168.0.255"),
        correctResult = false)
    check(name= "(192.168.0.255.) when end with dot then return false",
        result=isValidIPv4("192.168.0.255."),
        correctResult = false)
    check(name= "(192.168,.0.255) when have random character then return false",
        result=isValidIPv4("192.168,.0.255"),
        correctResult = false)
    check(name= "(192.+168.0.255) when have '+' sign then return false",
        result=isValidIPv4("192.+168,.0.255"),
        correctResult = false)

//* valid IPv4 addresses:
        check(name= "(192.168.0.1) when valid IPv4 then return true",
        result=isValidIPv4("192.168.0.1"),
        correctResult = true)
     check(name= "(10.0.0.255) when valid IPv4 then return true",
        result=isValidIPv4("10.0.0.255"),
        correctResult = true)
     check(name= "(255.255.255.255) when valid IPv4 then return true",
        result=isValidIPv4("255.255.255.255"),
        correctResult = true)
}

fun isValidIPv4(ip: String) : Boolean{
    return false
}

/**
 * @param name the test message that will be shown in console result
 * @param result the expected result from this test
 * @param correctResult the actual result
 */
fun check(name: String, result: Boolean, correctResult: Boolean){

    val redColor = "\u001b[31m"
    val resetColor = "\u001b[0m"

    if (result==correctResult){
        println("Success - $name")
    } else {
        println(redColor +"Failed - $name" + resetColor)
    }
}